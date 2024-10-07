package org.example.MODELOS;

import java.time.LocalDate;

public class Pelicula {
    private long id;
    private String nombre;
    private LocalDate fechaestreno;
    private Integer duracionMinutos;
    private String sinopsis;

    public Pelicula()
    {
    }

    public Pelicula(long id, String nombre, LocalDate fechaestreno, Integer duracionMinutos, String sinopsis) {
        this.id = id;
        this.nombre = nombre;
        this.fechaestreno = fechaestreno;
        this.duracionMinutos = duracionMinutos;
        this.sinopsis = sinopsis;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LocalDate getFechaestreno() {
        return fechaestreno;
    }

    public void setFechaestreno(LocalDate fechaestreno) {
        this.fechaestreno = fechaestreno;
    }

    public Integer getDuracionMinutos() {
        return duracionMinutos;
    }

    public void setDuracionMinutos(Integer duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    public String getSinopsis() {
        return sinopsis;
    }

    public void setSinopsis(String sinopsis) {
        this.sinopsis = sinopsis;
    }
}
