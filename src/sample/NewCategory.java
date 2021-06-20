package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Label;


public class NewCategory extends Categories {
    @FXML public Label id;
    @FXML public Label name;
    @FXML public Label type;


    public void showItems(String Id, String Name, String Type){
        this.id.setText("Category Item"+Id);
        this.name.setText("Category Name"+Name);
        this.type.setText("Measuring Type"+Type);
    };
}
