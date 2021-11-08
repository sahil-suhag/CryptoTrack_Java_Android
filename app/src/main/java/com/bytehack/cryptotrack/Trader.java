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

    public void addCoin(String id, double value){
        Pair<String, Double> coinToAdd = new Pair<String, Double>(id,value);
        for(int i =0 ; i<wallet.size(); i++) {
            Pair<String, Double> coin = wallet.get(i);
            if (coin.first.equals(id)){
                wallet.set(i, coinToAdd);
                return;
            }
        }
        wallet.add(coinToAdd);
    }
}
