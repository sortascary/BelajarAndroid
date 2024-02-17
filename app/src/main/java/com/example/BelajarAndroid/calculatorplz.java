package com.example.BelajarAndroid;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Button;

public class calculatorplz extends AppCompatActivity {


    EditText uno;
    EditText dos;
    TextView result;
    Button equationsimplifier;
    Spinner function;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculatorplz);
        uno = findViewById(R.id.editTextNumber1);
        dos = findViewById(R.id.editTextNumber2);
        result = findViewById(R.id.textView);
        function = findViewById(R.id.spinner);
        equationsimplifier = findViewById(R.id.button);
        equationsimplifier.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int variableofthefirstvalueinaDecimalformat = Integer.parseInt(uno.getText().toString());
                int variableofthesecondvalueinaDecimalformat = Integer.parseInt(dos.getText().toString());
                int theresolvedefinedbythealgorithmscaculations = 0;
                if (function.getSelectedItem() != "" && Integer.toString(variableofthefirstvalueinaDecimalformat).isEmpty() == false && Integer.toString(variableofthesecondvalueinaDecimalformat).isEmpty() == false){
                switch (function.getSelectedItem().toString()) {
                    case "➕":
                        theresolvedefinedbythealgorithmscaculations = variableofthefirstvalueinaDecimalformat + variableofthesecondvalueinaDecimalformat;
                        result.setText(Integer.toString(theresolvedefinedbythealgorithmscaculations));
                        break;
                    case "➖":
                        theresolvedefinedbythealgorithmscaculations = variableofthefirstvalueinaDecimalformat - variableofthesecondvalueinaDecimalformat;
                        result.setText(Integer.toString(theresolvedefinedbythealgorithmscaculations));
                        break;
                    case "➗":
                        if (variableofthesecondvalueinaDecimalformat != 0) {
                            double theresolvedefinedbythealgorithmscaculation = (double) variableofthefirstvalueinaDecimalformat / variableofthesecondvalueinaDecimalformat;
                            result.setText(Double.toString(theresolvedefinedbythealgorithmscaculation));
                        } else {

                        }
                        break;
                    case "✖":
                        theresolvedefinedbythealgorithmscaculations = variableofthefirstvalueinaDecimalformat * variableofthesecondvalueinaDecimalformat;
                        result.setText(Integer.toString(theresolvedefinedbythealgorithmscaculations));
                        break;
                    }
                }
            }
        });
    }
}