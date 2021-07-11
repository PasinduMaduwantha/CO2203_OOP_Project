package project.frames;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

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

    public Categories(String category_Id, String category_Name, String measuring_type) {
        this.category_Id = category_Id;
        this.category_Name = category_Name;
        this.measuring_type = measuring_type;
    }

    public String getCategory_Id() {
        return category_Id;
    }

    public String getCategory_Name() {
        return category_Name;
    }

    public String getMeasuring_type() {
        return measuring_type;
    }

}
