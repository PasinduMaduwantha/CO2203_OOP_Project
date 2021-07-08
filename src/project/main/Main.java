package project.main;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;


public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try{
            Parent root = FXMLLoader.load(getClass().getResource("../welcome_screen/welcome.fxml"));
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.setTitle("Welcome!");
            primaryStage.show();

        }
        catch (Exception e){
            System.out.println("Error! in Main.java");
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}
