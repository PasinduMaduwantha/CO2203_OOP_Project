package project;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

import javax.swing.*;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception{
        try{
            Parent root = FXMLLoader.load(getClass().getResource("MainController.fxml"));
            primaryStage.setScene(new Scene(root, 600, 400));
            primaryStage.setTitle("Welcome!");
            primaryStage.show();
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public static void main(String[] args) {
        launch(args);
    }
}