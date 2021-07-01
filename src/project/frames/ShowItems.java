package project.frames;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import project.entity.ShowTable;
import javax.swing.*;
import java.net.URL;
import java.sql.*;
import java.util.ArrayList;
import java.util.ResourceBundle;


public class ShowItems implements Initializable {

    @FXML
    private TableView<ShowTable> itemTable;

    @Override
    public void initialize(URL location, ResourceBundle resources) {
//        itemTable.getColumns().get(0).setCellValueFactory(new PropertyValueFactory<>("itemId"));
//        itemTable.getColumns().get(1).setCellValueFactory(new PropertyValueFactory<>("itemName"));
//        itemTable.getColumns().get(2).setCellValueFactory(new PropertyValueFactory<>("qty"));
//        itemTable.getColumns().get(3).setCellValueFactory(new PropertyValueFactory<>("retailPrice"));
//        itemTable.getColumns().get(4).setCellValueFactory(new PropertyValueFactory<>("dis"));
//        itemTable.getColumns().get(5).setCellValueFactory(new PropertyValueFactory<>("promo"));
//        itemTable.getColumns().get(6).setCellValueFactory(new PropertyValueFactory<>("finalPrice"));
        try {
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?autoReconnect=true&useSSL=false", "user", "12345");
//            Statement statement=connection.createStatement();
//            ResultSet resultSet = statement.executeQuery("SELECT * FROM items");
//            ArrayList<ShowTable> list = new ArrayList<>();
//            while (resultSet.next()){
//                ShowTable table = new ShowTable();
//
//                table.setItemId(resultSet.getString(1));
//                table.setItemName(resultSet.getString(2));
//                table.setQty(resultSet.getFloat(3));
//                table.setRetailPrice(resultSet.getFloat(4));
//                table.setDis(resultSet.getFloat(5));
//                table.setPromo(resultSet.getFloat(6));
//                table.setFinalPrice(resultSet.getFloat(7));
//                list.add(table);
//            }
//           itemTable.setItems(FXCollections.observableArrayList(list));
            JOptionPane.showMessageDialog(null, "OK!");

        } catch (Exception e) {

            JOptionPane.showMessageDialog(null, e);
        }
    }
}
