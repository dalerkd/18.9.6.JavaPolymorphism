package com.kitty;

abstract public class Coin {


    abstract int getBalance();
    abstract void setBalance(int number);
    abstract String getCoin_name();
    public void set_balance(int number){
        setBalance(number);
    }
    public int check_balance() {
        return getBalance();
    }

    public void buy(int number) {
        setBalance(getBalance()+number);
        System.out.println("正在购买"+number+"个"+getCoin_name());
    }
    public void sell(int number){
        int tmp = getBalance() - number;
       System.out.println("正在卖出"+number+"个"+getCoin_name());
        if (tmp<0){
            System.out.println("卖出失败,余额不足");
        }else{
            setBalance(tmp);
        }


    }



}
