package org.example.Ejercicio1;

public class BaseSimple implements Base {
    private String nombre;
    private int numeroAmbulancias;
    private double tiempoMedioAsistencia;

    public BaseSimple(String nombre, int numeroAmbulancias, double tiempoMedioAsistencia) {
        this.nombre = nombre;
        this.numeroAmbulancias = numeroAmbulancias;
        this.tiempoMedioAsistencia = tiempoMedioAsistencia;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroAmbulancias() {
        return numeroAmbulancias;
    }

    public double getTiempoMedioAsistencia() {
        return tiempoMedioAsistencia;
    }
}