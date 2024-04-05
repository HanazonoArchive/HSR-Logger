package hsrlogger.hsrlogger;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class HSRLoggerApplication extends Application {
    @Override
    public void start(Stage LoginStage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(HSRLoggerApplication.class.getResource("LoginScreenUI.fxml"));
        Scene MainLoginScene = new Scene(fxmlLoader.load(), 1024, 576);
        LoginStage.setTitle("HSR Logger");
        LoginStage.setScene(MainLoginScene);
        LoginStage.show();

        //Window Icon
        {
            LoginStage.getIcons().add(new Image(Objects.requireNonNull(HSRLoggerApplication.class.getResourceAsStream("/Icons/Window_Icon.png"))));
        }

    }

    public static void main(String[] args) {
        launch();
    }
}