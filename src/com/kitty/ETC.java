package com.kitty;

public class ETC extends Coin {
    private int balance;
    private String coin_name;

    public ETC() {
        balance = 0;
        coin_name = "ETC";
    }

    @Override
    protected int getBalance() {
        return balance;
    }

    @Override
    protected void setBalance(int number) {
        balance = number;
    }

    protected String getCoin_name() {
        return coin_name;
    }

}
