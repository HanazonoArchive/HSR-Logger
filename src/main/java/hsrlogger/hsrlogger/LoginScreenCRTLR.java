package hsrlogger.hsrlogger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import java.io.IOException;
import java.util.Objects;

public class LoginScreenCRTLR {

    @FXML
    private TextField Login_UIDTF;

    @FXML
    private PasswordField Login_PassKeyTF;

    @FXML
    private HBox Login_Button;

    @FXML
    void HandlesClicked(MouseEvent clicked) throws IOException {
        if(clicked.getSource() == Login_Button){
            String Username = Login_UIDTF.getText();
            String Password = Login_PassKeyTF.getText();

            if(Username.equals("admin") && Password.equals("admin")) {
                // Close the Login Screen
                Stage LoginScreenUI = (Stage) Login_Button.getScene().getWindow();
                LoginScreenUI.close();

                // Open the Main Screen
                MainScreen();
            }
        }
    }


    private void MainScreen() throws IOException{
        Stage MainScreen = new Stage();
        FXMLLoader fxmlLoader = new FXMLLoader(HSRLoggerApplication.class.getResource("MainScreenUI.fxml"));
        Scene MainScene = new Scene(fxmlLoader.load(), 1024, 576);
        MainScreen.setTitle("HSR Logger");
        MainScreen.setScene(MainScene);
        MainScreen.show();

        //Window Icon
        {
            MainScreen.getIcons().add(new Image(Objects.requireNonNull(HSRLoggerApplication.class.getResourceAsStream("/Icons/Window_Icon.png"))));
        }
    }

}