package anbar.view;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;

import java.net.URL;
import java.util.ResourceBundle;

public class anbarFormControl implements Initializable {
    @FXML
    private TextField idTxt;
    @FXML
    private TextField nameTxt;
    @FXML
    private ComboBox<anbar.model.Brand> brandCmb;
    @FXML
    private RadioButton iosRbtn;
    @FXML
    private RadioButton androidRbtn;
    @FXML
    private DatePicker datePicker;
    @FXML
    private CheckBox hasCharger,hasHandsFree;
    @FXML
    private TextField countTxt;
    @FXML
    private  TextField priceTxt;
    @FXML
    private Button saveBtn;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        System.out.println("hello");

    }
    public anbarFormControl() {
        // سازنده خالی
    }
}
