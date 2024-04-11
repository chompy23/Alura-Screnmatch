package com.aluracrsos.screnmatch.modelos;

import com.aluracursos.scremmatch.calculos.Clasificacion;

public class Episodio implements Clasificacion {
    private int numero;
    private  String nombre;
    private Serie serie;
    private int totalDeVisualizaciones;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    public int getTotalDeVisualizaciones() {
        return totalDeVisualizaciones;
    }

    public void setTotalDeVisualizaciones(int totalDeVisualizaciones) {
        this.totalDeVisualizaciones = totalDeVisualizaciones;
    }

    @Override
    public int getClasificacion() {
        if(totalDeVisualizaciones > 100) {
            return 4;
        }else{
            return 2;
        }
    }
}
