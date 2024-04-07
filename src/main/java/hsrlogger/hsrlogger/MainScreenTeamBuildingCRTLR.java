package hsrlogger.hsrlogger;

import hsrlogger.hsrlogger.Algorithm.BuildRelicScorer;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.HBox;

public class MainScreenTeamBuildingCRTLR {
    @FXML
    private AnchorPane Main_ANCHRPNE;

    public void setMain_ANCHRPNE(AnchorPane Main_ANCHRPNE){
        this.Main_ANCHRPNE = Main_ANCHRPNE;
    }
    // Character Name
    @FXML
    private ComboBox<String> characterName;

    // Helmet Relic
    //= Main Stat
    @FXML
    private ComboBox<String> helmet_MainStatName;
    @FXML
    private TextField helmet_MainStatValue;
    @FXML
    private ComboBox<String> helmet_Rarity;
    @FXML
    private TextField helmet_Level;
    //= Score and Grade
    @FXML
    private Label helmet_ScoreLBL;
    @FXML
    private Label helmet_GradeLBL;
    //= Subs Stat
    @FXML
    private ComboBox<String> helmet_SubStatName1;
    @FXML
    private TextField helmet_SubStatValue1;
    @FXML
    private ComboBox<String> helmet_SubStatName2;
    @FXML
    private TextField helmet_SubStatValue2;
    @FXML
    private ComboBox<String> helmet_SubStatName3;
    @FXML
    private TextField helmet_SubStatValue3;
    @FXML
    private ComboBox<String> helmet_SubStatName4;
    @FXML
    private TextField helmet_SubStatValue4;


    // Glove Relic
    //= Main Stat
    @FXML
    private ComboBox<String> glove_MainStatName;
    @FXML
    private TextField glove_MainStatValue;
    @FXML
    private ComboBox<String> glove_Rarity;
    @FXML
    private TextField glove_Level;
    //= Score and Grade
    @FXML
    private Label glove_ScoreLBL;
    @FXML
    private Label glove_GradeLBL;
    //= Subs Stat
    @FXML
    private ComboBox<String> glove_SubStatName1;
    @FXML
    private TextField glove_SubStatValue1;
    @FXML
    private ComboBox<String> glove_SubStatName2;
    @FXML
    private TextField glove_SubStatValue2;
    @FXML
    private ComboBox<String> glove_SubStatName3;
    @FXML
    private TextField glove_SubStatValue3;
    @FXML
    private ComboBox<String> glove_SubStatName4;
    @FXML
    private TextField glove_SubStatValue4;


    // Body Relic
    //= Main Stat
    @FXML
    private ComboBox<String> body_MainStatName;
    @FXML
    private TextField body_MainStatValue;
    @FXML
    private ComboBox<String> body_Rarity;
    @FXML
    private TextField body_Level;
    //= Score and Grade
    @FXML
    private Label body_ScoreLBL;
    @FXML
    private Label body_GradeLBL;
    //= Subs Stat
    @FXML
    private ComboBox<String> body_SubStatName1;
    @FXML
    private TextField body_SubStatValue1;
    @FXML
    private ComboBox<String> body_SubStatName2;
    @FXML
    private TextField body_SubStatValue2;
    @FXML
    private ComboBox<String> body_SubStatName3;
    @FXML
    private TextField body_SubStatValue3;
    @FXML
    private ComboBox<String> body_SubStatName4;
    @FXML
    private TextField body_SubStatValue4;


    // Feet Relic
    //= Main Stat
    @FXML
    private ComboBox<String> feet_MainStatName;
    @FXML
    private TextField feet_MainStatValue;
    @FXML
    private ComboBox<String> feet_Rarity;
    @FXML
    private TextField feet_Level;
    //= Score and Grade
    @FXML
    private Label feet_ScoreLBL;
    @FXML
    private Label feet_GradeLBL;
    //= Subs Stat
    @FXML
    private ComboBox<String> feet_SubStatName1;
    @FXML
    private TextField feet_SubStatValue1;
    @FXML
    private ComboBox<String> feet_SubStatName2;
    @FXML
    private TextField feet_SubStatValue2;
    @FXML
    private ComboBox<String> feet_SubStatName3;
    @FXML
    private TextField feet_SubStatValue3;
    @FXML
    private ComboBox<String> feet_SubStatName4;
    @FXML
    private TextField feet_SubStatValue4;


    // Sphere Relic
    //= Main Stat
    @FXML
    private ComboBox<String> sphere_MainStatName;
    @FXML
    private TextField sphere_MainStatValue;
    @FXML
    private ComboBox<String> sphere_Rarity;
    @FXML
    private TextField sphere_Level;
    //= Score and Grade
    @FXML
    private Label sphere_ScoreLBL;
    @FXML
    private Label sphere_GradeLBL;
    //= Subs Stat
    @FXML
    private ComboBox<String> sphere_SubStatName1;
    @FXML
    private TextField sphere_SubStatValue1;
    @FXML
    private ComboBox<String> sphere_SubStatName2;
    @FXML
    private TextField sphere_SubStatValue2;
    @FXML
    private ComboBox<String> sphere_SubStatName3;
    @FXML
    private TextField sphere_SubStatValue3;
    @FXML
    private ComboBox<String> sphere_SubStatName4;
    @FXML
    private TextField sphere_SubStatValue4;


    // Rope Relic
    //= Main Stat
    @FXML
    private ComboBox<String> rope_MainStatName;
    @FXML
    private TextField rope_MainStatValue;
    @FXML
    private ComboBox<String> rope_Rarity;
    @FXML
    private TextField rope_Level;
    //= Score and Grade
    @FXML
    private Label rope_ScoreLBL;
    @FXML
    private Label rope_GradeLBL;
    //= Subs Stat
    @FXML
    private ComboBox<String> rope_SubStatName1;
    @FXML
    private TextField rope_SubStatValue1;
    @FXML
    private ComboBox<String> rope_SubStatName2;
    @FXML
    private TextField rope_SubStatValue2;
    @FXML
    private ComboBox<String> rope_SubStatName3;
    @FXML
    private TextField rope_SubStatValue3;
    @FXML
    private ComboBox<String> rope_SubStatName4;
    @FXML
    private TextField rope_SubStatValue4;

    //Button
    @FXML
    private HBox BuildScoreSubmitBT;
    public void initialize(){

        // Initialize characterName ComboBox
        ObservableList<String> characterNames = FXCollections.observableArrayList("Kafka", "Acheron", "FuXuan", "Huohuo", "Seele", "SilverWolf", "Sparkle", "TopazNumby");
        characterName.setItems(characterNames);

        //Helmet
        ObservableList<String> helmet_MainStatNames = FXCollections.observableArrayList("HP_FLAT"); // Done
        helmet_MainStatName.setItems(helmet_MainStatNames);

        //Glove
        ObservableList<String> glove_MainStatNames = FXCollections.observableArrayList("ATK_FLAT"); // Done
        glove_MainStatName.setItems(glove_MainStatNames);

        //Body
        ObservableList<String> body_MainStatNames = FXCollections.observableArrayList("ATK_PERCENT", "DEF_PERCENT", "HP_PERCENT", "CRIT_DMG", "CRIT_RATE", "OUTGOING_HEALING_BOOST", "EFFECT_HIT_RATE"); // Done
        body_MainStatName.setItems(body_MainStatNames);

        //Feet
        ObservableList<String> feet_MainStatNames = FXCollections.observableArrayList("SPD","ATK_PERCENT", "DEF_PERCENT", "HP_PERCENT"); // Done
        feet_MainStatName.setItems(feet_MainStatNames);

        //Sphere
        ObservableList<String> sphere_MainStatNames = FXCollections.observableArrayList("HP_PERCENT", "ATK_PERCENT", "DEF_PERCENT", "FIRE_DMG_BOOST", "ICE_DMG_BOOST", "IMAGINARY_DMG_BOOST", "PHYSICAL_DMG_BOOST", "LIGHTING_DMG_BOOST", "QUANTUM_DMG_BOOST", "WIND_DMG_BOOST"); // Done
        sphere_MainStatName.setItems(sphere_MainStatNames);

        //Rope
        ObservableList<String> rope_MainStatNames = FXCollections.observableArrayList("DEF_PERCENT", "ATK_PERCENT", "HP_PERCENT", "BREAK_EFF", "ENERGY_REGENERATION_RATE"); // Done
        rope_MainStatName.setItems(rope_MainStatNames);

        //Rarity
        ObservableList<String> Rarity = FXCollections.observableArrayList("4", "3", "2", "1"); // Done
        helmet_Rarity.setItems(Rarity);
        glove_Rarity.setItems(Rarity);
        body_Rarity.setItems(Rarity);
        feet_Rarity.setItems(Rarity);
        sphere_Rarity.setItems(Rarity);
        rope_Rarity.setItems(Rarity);

        // SubStats
        ObservableList<String> SubStats = FXCollections.observableArrayList("HP_FLAT", "ATK_FLAT", "DEF_FLAT", "HP_PERCENT", "ATK_PERCENT", "DEF_PERCENT", "CRIT_RATE", "CRIT_DMG", "EFFECT_HIT_RATE", "EFFECT_RES", "BREAK_EFF", "SPD"); // Done
        helmet_SubStatName1.setItems(SubStats);
        helmet_SubStatName2.setItems(SubStats);
        helmet_SubStatName3.setItems(SubStats);
        helmet_SubStatName4.setItems(SubStats);

        glove_SubStatName1.setItems(SubStats);
        glove_SubStatName2.setItems(SubStats);
        glove_SubStatName3.setItems(SubStats);
        glove_SubStatName4.setItems(SubStats);

        body_SubStatName1.setItems(SubStats);
        body_SubStatName2.setItems(SubStats);
        body_SubStatName3.setItems(SubStats);
        body_SubStatName4.setItems(SubStats);

        feet_SubStatName1.setItems(SubStats);
        feet_SubStatName2.setItems(SubStats);
        feet_SubStatName3.setItems(SubStats);
        feet_SubStatName4.setItems(SubStats);

        sphere_SubStatName1.setItems(SubStats);
        sphere_SubStatName2.setItems(SubStats);
        sphere_SubStatName3.setItems(SubStats);
        sphere_SubStatName4.setItems(SubStats);

        rope_SubStatName1.setItems(SubStats);
        rope_SubStatName2.setItems(SubStats);
        rope_SubStatName3.setItems(SubStats);
        rope_SubStatName4.setItems(SubStats);
        // Initialize your other ComboBoxes in a similar manner
    }

    @FXML
    void HandleClicks(MouseEvent event) {
        if (event.getSource() == BuildScoreSubmitBT) {
            try {
                // Character Name
                String SelectedCharacter = characterName.getValue();

                // Instance of Grade and Score
                String helmetGrade = null;
                String glovesGrade = null;
                String bodyGrade = null;
                String feetGrade = null;
                String sphereGrade = null;
                String ropeGrade = null;

                double helmetScore = 0;
                double gloveScore = 0;
                double bodyScore = 0;
                double feetScore = 0;
                double sphereScore = 0;
                double ropeScore = 0;


                //Helmet
                //Main Stat
                String helmet_SelectedMainStat = helmet_MainStatName.getValue();
                double helmet_SelectedMainValue = Double.parseDouble(helmet_MainStatValue.getText());
                double helmet_SelectedRarity = Double.parseDouble(helmet_Rarity.getValue());
                double helmet_SelectedLevel = Double.parseDouble(helmet_Level.getText());
                //Sub Stats
                String helmet_SelectedSubStat1 = helmet_SubStatName1.getValue();
                double helmet_SelectedSubValue1 = Double.parseDouble(helmet_SubStatValue1.getText());
                String helmet_SelectedSubStat2 = helmet_SubStatName2.getValue();
                double helmet_SelectedSubValue2 = Double.parseDouble(helmet_SubStatValue2.getText());
                String helmet_SelectedSubStat3 = helmet_SubStatName3.getValue();
                double helmet_SelectedSubValue3 = Double.parseDouble(helmet_SubStatValue3.getText());
                String helmet_SelectedSubStat4 = helmet_SubStatName4.getValue();
                double helmet_SelectedSubValue4 = Double.parseDouble(helmet_SubStatValue4.getText());

                //Glove
                //Main Stat
                String glove_SelectedMainStat = glove_MainStatName.getValue();
                double glove_SelectedMainValue = Double.parseDouble(glove_MainStatValue.getText());
                double glove_SelectedRarity = Double.parseDouble(glove_Rarity.getValue());
                double glove_SelectedLevel = Double.parseDouble(glove_Level.getText());
                //Sub Stats
                String glove_SelectedSubStat1 = glove_SubStatName1.getValue();
                double glove_SelectedSubValue1 = Double.parseDouble(glove_SubStatValue1.getText());
                String glove_SelectedSubStat2 = glove_SubStatName2.getValue();
                double glove_SelectedSubValue2 = Double.parseDouble(glove_SubStatValue2.getText());
                String glove_SelectedSubStat3 = glove_SubStatName3.getValue();
                double glove_SelectedSubValue3 = Double.parseDouble(glove_SubStatValue3.getText());
                String glove_SelectedSubStat4 = glove_SubStatName4.getValue();
                double glove_SelectedSubValue4 = Double.parseDouble(glove_SubStatValue4.getText());

                //Body
                //Main Stat
                String body_SelectedMainStat = body_MainStatName.getValue();
                double body_SelectedMainValue = Double.parseDouble(body_MainStatValue.getText());
                double body_SelectedRarity = Double.parseDouble(body_Rarity.getValue());
                double body_SelectedLevel = Double.parseDouble(body_Level.getText());
                //Sub Stats
                String body_SelectedSubStat1 = body_SubStatName1.getValue();
                double body_SelectedSubValue1 = Double.parseDouble(body_SubStatValue1.getText());
                String body_SelectedSubStat2 = body_SubStatName2.getValue();
                double body_SelectedSubValue2 = Double.parseDouble(body_SubStatValue2.getText());
                String body_SelectedSubStat3 = body_SubStatName3.getValue();
                double body_SelectedSubValue3 = Double.parseDouble(body_SubStatValue3.getText());
                String body_SelectedSubStat4 = body_SubStatName4.getValue();
                double body_SelectedSubValue4 = Double.parseDouble(body_SubStatValue4.getText());

                //Feet
                //Main Stat
                String feet_SelectedMainStat = feet_MainStatName.getValue();
                double feet_SelectedMainValue = Double.parseDouble(feet_MainStatValue.getText());
                double feet_SelectedRarity = Double.parseDouble(feet_Rarity.getValue());
                double feet_SelectedLevel = Double.parseDouble(feet_Level.getText());
                //Sub Stats
                String feet_SelectedSubStat1 = feet_SubStatName1.getValue();
                double feet_SelectedSubValue1 = Double.parseDouble(feet_SubStatValue1.getText());
                String feet_SelectedSubStat2 = feet_SubStatName2.getValue();
                double feet_SelectedSubValue2 = Double.parseDouble(feet_SubStatValue2.getText());
                String feet_SelectedSubStat3 = feet_SubStatName3.getValue();
                double feet_SelectedSubValue3 = Double.parseDouble(feet_SubStatValue3.getText());
                String feet_SelectedSubStat4 = feet_SubStatName4.getValue();
                double feet_SelectedSubValue4 = Double.parseDouble(feet_SubStatValue4.getText());

                //Sphere
                //Main Stat
                String sphere_SelectedMainStat = sphere_MainStatName.getValue();
                double sphere_SelectedMainValue = Double.parseDouble(sphere_MainStatValue.getText());
                double sphere_SelectedRarity = Double.parseDouble(sphere_Rarity.getValue());
                double sphere_SelectedLevel = Double.parseDouble(sphere_Level.getText());
                //Sub Stats
                String sphere_SelectedSubStat1 = sphere_SubStatName1.getValue();
                double sphere_SelectedSubValue1 = Double.parseDouble(sphere_SubStatValue1.getText());
                String sphere_SelectedSubStat2 = sphere_SubStatName2.getValue();
                double sphere_SelectedSubValue2 = Double.parseDouble(sphere_SubStatValue2.getText());
                String sphere_SelectedSubStat3 = sphere_SubStatName3.getValue();
                double sphere_SelectedSubValue3 = Double.parseDouble(sphere_SubStatValue3.getText());
                String sphere_SelectedSubStat4 = sphere_SubStatName4.getValue();
                double sphere_SelectedSubValue4 = Double.parseDouble(sphere_SubStatValue4.getText());

                //Rope
                //Main Stat
                String rope_SelectedMainStat = rope_MainStatName.getValue();
                double rope_SelectedMainValue = Double.parseDouble(rope_MainStatValue.getText());
                double rope_SelectedRarity = Double.parseDouble(rope_Rarity.getValue());
                double rope_SelectedLevel = Double.parseDouble(rope_Level.getText());
                //Sub Stats
                String rope_SelectedSubStat1 = rope_SubStatName1.getValue();
                double rope_SelectedSubValue1 = Double.parseDouble(rope_SubStatValue1.getText());
                String rope_SelectedSubStat2 = rope_SubStatName2.getValue();
                double rope_SelectedSubValue2 = Double.parseDouble(rope_SubStatValue2.getText());
                String rope_SelectedSubStat3 = rope_SubStatName3.getValue();
                double rope_SelectedSubValue3 = Double.parseDouble(rope_SubStatValue3.getText());
                String rope_SelectedSubStat4 = rope_SubStatName4.getValue();
                double rope_SelectedSubValue4 = Double.parseDouble(rope_SubStatValue4.getText());

                //Grade and Score
                helmet_GradeLBL.setText(helmetGrade);
                helmet_ScoreLBL.setText(String.valueOf(helmetScore));

                glove_GradeLBL.setText(glovesGrade);
                glove_ScoreLBL.setText(String.valueOf(gloveScore));

                body_GradeLBL.setText(bodyGrade);
                body_ScoreLBL.setText(String.valueOf(bodyScore));

                feet_GradeLBL.setText(feetGrade);
                feet_ScoreLBL.setText(String.valueOf(feetScore));

                sphere_GradeLBL.setText(sphereGrade);
                sphere_ScoreLBL.setText(String.valueOf(sphereScore));

                rope_GradeLBL.setText(ropeGrade);
                rope_ScoreLBL.setText(String.valueOf(ropeScore));
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
