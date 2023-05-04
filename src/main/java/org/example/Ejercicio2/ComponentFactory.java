package org.example.Ejercicio2;

// ComponentFactory: representa una fábrica abstracta para crear componentes de un ordenador
public interface ComponentFactory {
    public CentralUnit createCentralUnit();

    public InputDevice createInputDevice();

    public OutputDevice createOutputDevice();
}
