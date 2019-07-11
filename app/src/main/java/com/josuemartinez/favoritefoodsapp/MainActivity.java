package com.josuemartinez.favoritefoodsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView mFoodsListTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Use findViewById to get a reference to the TextView from the layout
        mFoodsListTextView = findViewById(R.id.foods_list_names);

        String[] foodsNames = FoodsBox.getFoodsNames();

        for (String foodsName : foodsNames){
            mFoodsListTextView.append(foodsName + "\n\n\n");
        }

    }
}
