package com.example.aplicativodesorteio;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    //essa MainActivity é a nossa classe java onde é feita toda a lógica do aplicativo
    //já a activity_main é a nossa parte de design
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sortear(View v) {
        TextView texto = findViewById(R.id.textResultado);
        int x = new Random().nextInt(11);

        texto.setText("Número: " + x);
    }
}