package hsrlogger.hsrlogger.Algorithm;

import hsrlogger.hsrlogger.STATS.*;

import java.util.ArrayList;
import java.util.List;

public class SingleRelicScorer {
    public static void main(String[] args) {

        // Character Name
        String CharacterName = "Kafka";

        // List to store relics
        List<RelicSetAndGet> relics = new ArrayList<>();

        // Add relics for the character
        relics.add(new RelicSetAndGet("ATK_PERCENT", 4, 15,1.6, "DEF_PERCENT", 9.1, "SPD", 4.6, "CRIT_RATE", 6.1, "CRIT_DMG", 11.0));
        // Add more relics as needed

        // This is very Important part of the algorithm.

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
        //for (RelicSetAndGet relic : relics) {
        //    algorithm.CalculateMainStats(CharacterName, relic.getName(), relic.getRarity(), relic.getLevel(), relic.getRate());
        //}

        // Call CalculateSubStats with the dynamically created CharacterStats instance
        //algorithm.CalculateSubStats(characterStats, CharacterName, relics);
    }
}
