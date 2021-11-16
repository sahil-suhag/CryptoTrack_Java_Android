package com.bytehack.cryptotrack;

import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

import java.lang.reflect.Type;
import java.util.Collection;
import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Gson gson = new Gson();

        Type collectionType = new TypeToken<Collection<Coin>>(){}.getType();
        Collection<Coin> boxSearchCollection = gson.fromJson(Data.DATA, collectionType);
    }

    @Override
    public void onClick(View view){
    }
}