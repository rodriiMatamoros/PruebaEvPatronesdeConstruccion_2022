package org.example.Ejercicio2;

public class OutputDeviceFactory implements ComponentFactory {
    public CentralUnit createCentralUnit() {
        return new BasicCentralUnit();
    }
    public InputDevice createInputDevice(String connectorType, int[] validPorts) {
        return null;
    }
    public OutputDevice createOutputDevice(int[] validPorts) {
        return new BasicOutputDevice(validPorts);
    }
}
