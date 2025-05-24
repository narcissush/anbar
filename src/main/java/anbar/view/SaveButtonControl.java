package anbar.view;

import javafx.event.EventHandler;
import javafx.scene.input.MouseEvent;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@NoArgsConstructor
@Data


public class SaveButtonControl implements EventHandler<MouseEvent> {
    @Override
    public void handle(MouseEvent event) {
//        System.out.println("save button clicked");

    }
}
