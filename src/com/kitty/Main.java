package com.kitty;

public class Main {

    public static void main(String[] args) {
    CoinManage cm = new CoinManage();
        try {
            cm.buy("BTC",200);
            System.out.println("账上剩余"+cm.check_balance("BTC"));
            cm.sell("BTC",300);
            System.out.println("账上剩余"+cm.check_balance("BTC"));
            cm.sell("BTC",199);
            System.out.println("账上剩余:"+cm.check_balance("BTC"));
        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
