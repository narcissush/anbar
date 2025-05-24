package anbar.view;

import anbar.model.Brand;
import anbar.model.Os;
import anbar.model.Product;
import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


import java.net.URL;
import java.util.ResourceBundle;
@Data
@NoArgsConstructor

public class AnbarFormControl implements Initializable {
    private Os os;

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
        for(Brand brand : Brand.values()){
            brandCmb.getItems().add(brand);
        }
        brandCmb.getSelectionModel().select(Brand.SAMSUNG);

        iosRbtn.setSelected(true);
        if (androidRbtn.isSelected()){
            os=Os.ANDROID;
        }
        else{
            os=Os.IOS;
        }
        //datePicker.setValue(LocalDate.now());




        saveBtn.setOnAction((Event) ->
        {
            Product product =
                    Product
                            .builder()
                            .id(Integer.parseInt(idTxt.getText()))
                            .name(nameTxt.getText())
                            .brand(brandCmb.getSelectionModel().getSelectedItem())
                            .os(os)
                           // .date(datePicker.getValue())
                            .hasCharger(hasCharger.isSelected())
                            .hasHandsfree(hasHandsFree.isSelected())
                            .count(Integer.parseInt(countTxt.getText()))
                            .price(Integer.parseInt(priceTxt.getText()))

                            .build();
            System.out.println(product);
        });



}}
