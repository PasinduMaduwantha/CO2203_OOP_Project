package project.frames.supply;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import javax.swing.*;
import java.time.LocalDate;

public class SupplyMain {
    String spId="null", itName="null", vehid="null", qty="null", org="null", arrdate="null", depdate="null";
    @FXML protected TextField supplyId;
    @FXML protected  TextField itemName;
    @FXML protected  TextField vehicleId;
    @FXML protected  TextField originName;
    @FXML protected Button addSupply;
    @FXML protected  TextField noOfItems;
    @FXML protected Label measure;
    @FXML protected DatePicker arrivalDate;
    @FXML protected  DatePicker departureDate;
    @FXML protected  Label statusShow;


    public void addSupplyOnAction(ActionEvent actionEvent) {
        spId=supplyId.getText();
        itName=itemName.getText();
        vehid=vehicleId.getText();
        org=originName.getText();
        qty=noOfItems.getText();
        System.out.println("Supply Id: "+spId);
        System.out.println("Item Name: "+itName);
        System.out.println("Quantity: "+qty);
        System.out.println("Vehicle Id: "+vehid);
        System.out.println("Origin: "+org);
        System.out.println("Departure Date: "+depdate);
        System.out.println("Arrival Date: "+arrdate);
    }

    public void pickArrivalDate(ActionEvent actionEvent) {
        LocalDate localArDate=arrivalDate.getValue();
        arrdate=localArDate.toString();
    }

    public void departureOnAction(ActionEvent actionEvent) {
        LocalDate localDepDate=departureDate.getValue();
        depdate=localDepDate.toString();
    }


    public void localSupplyOnAction(ActionEvent actionEvent) {
        Stage stage=new Stage();
        stage.setTitle("Local Supply");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/supply/SupplyLocal.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }

    public void internationalSupplyOnAction(ActionEvent actionEvent) {
        Stage stage=new Stage();
        stage.setTitle("International Supply");
        try {
            stage.setScene(new Scene(FXMLLoader.load(this.getClass().getResource("/project/seens/supply/SupplyInternational.fxml"))));
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        stage.show();
    }

    public void clearinternationalSupplyOnAction(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "International Supply Deleted");
    }

    public void clearlocalSupplyOnAction(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Local Supply Deleted");
    }
}
