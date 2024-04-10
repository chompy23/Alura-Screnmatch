import com.aluracrsos.screnmatch.modelos.Pelicula;
import com.aluracrsos.screnmatch.modelos.Serie;
import com.aluracursos.scremmatch.calculos.CalculadoraDeTiempos;


public class Principal {
    public static void main(String[] args) {
        Pelicula miPelicula = new Pelicula();
        miPelicula.setNombre("Encanto")  ;
        miPelicula.setFechaDeLanzamiento(2021);
        miPelicula.setDuracionEnMinutos(120);
        miPelicula.setIncluidoEnElPlan(true);

        miPelicula.datosPorTitulo();
        miPelicula.evalua(6.8);
        miPelicula.evalua(8.5);
        miPelicula.evalua(9.8);
        System.out.println(miPelicula.getTotalDeLasEvaluaciones());
        System.out.println(miPelicula.calculaMedia());

        Pelicula otraPelicula = new Pelicula();
        otraPelicula.setNombre("Matrix")  ;
        otraPelicula.setFechaDeLanzamiento(1998);
        otraPelicula.setDuracionEnMinutos(180);
        otraPelicula.setIncluidoEnElPlan(true);

        otraPelicula.datosPorTitulo();
        otraPelicula.evalua(8.8);
        otraPelicula.evalua(8.2);
        otraPelicula.evalua(7.8);
        System.out.println(otraPelicula.getTotalDeLasEvaluaciones());
        System.out.println(otraPelicula.calculaMedia());

        Serie casaDragon = new Serie();
        casaDragon.setNombre("La casa del Dragon");
        casaDragon.setFechaDeLanzamiento(2022);
        casaDragon.setTemporadas(1);
        casaDragon.setMinutosPorEpisodio(50);
        casaDragon.setEpisodioPorTemporada(10);
        casaDragon.datosPorTitulo();

        CalculadoraDeTiempos calculadora = new CalculadoraDeTiempos();
        calculadora.incluye(miPelicula);
        calculadora.incluye(otraPelicula);
        System.out.println(calculadora.getTiempoTotal());
        calculadora.incluye(casaDragon);
        System.out.println(calculadora.getTiempoTotal());


    }
}