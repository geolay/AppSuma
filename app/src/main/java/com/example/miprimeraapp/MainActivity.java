package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView miTextView = findViewById(R.id.textViewMain);
        EditText miEditText1 = findViewById(R.id.editTextNumber);
        EditText miEditText2 = findViewById(R.id.editTextNumber2);
        Button miButton1 = findViewById(R.id.button1);
        Button miButton2 = findViewById(R.id.button2);
        Button miButton3 = findViewById(R.id.button3);
        Button miButton4 = findViewById(R.id.button4);

        miButton1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                 int numero1 = Integer.parseInt(miEditText1.getText().toString());
                 int numero2 = Integer.parseInt(miEditText2.getText().toString());
                 int result = numero1 + numero2;
                 miTextView.setText("EL resultado es :" + result);
            }
        });

        miButton2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(miEditText1.getText().toString());
                int numero2 = Integer.parseInt(miEditText2.getText().toString());
                int result = numero1 - numero2;
                miTextView.setText("EL resultado es :" + result);
            }
        });

        miButton3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(miEditText1.getText().toString());
                int numero2 = Integer.parseInt(miEditText2.getText().toString());
                int result = numero1 * numero2;
                miTextView.setText("EL resultado es :" + result);
            }
        });

        miButton4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int numero1 = Integer.parseInt(miEditText1.getText().toString());
                int numero2 = Integer.parseInt(miEditText2.getText().toString());
                int result = numero1 / numero2;
                miTextView.setText("EL resultado es :" + result);
            }
        });


    }

    private int add(String values) {
        if (values.isEmpty()) {
            return 0;
        } else if (values.length() == 3){
            String valuesArray[] = values.split(",");
            int result = Integer.parseInt(valuesArray[0]) + Integer.parseInt(valuesArray[1]);
            return result;
        } else {
            return Integer.parseInt(values);
        }
    }
}