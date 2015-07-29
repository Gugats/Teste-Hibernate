package com.mycompany.testehibernate;

import bo.Cliente;
import bo.ClienteBO;
import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;


public class MainApp extends Application {

    ClienteBO bo;
    
    @Override
    public void start(Stage stage) throws Exception {
        HBox layout = new HBox();
        Label label = new Label("Teste com Hibernate");
        
        Scene scene = new Scene(layout);
        scene.getStylesheets().add("/styles/Styles.css");
        
        bo = new ClienteBO();
        
        Cliente cli = new Cliente();
        cli.setNome("Gustavo");
        cli.setTelefone("3365383");
        bo.saveOrUpdate(cli);
        
        stage.setTitle("JavaFX and Maven");
        stage.setScene(scene);
        stage.show();
    }

    /**
     * The main() method is ignored in correctly deployed JavaFX application.
     * main() serves only as fallback in case the application can not be
     * launched through deployment artifacts, e.g., in IDEs with limited FX
     * support. NetBeans ignores main().
     *
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }

}
