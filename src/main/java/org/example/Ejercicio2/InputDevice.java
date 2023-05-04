package org.example.Ejercicio2;

// InputDevice: representa un dispositivo de entrada del ordenador
public interface InputDevice extends Component {
    public String getConnectorType();

    public int[] getValidPorts();
}
