package hsrlogger.hsrlogger.Algorithm;

import java.util.ArrayList;
import java.util.List;

import hsrlogger.hsrlogger.STATS.*;

public class BuildRelicScorer {
    public static void main(String[] args) {

        // Character Name
        String CharacterName = "Kafka";

        // List to store relics
        List<RelicSetAndGet> relics = new ArrayList<>();

        // Add relics for the character
        relics.add(new RelicSetAndGet("HP_FLAT", 4, 15, 1, "HP_PERCENT", 3.8, "ATK_PERCENT", 3.8, "EFFECT_RES", 7.7, "BREAK_EFF", 22.0));
        relics.add(new RelicSetAndGet("ATK_FLAT", 4, 15, 1, "HP_PERCENT", 7.7, "ATK_PERCENT", 4.3, "CRIT_RATE", 9.0, "EFFECT_RES", 8.2));
        relics.add(new RelicSetAndGet("ATK_PERCENT", 4, 15, 1.6, "DEF_PERCENT", 9.1, "SPD", 4.6, "CRIT_RATE", 6.1, "CRIT_DMG", 11.0));
        relics.add(new RelicSetAndGet("SPD",4,15,1,"ATK_FLAT",55,"DEF_PERCENT", 5.4, "CRIT_RATE", 9.0, "BREAK_EFF", 6.4));
        relics.add(new RelicSetAndGet("LIGHTING_DMG_BOOST", 4, 15, 1.6, "ATK_PERCENT", 7.3, "DEF_PERCENT", 8.6, "CRIT_RATE", 3.2, "EFFECT_RES", 12.0));
        relics.add(new RelicSetAndGet("ATK_PERCENT", 4,15,1.6, "HP_FLAT", 158, "ATK_FLAT", 21, "CRIT_DMG", 11.0, "EFFECT_RES", 8.2));
        // Add more relics as needed

        // Create an instance of CharacterStats based on CharacterName
        CharacterStats characterStats = null;
        switch(CharacterName.toUpperCase()) {
            case "KAFKA":
                characterStats = new KafkaSTATS();
                break;
            // Add cases for other characters if needed
            case "ACHERON":
                // Default to a generic CharacterStats instance
                characterStats = new AcheronSTATS();
                break;
            case "SEELE":
                characterStats = new SeeleSTATS();
                break;
            case "SPARKLE":
                characterStats = new SparkleSTATS();
                break;
            case "HUOHUO":
                characterStats = new HuohuoSTATS();
                break;
            case "SILVERWOLF":
                characterStats = new SparkleSTATS();
                break;
            case "TOPAZNUMBY":
                characterStats = new TopazNumbySTATS();
                break;
            default:
                System.out.println("ERROR!");
        }

        // Create an instance of RelicAlgorithm
        AlgorithmRelic algorithm = new AlgorithmRelic();

        // Call CalculateMainStats for each relic
        for (RelicSetAndGet relic : relics) {
            algorithm.CalculateMainStats(CharacterName, relic.getName(), relic.getRarity(), relic.getLevel(), relic.getRate(), relic, characterStats);
        }
    }
}
