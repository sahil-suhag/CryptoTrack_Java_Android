package com.bytehack.cryptotrack;

public class MathUtils {

    double coinRate = 5;  // Rate of selling/ buying one coin
    TraderPojo trader;

    public boolean sellCoinsQuantity(double quantity){
        if(trader.coins >=quantity) {
            double sellingPrice = coinRate * quantity;
            trader.coins -= quantity;
            trader.money += sellingPrice;
            return true;
        } else return false;
    }

    public boolean sellCoinsAmount(double amount){
        double coinsSold = amount/coinRate;
        if (trader.coins >=coinsSold) {

            trader.coins -= coinsSold;
            trader.money += amount;
            return true;

        } else return false;

    }

    public boolean buyCoinsQuantity(double quantity){
        double buyingPrice = coinRate*quantity;

        if (trader.money>=buyingPrice){
            trader.coins += quantity;
            trader.money -= buyingPrice;
            return true;
        } return false;

    }

    public boolean buyCoinsAmount(double amount){
        if (trader.money>=amount){
            double coinsBought = amount/coinRate;
            trader.coins += coinsBought;
            trader.money -= amount;
            return true;
        } return false;

    }


}
