package anbar.model;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


import java.time.LocalDate;
@Data
@NoArgsConstructor
@SuperBuilder


public class Product {
    private int id;
    private String name;
    private Brand brand;
    private Os os;
    private LocalDate date;
    private boolean hasCharger;
    private boolean hasHandsfree;
    private LocalDate productDate;
    private int count;
    private int price;

}
