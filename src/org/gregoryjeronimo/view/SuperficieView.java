
package org.gregoryjeronimo.view;

import java.util.ArrayList;
/**
 *
 * @author Gregory Jeronimo
 */
public class SuperficieView extends Aplication {
    private ArrayList<Superficie> listaSuperficies = new ArrayList<>();
    
    private ListView<Superficie> listViewResumen = new ListView<>();
    private Label lblTotalCosto = new Label("Total Cotización: Q.0.00");
}
