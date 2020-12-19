package com.example.water_app;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private CardView card;




    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        card = (CardView) findViewById(R.id.card_bill);
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openBillActivity();
            }
        });
    }

    public void openBillActivity() {
        Intent intent = new Intent(this, BillActivity.class);
        startActivity(intent);
    }
}