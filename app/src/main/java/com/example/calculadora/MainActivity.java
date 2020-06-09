package com.example.calculadora;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    EditText tfnum1, tfnum2, tfoperador;
    TextView res;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void calcular(View view){
        tfnum1 = findViewById(R.id.num1);
        tfnum2 = findViewById(R.id.num2);
        tfoperador = findViewById(R.id.operador);
        res= findViewById(R.id.resultado);
        double x= Double.parseDouble(tfnum1.getText().toString());
        double y= Double.parseDouble(tfnum2.getText().toString());
        String operador= tfoperador.getText().toString();
        char op= operador.charAt(0);

        switch (op)
        {
            case '+': res.setText ("valor = " +(x+y));
                break;

            case '-': res.setText ("valor = " +(x-y));
                break;

            case '*': res.setText ("valor = " +(x*y));
                break;

            case '/': res.setText ("valor = " +(x/y));
                break;

            default: res.setText ("Operador inválido: " +op);

        }
    }


}