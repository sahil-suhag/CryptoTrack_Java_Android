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

    public synchronized void addCoin(String id, double value){
        Pair<String, Double> coinToAdd;
        for(int i =0 ; i<wallet.size(); i++) {
            Pair<String, Double> coin = wallet.get(i);
            if (coin.first.equals(id)){
                double total_value = coin.second + value;
                coinToAdd = new Pair<String, Double>(id,total_value);
                wallet.set(i, coinToAdd);
                return;
            }
        }
        coinToAdd = new Pair<String, Double>(id,value);
        wallet.add(coinToAdd);
    }

    public synchronized void removeCoin(String id, double value){
        for(int i =0 ; i<wallet.size(); i++) {
            Pair<String, Double> coin = wallet.get(i);
            if (coin.first.equals(id) && coin.second>=value){
                double final_value = coin.second - value;
                Pair<String, Double> coinAfterSelling = new Pair<String, Double>(id,final_value);
                wallet.set(i, coinAfterSelling);
                return;
            }
        }
    }
}
