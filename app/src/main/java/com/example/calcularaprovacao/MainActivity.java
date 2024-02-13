package com.example.calcularaprovacao;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private EditText repEditNota1;
    private EditText repEditNota2;
    private EditText repEditNota3;
    private EditText repEditNota4;
    private TextView repTextResultado;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        repEditNota1 = findViewById(R.id.editNota1);
        repEditNota2 = findViewById(R.id.editNota2);
        repEditNota3 = findViewById(R.id.editNota3);
        repEditNota4 = findViewById(R.id.editNota4);

        repTextResultado = findViewById(R.id.textResultado);
    }

    public void calcular(View view) {
        double nota1 = Double.parseDouble(repEditNota1.getText().toString());
        double nota2 = Double.parseDouble(repEditNota2.getText().toString());
        double nota3 = Double.parseDouble(repEditNota3.getText().toString());
        double nota4 = Double.parseDouble(repEditNota4.getText().toString());
        double media;

        media = (nota1 + nota2 + nota3 + nota4)/4;

        if (media >= 7.0) {
            repTextResultado.setText("ALUNO APROVADO!");
        } else {
            repTextResultado.setText("ALUNO REPROVADO!");

        }
    }
}