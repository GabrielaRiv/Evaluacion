package com.example.gabriela.evaluacion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    public static int GUARDADO = 47;
    private Button nuevoEst, listaEst;
    public static ArrayList<EstudianteClase> lsvEstudiante = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        nuevoEst = (Button) findViewById(R.id.nuevoEst);
        listaEst = (Button) findViewById(R.id.listaEst);

        nuevoEst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Estudiante.class);
                startActivityForResult(intent, 24);
            }
        });

        listaEst.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, ListaEstudiante.class);
                startActivity(intent);
            }
        });
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data){
        super.onActivityResult(requestCode, resultCode, data);
        if(requestCode == 24 && resultCode == Activity.RESULT_OK){
            EstudianteClase estudiante = (EstudianteClase)data.getSerializableExtra("EST");
            lsvEstudiante.add(estudiante);
            listaEst.setText("Lista Estudiantes"+lsvEstudiante.size());

        }
    }
}
