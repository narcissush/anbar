package anbar.model;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
@Data
@NoArgsConstructor


public class Product {
    private int id;
    private String Name;
    private Brand brand;
    private Os os;
    private boolean hasCharger;
    private boolean hasHandsfree;
    private LocalDate productDate;
    private int count;
    private int price;

}
