package org.example.Ejercicio1;

import java.util.ArrayList;
import java.util.List;

public class BaseCompuesta implements BasesCompuestas{
    private String nombre;
    private List<Base> bases = new ArrayList<>();

    public BaseCompuesta(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public int getNumeroAmbulancias() {
        int numeroAmbulancias = 0;
        for (Base base : bases) {
            numeroAmbulancias += base.getNumeroAmbulancias();
        }
        return numeroAmbulancias;
    }

    public double getTiempoMedioAsistencia() {
        double tiempoMedioAsistencia = 0;
        for (Base base : bases) {
            tiempoMedioAsistencia += base.getTiempoMedioAsistencia();
        }
        return tiempoMedioAsistencia / bases.size();
    }

    public void addBase(Base base) {
        bases.add(base);
    }

    public void removeBase(Base base) {
        bases.remove(base);
    }
}
