package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView miTextView = findViewById(R.id.textViewMain);

        int resultado = add("");
        Log.d("RESULTADO1", String.valueOf(resultado));

        resultado = add("3");
        Log.d("RESULTADO2", String.valueOf(resultado));
        miTextView.setText("El resultado es : " + resultado);

        resultado = add("3,5");
        Log.d("RESULTADO3", String.valueOf(resultado));


        miTextView.setText("El resultado es : " + resultado);



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