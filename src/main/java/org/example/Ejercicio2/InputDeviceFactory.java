package org.example.Ejercicio2;

public class InputDeviceFactory implements ComponentFactory {
    public CentralUnit createCentralUnit() {
        return new BasicCentralUnit();
    }
    public InputDevice createInputDevice(String connectorType, int[] validPorts) {
        return new BasicInputDevice(connectorType, validPorts);
    }
    public OutputDevice createOutputDevice(int[] validPorts) {
        return null;
    }
}
