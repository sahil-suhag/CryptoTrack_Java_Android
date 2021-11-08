package com.bytehack.cryptotrack;

public class TraderPojo {

    String id;
    double money;
    double coins;

    public TraderPojo(){}

    public TraderPojo(double money, double coins){
        this.money = money;
        this.coins = coins;
    }

}
