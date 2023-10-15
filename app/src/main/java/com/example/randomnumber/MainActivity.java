package com.example.randomnumber;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private Button botaoSorteio;
    private TextView resultadodoSorteio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        botaoSorteio = findViewById(R.id.botao);
        resultadodoSorteio = findViewById(R.id.resultado);

        botaoSorteio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int numero = new Random().nextInt(999);
                resultadodoSorteio.setText("Número: " + numero);

            }
        });

    }
}