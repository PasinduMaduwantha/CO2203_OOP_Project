package project.frames;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.*;
import java.io.IOException;

public class Categories {

    @FXML private Label showId;
    @FXML private Label showname;
    @FXML private Label showtype;
    @FXML private TextField text_name;
    @FXML private TextField text_type;
    @FXML private TextField text_Id;
    private String category_Id="ID";    //ID set as default value
    private String category_Name="name";    //name set as default value
    private String measuring_type="type";    // consider about only two methods, default ano-of-items method

    public void saveOnAction(ActionEvent actionEvent) throws IOException {
        category_Id=text_Id.getText();
        category_Name=text_name.getText();
        measuring_type=text_type.getText();

        showId.setText(category_Id);
        showname.setText(category_Name);
        showtype.setText(measuring_type);
        try {
            System.out.println("Category Item"+category_Id);
            System.out.println("Category Name"+category_Name);
            System.out.println("Measuring Type"+measuring_type);
        }
        catch (Exception e){
            JOptionPane.showMessageDialog(null, "Saved");
        }

    }
}
