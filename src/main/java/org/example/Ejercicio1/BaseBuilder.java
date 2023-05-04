package org.example.Ejercicio1;

public class BaseBuilder {
    private Base base;

    public BaseBuilder crearBaseSimple(String nombre, int numeroAmbulancias, double tiempoMedioAsistencia) {
        base = new BaseSimple(nombre, numeroAmbulancias, tiempoMedioAsistencia);
        return this;
    }

    public BaseBuilder crearBaseCompuesta(String nombre) {
        base = new BaseCompuesta(nombre);
        return this;
    }

    public BaseBuilder agregarBase(Base base) {
        ((BaseCompuesta) this.base).addBase(base);
        return this;
    }

    public BaseBuilder eliminarBase(Base base) {
        ((BaseCompuesta) this.base).removeBase(base);
        return this;
    }

    public Base construir() {
        return base;
    }
}



