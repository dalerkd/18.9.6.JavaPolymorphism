package com.kitty;

public class CoinManage {
    private Coin btc = null;
    private Coin etc = null;

    public CoinManage() {
        btc = new BTC();
        etc = new ETC();
    }

    private Coin select(String coinName) throws Exception {
        switch (coinName) {
            case "btc":
            case "BTC":
                return btc;
            case "etc":
            case "ETC":
                return etc;
            default:
                throw new Exception("对不支持的币种进行操作:" + coinName);
        }
    }

    public void buy(String coinName, int number) throws Exception {
        Coin co =  select(coinName);
        co.buy(number);
    }

    public void sell(String coinName, int number) throws Exception {
        Coin co = select(coinName);
        co.sell(number);
    }

    public int check_balance(String coinName) throws Exception {
        Coin co = select(coinName);
        return co.check_balance();
    }


}
