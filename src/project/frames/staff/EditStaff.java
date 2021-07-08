package project.frames.staff;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import javax.swing.*;
import java.net.URL;
import java.time.LocalDate;
import java.util.ResourceBundle;

public class EditStaff implements Initializable {
    @FXML private TextField userId;
    @FXML private TextField userName;
    @FXML private TextField password;
    @FXML private Button saveItem;
    @FXML private Label lblSelect;
    @FXML private ComboBox comboRole;
    @FXML private Label showRole;
    @FXML private DatePicker joinedDate;

    String id, name, pw, date, role;
    ObservableList<String> list= FXCollections.observableArrayList("Floor Worker", "Cashier", "Manager");
    public void saveItemOnAction(ActionEvent actionEvent) {
        JOptionPane.showMessageDialog(null, "Deleted data!\n" +
                "\nId: "+userId.getText() +
                "\nName: "+userName.getText()+
                "\nPassword: "+password.getText() +
                "\nRole: "+role +
                "\nJoin Date: "+date);

    }

    public void showRole(ActionEvent actionEvent) {
        role=comboRole.getSelectionModel().getSelectedItem().toString();
        showRole.setText(role);
    }

    public void pickDate(ActionEvent actionEvent) {
        LocalDate localDepDate=joinedDate.getValue();
        date=localDepDate.toString();
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        comboRole.setItems(list);
    }
}
