package com.aluracursos.scremmatch.calculos;

import com.aluracrsos.screnmatch.modelos.Titulo;

public class CalculadoraDeTiempos {
    private int tiempoTotal;

    public int getTiempoTotal() {
        return tiempoTotal;
    }

    public void incluye(Titulo titulo){
        this.tiempoTotal += titulo.getDuracionEnMinutos();
    }
}
