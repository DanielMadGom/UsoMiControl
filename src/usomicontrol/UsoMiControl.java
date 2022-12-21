/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package usomicontrol;

import javafx.application.Application;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import micontrol.MiControl;

/**
 *
 * @author Daniel Madrid
 */
public class UsoMiControl extends Application {
    @Override
    public void start(Stage primaryStage) {

        MiControl control = new MiControl();
        control.setOnAction(new EventHandler<MouseEvent>(){

            @Override
            public void handle(MouseEvent event) {
                System.out.println("Has hecho click en el área roja");
            }
        });

        StackPane root = new StackPane();
        root.getChildren().add(control);

        Scene scene = new Scene(root, 300, 250);

        primaryStage.setTitle("App Uso MiControl");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        launch(args);
    }
    
}
