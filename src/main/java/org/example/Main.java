package org.example;

public class Main {
    public static void main(String[] args) {
        // Crear una base simple
        Base baseSimple = new BaseBuilder()
                .crearBaseSimple("Base simple", 2, 12)
                .construir();

        System.out.println("Nombre: " + baseSimple.getNombre());
        System.out.println("Número de ambulancias: " + baseSimple.getNumeroAmbulancias());
        System.out.println("Tiempo medio de asistencia: " + baseSimple.getTiempoMedioAsistencia());
        System.out.println();

        // Crear una base compuesta y agregar la base simple
        Base baseCompuesta = new BaseBuilder()
                .crearBaseCompuesta("Base compuesta")
                .agregarBase(baseSimple)
                .construir();

        System.out.println("Nombre: " + baseCompuesta.getNombre());
        System.out.println("Número de ambulancias: " + baseCompuesta.getNumeroAmbulancias());
        System.out.println("Tiempo medio de asistencia: " + baseCompuesta.getTiempoMedioAsistencia());
        System.out.println();

        // Eliminar la base simple de la base compuesta
        baseCompuesta = new BaseBuilder()
                .crearBaseCompuesta("Base compuesta")
                .eliminarBase(baseSimple)
                .construir();
        System.out.println("Nombre: " + baseCompuesta.getNombre());
        System.out.println("Número de ambulancias: " + baseCompuesta.getNumeroAmbulancias());
        System.out.println("Tiempo medio de asistencia: " + baseCompuesta.getTiempoMedioAsistencia());
    }
}
//abstract class Creator {