package com.example.gabriela.evaluacion;

import java.io.Serializable;

/**
 * Created by Gabriela on 16/09/2017.
 */

public class EstudianteClase implements Serializable {
    String nombre;
    String codigo;
    String materia;
    Double parcial1;
    Double parcial2;
    Double parcial3;
    Double promedio;

    public EstudianteClase(String nombre, String codigo, String materia, Double parcial1, Double parcial2, Double parcial3) {
        this.nombre = nombre;
        this.codigo = codigo;
        this.materia = materia;
        this.parcial1 = parcial1;
        this.parcial2 = parcial2;
        this.parcial3 = parcial3;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }

    public Double getParcial1() {
        return parcial1;
    }

    public void setParcial1(Double parcial1) {
        this.parcial1 = parcial1;
    }

    public Double getParcial2() {
        return parcial2;
    }

    public void setParcial2(Double parcial2) {
        this.parcial2 = parcial2;
    }

    public Double getParcial3() {
        return parcial3;
    }

    public void setParcial3(Double parcial3) {
        this.parcial3 = parcial3;
    }

    public Double getPromedio() {
        return promedio;
    }

    public void setPromedio(Double promedio) {
        this.promedio = promedio;
    }
}
