package hsrlogger.hsrlogger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Control;
import javafx.scene.layout.AnchorPane;

public class MainScreenCRTLR {

    @FXML
    private AnchorPane Main_ANCHRPNE;

    @FXML
    private AnchorPane main_screen;

    @FXML
    private AnchorPane Navigation_ANCHRPNE;

    public void setMainANCHRPNE(AnchorPane Main_ANCHRPNE) {
        this.Main_ANCHRPNE = Main_ANCHRPNE;
    }

    @FXML
    public void initialize(){
        try{
            // Load Navigation
            FXMLLoader LoadNavigation = new FXMLLoader(getClass().getResource("MainScreenUI_Navigation.fxml"));
            AnchorPane setNavigationANCHRPNE = LoadNavigation.load();

            main_screen.getChildren().remove(Navigation_ANCHRPNE);
            main_screen.getChildren().add(setNavigationANCHRPNE);

            Navigation_ANCHRPNE = setNavigationANCHRPNE;

            MainScreenNavigationCRTLR NavigationController = LoadNavigation.getController();
            NavigationController.Main_ANCHRPNE(Main_ANCHRPNE);

            // Load Default Screen
            FXMLLoader LoadDefault = new FXMLLoader(getClass().getResource("MainScreenUI_PityCounter.fxml"));
            AnchorPane setDefault = LoadDefault.load();

            MainScreenPityCounterCRTLR DefaultController = LoadDefault.getController();
            DefaultController.setMain_ANCHRPNE(Main_ANCHRPNE);

            Main_ANCHRPNE.getChildren().setAll(setDefault);


        } catch (Exception e){
            e.printStackTrace();
        }
    }

}
