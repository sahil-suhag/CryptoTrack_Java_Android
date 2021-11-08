package com.bytehack.cryptotrack;

import android.util.Pair;

import java.util.ArrayList;
import java.util.List;

// Trader is user of the app
public class Trader {

    final String id; // Identifier for trader

    final List<Pair<String, Double>> wallet = new ArrayList<>(); // Total holding of the trader

    public Trader(String id) {
        this.id = id;
    }
}
