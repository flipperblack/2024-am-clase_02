package ar.edu.davinci.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import calculator.Calculator;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Calculator calculator = new Calculator();
        int resultadoResta = calculator.restar( primero: 2, segundo: 1);
        //TODO: feat: imprimir resultado
        float resultadoDivision = calculator.dividir( primero: 2, segundo: 1);
        //TODO: feat: imprimir resultado
    }
}
