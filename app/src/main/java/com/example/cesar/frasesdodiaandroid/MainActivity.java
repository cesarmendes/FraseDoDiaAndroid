package com.example.cesar.frasesdodiaandroid;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import java.util.Random;


import java.util.Random;

public class MainActivity extends AppCompatActivity {
    private TextView txtFrase;
    private Button btnNovaFrase;

    private String[] frases = new String[]{"frase1", "frase2", "frase3"};
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtFrase = (TextView) findViewById(R.id.txtFrase);
        btnNovaFrase = (Button)findViewById(R.id.btnNovaFrase);

        btnNovaFrase.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int total = frases.length;
                Random random = new Random();
                String frase = frases[random.nextInt(total)];
                txtFrase.setText(frase);
            }
        });
    }
}
