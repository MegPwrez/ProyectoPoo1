
package org.gregoryjeronimo.view;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import modelo.Superficie;
import modelo.Circulo;
import modelo.Rectangulo;
import modelo.Triangulo;
import java.util.ArrayList;
/**
 *
 * @author Gregory Jeronimo
 */
public class SuperficieView extends Aplication {
    private ArrayList<Superficie> listaSuperficies = new ArrayList<>();
    
    private ListView<Superficie> listViewResumen = new ListView<>();
    private Label lblTotalCosto = new Label("Total Cotización: Q.0.00");

    private static final double PRECIO_METRO_CUADRADO = 50.00;

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("La Constructora - Cálculo de Materiales");

     
        TabPane tabPane = new TabPane();
        Tab tabRegistro = new Tab("Registro");
        Tab tabResumen = new Tab("Resumen");
        tabRegistro.setClosable(false);
        tabResumen.setClosable(false);
        
        VBox rootRegistro = new VBox(15);
        rootRegistro.setPadding(new Insets(20));

        Label lblSeleccion = new Label("Seleccione el tipo de superficie:");
        ComboBox<String> comboFormas = new ComboBox<>();
        comboFormas.getItems().addAll("Circulo", "Rectangulo", "Triangulo");
        
        GridPane gridFormulario = new GridPane();
        gridFormulario.setHgap(10);
        gridFormulario.setVgap(10);
}
