package project.controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import javax.swing.*;
import java.net.URL;
import java.util.ResourceBundle;

public class MainController implements Initializable {
    public Button newItem;
    public Button newCategory;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void NewItemOnAction(ActionEvent actionEvent) {
        Stage stage=new Stage();
        stage.setTitle("New Item");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/NewItem.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }

    public void NewCategoryOnAction(ActionEvent actionEvent) {
        Stage stage=new Stage();
        stage.setTitle("New Category");
        try {
            //stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/Categories.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }

    public void showOnAction(ActionEvent actionEvent) {
        Stage stage=new Stage();
        stage.setTitle("Store");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/ShowItems.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }

    public void supplyOnAction(ActionEvent actionEvent) {
        Stage stage=new Stage();
        stage.setTitle("Supply");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/supply/SupplyMain.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }
}
