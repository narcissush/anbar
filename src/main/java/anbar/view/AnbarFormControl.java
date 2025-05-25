package anbar.view;

import anbar.model.Brand;
import anbar.model.Os;
import anbar.model.Product;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;



import java.net.URL;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;



public class AnbarFormControl implements Initializable {
    private Os osProduct;

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

    private List<Product> productsList = new ArrayList<>();


    @Override
    public void initialize(URL location, ResourceBundle resources) {
        for(Brand brand : Brand.values()){
            brandCmb.getItems().add(brand);
        }
        resetForm();

        saveBtn.setOnAction((event) ->
        {
            Product product =
                    Product
                            .builder()
                            .id(Integer.parseInt(idTxt.getText()))
                            .name(nameTxt.getText())
                            .brand(brandCmb.getSelectionModel().getSelectedItem())
                            .os(osProduct)
                            .dataPick(dataPick.getValue())
                            .hasCharger(chargerChk.isSelected())
                            .hasHandsfree(handsfreeChk.isSelected())
                            .count(Integer.parseInt(countTxt.getText()))
                            .price(Integer.parseInt(priceTxt.getText()))

                            .build();
            if (androidRbtn.isSelected()){
                osProduct =Os.ANDROID;
            }
            else{
                osProduct =Os.IOS;
            }

            productsList.add(product);
            resetForm();
            System.out.println(productsList);
        });



}
    public void resetForm(){

        idTxt.setText(String.valueOf(productsList.size()+1));
        nameTxt.clear();
        countTxt.clear();
        priceTxt.clear();
        brandCmb.getSelectionModel().select(Brand.SAMSUNG);
        iosRbtn.setSelected(true);
        chargerChk.setSelected(true);
        dataPick.setValue(LocalDate.now());
        if (androidRbtn.isSelected()){
            osProduct =Os.ANDROID;
        }
        else{
            osProduct =Os.IOS;
        }
    }

}
