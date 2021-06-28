package project;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;

import java.net.URL;
import java.util.ResourceBundle;

public class NewItem implements Initializable {
    @FXML private ComboBox<String> selectItems;
    ObservableList<String> itemList= FXCollections.observableArrayList("1.Produce(Fruits & Vegetables", "2.Meat & Sea Foods", "3.Grains",
            "4.Bakery products", "5.Froze Foods", "6.Dairy Products", "7.Snacks and Sweets", "8.Beverages",
            "9.Health & Beauty(toothpaste, shampoo)", "10.Condiments & Spices");

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        selectItems.setItems(itemList);
    }


    public void saveItemOnAction(ActionEvent actionEvent) {

    }
}
