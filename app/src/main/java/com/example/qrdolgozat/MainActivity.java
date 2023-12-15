package com.example.qrdolgozat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button scanelButton = findViewById(R.id.scanelButton);
        Button listazButton = findViewById(R.id.listazButton);
        TextView szoveg = findViewById(R.id.szovegText);
        szoveg.setText("Aha");

        listazButton.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                startActivity(new Intent(MainActivity.this, ListaAdatok.class));
            }
        });
    }



}