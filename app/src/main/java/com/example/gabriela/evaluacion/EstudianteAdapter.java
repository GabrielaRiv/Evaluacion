package com.example.gabriela.evaluacion;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.List;

public class EstudianteAdapter extends ArrayAdapter<Estudiante> {

    public EstudianteAdapter(Context context, List<Estudiante> objects) {
        super(context, 0, objects);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        Estudiante estudiante = getItem(position);
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_estudiante, parent, false);
        }
        TextView lblNumero = (TextView) convertView.findViewById(R.id.lblNumero);
        TextView lblNombre = (TextView) convertView.findViewById(R.id.lblNombre);
        TextView lblCodigo = (TextView) convertView.findViewById(R.id.lblCodigo);
        TextView lblPromedio = (TextView) convertView.findViewById(R.id.lblPromeio);

        lblNumero.setText(estudiante.nombre);
        lblNombre.setText(estudiante.codigo);
        lblCodigo.setText(estudiante.materia);
        lblPromedio.setText(estudiante.nombre);
        return convertView;
    }
}

