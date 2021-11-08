package com.bytehack.cryptotrack;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {


    MathUtils mathUtils;
    TextView traderMoney;
    TextView traderCoins;
    TraderPojo trader;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        trader = new TraderPojo(1000, 10);
        mathUtils = new MathUtils();
        mathUtils.trader = trader;

        traderCoins = findViewById(R.id.TraderCoins);
        traderMoney = findViewById(R.id.TraderMoney);
        String traderCoinString= getResources().getString(R.string.trader_coins) + String.valueOf(trader.coins);
        String traderMoneyString= getResources().getString(R.string.trader_money) + String.valueOf(trader.money);
        traderCoins.setText(traderCoinString);
        traderMoney.setText(traderMoneyString);

        Button buyCoin = findViewById(R.id.buyCoin);
        buyCoin.setOnClickListener(this);
        findViewById(R.id.buyCoinAmt).setOnClickListener(this);
        findViewById(R.id.sellCoin).setOnClickListener(this);
        findViewById(R.id.sellCoinAmt).setOnClickListener(this);


    }

    @Override
    public void onClick(View view){
        int id = view.getId();

        boolean success = false;
        switch(id){
            case R.id.buyCoin: {
                success = mathUtils.buyCoinsQuantity(3);
                break;
            }

            case R.id.buyCoinAmt: {
                success = mathUtils.buyCoinsAmount(30);
                break;
            }

            case R.id.sellCoin: {
                success = mathUtils.sellCoinsQuantity(2);
                break;
            }

            case R.id.sellCoinAmt:{
                success = mathUtils.sellCoinsAmount(20);
                break;
            }
        }
        if(success){
            String traderCoinString= getResources().getString(R.string.trader_coins) + String.valueOf(trader.coins);
            String traderMoneyString= getResources().getString(R.string.trader_money) + String.valueOf(trader.money);
            traderCoins.setText(traderCoinString);
            traderMoney.setText(traderMoneyString);
        }
    }
}