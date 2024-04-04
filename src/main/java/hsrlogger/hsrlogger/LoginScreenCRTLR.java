package hsrlogger.hsrlogger;

import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.HBox;

public class LoginScreenCRTLR {

    @FXML
    private TextField Login_UIDTF;

    @FXML
    private PasswordField Login_PassKeyTF;

    @FXML
    private HBox Login_Button;



    @FXML
    void HandlesClicked(MouseEvent event){
        if(event.getSource() == Login_Button){
            System.out.println("Button Clicked!");

        }
    }

}
