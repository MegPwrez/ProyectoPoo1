
package org.gregoryjeronimo.model;

/**
 *
 * @author Grregory Jeronimo
 */
public abstract class Superficie {
    private String tipo; // Atributo común

    public Superficie(String tipo) {
        this.tipo = tipo;
    }
    public String getTipo() {
        return tipo;
    }
   public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public abstract double calcularArea();
    
  

    @Override
    public String toString() {
        return String.format("%s - Área: %.2f m²", tipo, calcularArea());
    }

    

}
