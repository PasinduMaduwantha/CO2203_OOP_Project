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

import static com.sun.deploy.uitoolkit.ToolkitStore.dispose;
import static java.lang.System.exit;

public class NewItem implements Initializable {
    private float final_Price=0;
    private String id="null", name="null", qty="null", rPrice="null", dis="null", promo ="null";
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
    //here we make 10 category for test
    Categories newCategory1=new Categories("101","Produce(Fruits & Vegetables", "grams");
    Categories newCategory2=new Categories("102","Meat & Sea Foods", "grams");
    Categories newCategory3=new Categories("103","Grains", "grams");
    Categories newCategory4=new Categories("104","Bakery products", "items");
    Categories newCategory5=new Categories("105","Frozen Foods", "items");
    Categories newCategory6=new Categories("106","Dairy Products", "items");
    Categories newCategory7=new Categories("107","Snacks and Sweets", "items");
    Categories newCategory8=new Categories("108","Beverages", "items");
    Categories newCategory9=new Categories("109","Health & Beauty(toothpaste, shampoo)", "items");
    Categories newCategory10=new Categories("110","Condiments & Spices", "items");
    //here we make 3 brand for test
    Brands brands1=new Brands("10", "Brand01", true);
    Brands brands2=new Brands("11", "Brand02", false);
    Brands brands3=new Brands("12", "Brand03", true);

    ObservableList<String> brandList= FXCollections.observableArrayList(brands1.getBrand_Name(), brands2.getBrand_Name(), brands3.getBrand_Name());
    ObservableList<String> itemList= FXCollections.observableArrayList(
            newCategory1.getCategory_Name()
            ,newCategory2.getCategory_Name()
            ,newCategory3.getCategory_Name()
            ,newCategory4.getCategory_Name()
            ,newCategory5.getCategory_Name()
            ,newCategory6.getCategory_Name(),
            newCategory7.getCategory_Name(),
            newCategory8.getCategory_Name(),
            newCategory9.getCategory_Name()
            , newCategory10.getCategory_Name());
@Override
public void initialize(URL location, ResourceBundle resources) {
    selectItems.setItems(itemList);
    comboBrand.setItems(brandList);
}

    public void saveItemOnAction(ActionEvent actionEvent) {
        id=itemId.getText();
        name=itemName.getText();
        qty=noOfItems.getText();
        rPrice=retailPrice.getText();
        dis=discounts.getText();
        promo=promotions.getText();

//        float retPrice=Float.parseFloat(rPrice);
//        float discount=Float.parseFloat(dis);
//        float prm=Float.parseFloat(promo);
//        final_Price= retPrice-(retPrice*discount/100)-prm;
        try {
            System.out.println("Item Id: "+id);
            System.out.println("Item Name: "+name);
            System.out.println("Quantity: "+qty);
            System.out.println("Retail Price: "+rPrice);
            System.out.println("Promotions: "+dis);
            System.out.println("Promotions: "+promo);
            System.out.println("Final Price: "+final_Price);
            JOptionPane.showMessageDialog(null,"Item Saved");
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, e);
        }
    }

    public void clickOnAction(MouseEvent mouseEvent) {
//        //final price Set automatically
        rPrice=retailPrice.getText();
        dis=discounts.getText();
        promo=promotions.getText();
        try {
            float retPrice=Float.parseFloat(rPrice);
            float discount=Float.parseFloat(dis);
            float prm=Float.parseFloat(promo);
            final_Price=retPrice-(retPrice*discount/100)-prm;
            String.format(".2%f", final_Price);
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
            if (str==brands1.getBrand_Name()){
                brands2.showBrand();
            }else if(str==brands2.getBrand_Name()){
                brands2.showBrand();
            }else if(str==brands3.getBrand_Name()){
                brands3.showBrand();
            }
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