package com.example.estudiarinformatica3;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity  {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner spCiclo =  findViewById(R.id.sPciclo);
        Spinner spPoblacion =  findViewById(R.id.spPoblacion);
        Spinner spTipo = findViewById(R.id.spTipo);
        Button Borrar = findViewById(R.id.btBorrar);



        spCiclo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                    AccionMostrarTexto(spCiclo, spPoblacion, spTipo);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spPoblacion.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                AccionMostrarTexto(spCiclo, spPoblacion, spTipo);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        spTipo.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {


            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                AccionMostrarTexto(spCiclo, spPoblacion, spTipo);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });




        Borrar.setOnClickListener(view -> AccionBorrar(view, spCiclo, spPoblacion, spTipo));
    }


    public void AccionBorrar(View v, Spinner spCiclo, Spinner spPoblacion, Spinner spTipo) {
        spCiclo.setSelection(0);
        spPoblacion.setSelection(0);
        spTipo.setSelection(0);

        TextView texto =  findViewById(R.id.txRes);
        texto.setText("");


    }

    public void AccionMostrarTexto(Spinner spCiclo, Spinner spPoblacion, Spinner spTipo) {

        TextView texto =  findViewById(R.id.txRes);

        texto.setText("Voy a estudiar " + spCiclo.getSelectedItem().toString() + " en " + spPoblacion.getSelectedItem().toString() + " de manera " + spTipo.getSelectedItem().toString());

    }
}