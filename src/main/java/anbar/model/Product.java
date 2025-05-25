package anbar.model;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
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
    private boolean hasCharger;
    private boolean hasHandsfree;
    private LocalDate dataPick;
    private int count;
    private int price;

}
