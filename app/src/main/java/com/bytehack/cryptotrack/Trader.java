package com.bytehack.cryptotrack;

import java.util.ArrayList;
import java.util.List;

// Trader is user of the app
public class Trader {

    final String id; // Identifier for trader
    final List<Coin> wallet = new ArrayList<>(); // Tolal holding of the trader

    public Trader(String id) {
        this.id = id;
    }
}
