package com.bytehack.cryptotrack;

public class Coin {

    private final String id; // Id of the coin
    private final String name; // Name of the coin

    private double quantity; // Quantity held by the user

    public Coin(String id, String name) {
        this.id = id;
        this.name = name;
    }
}
