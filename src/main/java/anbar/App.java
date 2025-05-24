package anbar;

import javafx.application.Application;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import lombok.Data;

import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import lombok.experimental.SuperBuilder;
import java.util.Objects;
@EqualsAndHashCode(callSuper = true)
@NoArgsConstructor
@Data

public class App extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        Scene scene = new Scene(FXMLLoader.load(Objects.requireNonNull(getClass().getResource("AppForm.fxml"))));
        primaryStage.setScene(scene);
        primaryStage.setTitle("Product Information");
        primaryStage.show();

    }
}
