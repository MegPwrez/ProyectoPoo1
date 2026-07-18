
package org.gregoryjeronimo.model;

/**
 *
 * @author Gregory Jeronimo
 */
public class Rectangulo extends Superficie {
    private double base;
    private double altura;

    public Rectangulo(double base, double altura) {
        super("Rectángulo");
        this.base = base;
        this.altura = altura;
    }
    public double getBase() { return base; }
    public void setBase(double base) { this.base = base; }
    public double getAltura() { return altura; }
    public void setAltura(double altura) { this.altura = altura; }

    @Override
    public double calcularArea() {
        return base * altura;
    }
}
