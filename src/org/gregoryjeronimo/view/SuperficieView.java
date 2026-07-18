
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
        
        TextField txtRadio = new TextField();
        TextField txtBase = new TextField();
        TextField txtAltura = new TextField();

       
        comboFormas.setOnAction(e -> {
            gridFormulario.getChildren().clear();
            String seleccion = comboFormas.getValue();

            if ("Circulo".equals(seleccion)) {
                gridFormulario.add(new Label("Radio (m):"), 0, 0);
                gridFormulario.add(txtRadio, 1, 0);
            } else if ("Rectangulo".equals(seleccion) || "Triangulo".equals(seleccion)) {
                gridFormulario.add(new Label("Base (m):"), 0, 0);
                gridFormulario.add(txtBase, 1, 0);
                gridFormulario.add(new Label("Altura (m):"), 0, 1);
                gridFormulario.add(txtAltura, 1, 1);
            }
        });

    
    
    
    
    
    
    
    
    
    
    
    
    
    
    }
