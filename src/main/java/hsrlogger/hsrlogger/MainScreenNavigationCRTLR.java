package hsrlogger.hsrlogger;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class MainScreenNavigationCRTLR {

    @FXML
    private AnchorPane Navigation_ANCHRPNE;

    @FXML
    private HBox MainBT_PityCounter;

    @FXML
    private HBox MainBT_TeamBuilding;

    @FXML
    private HBox MainBT_RelicScore;

    private AnchorPane Main_ANCHRPNE;
    private boolean isPityCounterClicked = false;
    private  boolean isTeamBuildingClicked = false;
    private  boolean isRelicScoreCliekd = false;

    public void Main_ANCHRPNE(AnchorPane Main_ANCHRPNE) {
        this.Main_ANCHRPNE = Main_ANCHRPNE;
    }

    @FXML
    void HandleClicks(MouseEvent event) {
        if(event.getSource() ==  MainBT_PityCounter){
            try{
                FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScreenUI_PityCounter.fxml"));
                AnchorPane setMain_ANCHRPNE = loader.load();

                MainScreenPityCounterCRTLR controller = loader.getController();
                controller.setMain_ANCHRPNE(Main_ANCHRPNE);

                Main_ANCHRPNE.getChildren().remove(Main_ANCHRPNE);
                Main_ANCHRPNE.getChildren().add(setMain_ANCHRPNE);

                Main_ANCHRPNE = setMain_ANCHRPNE;

                isPityCounterClicked = !isPityCounterClicked;
                MainBT_PityCounter.getStyleClass().setAll("Navigation_Tab", isPityCounterClicked ? "clicked" : "");
                isTeamBuildingClicked = false;
                isRelicScoreCliekd = false;
                MainBT_TeamBuilding.getStyleClass().remove("clicked");
                MainBT_RelicScore.getStyleClass().remove("clicked");

            } catch (Exception e){
                e.printStackTrace();
            }
        } else if (event.getSource() == MainBT_TeamBuilding){
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScreenUI_TeamBuilding.fxml"));
                AnchorPane setMain_ANCHRPNE = loader.load();

                MainScreenTeamBuildingCRTLR controller = loader.getController();
                controller.setMain_ANCHRPNE(Main_ANCHRPNE);

                Main_ANCHRPNE.getChildren().remove(Main_ANCHRPNE);
                Main_ANCHRPNE.getChildren().add(setMain_ANCHRPNE);

                Main_ANCHRPNE = setMain_ANCHRPNE;

                isTeamBuildingClicked = !isTeamBuildingClicked;
                MainBT_TeamBuilding.getStyleClass().setAll("Navigation_Tab", isTeamBuildingClicked ? "clicked" : "");
                isPityCounterClicked = false;
                isRelicScoreCliekd = false;
                MainBT_PityCounter.getStyleClass().remove("clicked");
                MainBT_RelicScore.getStyleClass().remove("clicked");

            } catch (Exception e){
                e.printStackTrace();
            }
        } else if (event.getSource() == MainBT_RelicScore){
            try {
                FXMLLoader loader = new FXMLLoader(getClass().getResource("MainScreenUI_RelicScore.fxml"));
                AnchorPane setMain_ANCHRPNE = loader.load();

                MainScreenRelicScoreCRTLR controller = loader.getController();
                controller.setMain_ANCHRPNE(Main_ANCHRPNE);

                Main_ANCHRPNE.getChildren().remove(Main_ANCHRPNE);
                Main_ANCHRPNE.getChildren().add(setMain_ANCHRPNE);

                Main_ANCHRPNE = setMain_ANCHRPNE;

                isRelicScoreCliekd = !isRelicScoreCliekd;
                MainBT_RelicScore.getStyleClass().setAll("Navigation_Tab", isRelicScoreCliekd ? "clicked" : "");
                isPityCounterClicked = false;
                isTeamBuildingClicked = false;
                MainBT_PityCounter.getStyleClass().remove("clicked");
                MainBT_TeamBuilding.getStyleClass().remove("clicked");

            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
