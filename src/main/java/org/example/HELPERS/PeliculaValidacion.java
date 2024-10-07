package org.example.HELPERS;

import org.example.MODELOS.Pelicula;

import java.time.LocalDate;

public class PeliculaValidacion
{
    private Pelicula pelicula= new Pelicula();
    public boolean validarId(Integer id ){
        //id no puede ser un numero negativo ni mayor a 500000

        if(id<0){
            return false;
        }
        else if (id>5000000)
        {
            return false;
        }
        else {
            return true;
        }

    }
    public boolean validarNombre( String nombre){
        //Se prohiben los numeros y caracteres especiales
        return true;
    }
    public boolean validarFechaEstreno(LocalDate fecha){
        //No peliculas anteriores a 1920
        int anio= fecha.getYear();
        if (anio<1920)
        {
            return false;
        }
        else {
            return true;
        }

    }
    public boolean validarDuracion( Integer duracion){
        //Peliculas prohibidas si duran mas de 200 min
        if (duracion>200)
        {
            return false;
        }
        else {
            return true;
        }
    }
    public boolean validarSinopsis( String sinopsis){
        //No debe tener menos de 100 caracteres, ni más de 500
        if(sinopsis.length()<100  || sinopsis.length()>500)
        {
            return false;
        }
        else{
            return true;
        }
    }
}
