package com.bytehack.cryptotrack;

public class Coin {

    /*
    * BITCOIN:
    * name : bitcoin
    * Symbol : ₿ //Unicode: U+20BF HTML &#8383
    * Code : BTC, XBT
    * Exchange Rate : 60,605.30USD
    * Variation : −3,229.90 (5.06%) ↓ today
    * */

    private final String id; // Id of the coin
    private final String name; // Name of the coin
    private final String currencyCode; // Trade Name
    private double exchangeRate;
    private double variation;


    public Coin(String id, String name, String currencyCode, double exchangeRate, double variation) {
        this.id = id;
        this.name = name;
        this.currencyCode = currencyCode;
        this.exchangeRate = exchangeRate;
        this.variation = variation;
    }
}
