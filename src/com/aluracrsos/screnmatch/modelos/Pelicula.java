package com.aluracrsos.screnmatch.modelos;

public class Pelicula {
    public String nombre;
    public int fechaDeLanzamiento;
    public int duracionEnMinutos;
    public boolean incluidoEnElPlan;
    private double sumaDeLasEvaluaciones;
    private int totalDeLasEvaluaciones;

        public int getTotalDeLasEvaluaciones(){
        return totalDeLasEvaluaciones;
    }

    public double getSumaDeLasEvaluaciones(){
        return sumaDeLasEvaluaciones;
    }

        public void datosDeLaPelicula(){
        System.out.println(" La pelicula es : " + nombre);
        System.out.println(" Su Fecha de lanzamiento es : "+ fechaDeLanzamiento);
        System.out.println(" Su Duración en Minutos es :"+ duracionEnMinutos);
    }

     public void evalua(double nota){
        sumaDeLasEvaluaciones += nota;
        totalDeLasEvaluaciones++;
    }

    public double calculaMedia(){
        return sumaDeLasEvaluaciones / totalDeLasEvaluaciones;

    }
}
