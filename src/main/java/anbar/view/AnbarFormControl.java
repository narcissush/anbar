package anbar.view;

import anbar.model.Brand;
import anbar.model.Os;
import anbar.model.Product;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import lombok.Data;
import lombok.NoArgsConstructor;


import java.net.URL;
import java.time.LocalDate;
import java.util.List;
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
    private DatePicker dataPick;
    @FXML
    private CheckBox chargerChk, handsfreeChk;
    @FXML
    private TextField countTxt;
    @FXML
    private  TextField priceTxt;
    @FXML
    private Button saveBtn;

    private List<Product> productsList;


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
        dataPick.setValue(LocalDate.now());




        saveBtn.setOnAction((event) ->
        {
            Product product =
                    Product
                            .builder()
                            .id(12)
                            .name(nameTxt.getText())
                            .brand(brandCmb.getSelectionModel().getSelectedItem())
                            .os(os)
                            .dataPick(dataPick.getValue())
                            .hasCharger(chargerChk.isSelected())
                            .hasHandsfree(handsfreeChk.isSelected())
                            .count(Integer.parseInt(countTxt.getText()))
                            .price(Integer.parseInt(priceTxt.getText()))

                            .build();
            productsList.add(product);
            System.out.println(productsList);
        });



}


}
