package com.example.calcsolv;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText a;
    EditText b;
    EditText c;

    Button btn;

    TextView resText;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        resText = findViewById(R.id.result);

        btn = findViewById(R.id.calc);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                a = findViewById(R.id.koef1);
                b = findViewById(R.id.koef2);
                c = findViewById(R.id.koef3);

                int a1 = Integer.parseInt(a.getText().toString());
                int b1 = Integer.parseInt(b.getText().toString());
                int c1 = Integer.parseInt(c.getText().toString());

                double d = b1 * b1 - 4 * c1 * a1;
                if(d > 0) {
                    resText.setText("Корни: " + String.valueOf((-b1 + Math.sqrt(d)) / 2 * a1) + " " + String.valueOf((-b1 - Math.sqrt(d)) / 2 * a1));
                } else if(d == 0) {
                    resText.setText("Корень" + String.valueOf((-b1 + Math.sqrt(d)) / 2 * a1));
                } else {
                    resText.setText("нет корней");
                }
            }
        });

    }
}