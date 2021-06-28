package project.frames;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextField;

import javax.swing.*;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

public class NewItem implements Initializable {
    @FXML private TextField itemId;
    @FXML private TextField itemName;
    @FXML private TextField noOfItems;
    @FXML private TextField retailPrice;
    @FXML private TextField discounts;
    @FXML private TextField promotions;
    @FXML private TextField finalPrice;
    @FXML private Button saveItem;
    @FXML private ComboBox<String> selectItems;
    ObservableList<String> itemList= FXCollections.observableArrayList("1.Produce(Fruits & Vegetables", "2.Meat & Sea Foods", "3.Grains",
            "4.Bakery products", "5.Froze Foods", "6.Dairy Products", "7.Snacks and Sweets", "8.Beverages",
            "9.Health & Beauty(toothpaste, shampoo)", "10.Condiments & Spices");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        selectItems.setItems(itemList);
    }


    public void saveItemOnAction(ActionEvent actionEvent) {
        String item_Id=itemId.getText();
        String item_Name=itemName.getText();
        String no_Of_items=noOfItems.getText();
        String retail_Price=retailPrice.getText();
        String dis=discounts.getText();
        String promo=promotions.getText();
        String price=finalPrice.getText();

        try{
            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?autoReconnect=true&useSSL=false", "user", "12345");
            PreparedStatement statement=connection.prepareStatement("INSERT INTO items(itemId, itemName, no_Of_Items, retail_Price, discount, promotions, final_price) values (?,?,?,?,?,?,?)");
            statement.setString(1, item_Id);
            statement.setString(2, item_Name);
            statement.setString(3, no_Of_items);
            statement.setString(4, retail_Price);
            statement.setString(5, dis);
            statement.setString(6, promo);
            statement.setString(7, price);
            int status=statement.executeUpdate();

            if (status==1){
                JOptionPane.showMessageDialog(null, "Record Added!");
                itemId.setText("");
                itemName.setText("");
                noOfItems.setText("");
                retailPrice.setText("");
                promotions.setText("");
                discounts.setText("");
                finalPrice.setText("");
            }
            else JOptionPane.showMessageDialog(null, "Record Added Failed!");


        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }

    }
}
