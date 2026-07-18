
package org.gregoryjeronimo.model;

/**
 *
 * @author Gregory Jeronimo
 */
public class Circulo extends Superficie {
    private double radio; // Atributo único

    public Circulo(double radio) {
        super("Círculo");
        this.radio = radio;
    }
    
    public double getRadio() { return radio; }
    public void setRadio(double radio) { this.radio = radio; }

    @Override
    public double calcularArea() {
        return Math.PI * Math.pow(radio, 2);
    }

    
}
