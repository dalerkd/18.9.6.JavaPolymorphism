package com.kitty;

public class BTC extends Coin {
    private int balance;
    private String coin_name;

    public BTC() {
        balance = 0;
        coin_name = "BTC";
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
