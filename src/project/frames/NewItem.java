package project.frames;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import project.entity.Brands;

import javax.swing.*;
import java.net.URL;
import java.sql.*;
import java.util.ResourceBundle;

//import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import static java.lang.System.exit;

public class NewItem implements Initializable {

    @FXML private Label showBrand;
    @FXML private Label measure;
    @FXML private Label lblSelect;
    @FXML private TextField itemId;
    @FXML private TextField itemName;
    @FXML private TextField noOfItems;
    @FXML private TextField retailPrice;
    @FXML private TextField discounts;
    @FXML private TextField promotions;
    @FXML private TextField finalPrice;
    @FXML private ComboBox selectItems;
    @FXML private ComboBox comboBrand;
    ObservableList<String> itemList= FXCollections.observableArrayList("Produce(Fruits & Vegetables", "Meat & Sea Foods", "Grains",
            "Bakery products", "Frozen Foods", "Dairy Products", "Snacks and Sweets", "Beverages",
            "Health & Beauty(toothpaste, shampoo)", "Condiments & Spices");

    //here we make 3 brand for test
    Brands brands1=new Brands("10", "Brand01", true);
    Brands brands2=new Brands("11", "Brand02", false);
    Brands brands3=new Brands("12", "Brand03", true);

    ObservableList<String> brandList= FXCollections.observableArrayList(brands1.getBrand_Name(), brands2.getBrand_Name(), brands3.getBrand_Name());

@Override
public void initialize(URL location, ResourceBundle resources) {
    selectItems.setItems(itemList);
    comboBrand.setItems(brandList);

}
    float retPrice;
    float discount;
    float promotion;


    public void saveItemOnAction(ActionEvent actionEvent) {
        try {
            JOptionPane.showMessageDialog(null,"Item Saved");

        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    //final price Set automatically
    public void clickOnAction(MouseEvent mouseEvent) {

        String retail_Price=retailPrice.getText();
        String dis=discounts.getText();
        String promo=promotions.getText();
        //Set final price automatically
        float retPrice=Integer.parseInt(retail_Price);
        float discount=Integer.parseInt(dis);
        float promotion=Integer.parseInt(promo);
        float final_Price= retPrice-(retPrice*discount/100)-promotion;
        String.format(".2%f", final_Price);
        try {
            finalPrice.setText(String.valueOf(final_Price));
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void setCategory(ActionEvent actionEvent) {
        try {
            String str=selectItems.getSelectionModel().getSelectedItem().toString();

            if (str.equals("Produce(Fruits & Vegetables") || str.equals("Meat & Sea Foods" )|| str.equals("Grains")){
                measure.setText("grams");
            }else{
                measure.setText("items");
            }
            lblSelect.setText(str);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void showBrand(ActionEvent actionEvent) {
        try {
            String str=comboBrand.getSelectionModel().getSelectedItem().toString();
            showBrand.setText(str);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }
}



//        try{
//            Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/stock?autoReconnect=true&useSSL=false", "root", "12345");
//            PreparedStatement statement=connection.prepareStatement("INSERT INTO items(item_id, item_name, quantity, retail_Price, discounts, promotions, final_price) values (?,?,?,?,?,?,?)");
//            statement.setString(1, item_Id);
//            statement.setString(2, item_Name);
//            statement.setString(3, no_Of_items);
//            statement.setString(4, retail_Price);
//            statement.setString(5, dis);
//            statement.setString(6, promo);
//            statement.setString(7, String.valueOf(final_Price));
//            int status=statement.executeUpdate();
//
//            if (status==1){
//                JOptionPane.showMessageDialog(null, "Record Added!");
//                itemId.setText("");
//                itemName.setText("");
//                noOfItems.setText("");
//                retailPrice.setText("");
//                promotions.setText("");
//                discounts.setText("");
//                finalPrice.setText("");
//            }
//            else JOptionPane.showMessageDialog(null, "Record Added Failed!");
//
//
//        }
//        catch (Exception e){
//            JOptionPane.showMessageDialog(null, e);
//        }