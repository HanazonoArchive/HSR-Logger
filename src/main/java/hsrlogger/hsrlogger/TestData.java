package hsrlogger.hsrlogger;

public class TestData {
    public static void main(String[] args) {
        // Main Stats
        String CharacterName = "kafka";
        String RelicName = "ATK_PERCENT";
        double relicRarity = 4;
        double relicLevel = 15;
        double mainStatValue = 43.2;
        double mainStatRate = 1.6;

        // Sub Stats
        String subStats1Name = "DEF_PERCENT";
        double subStats1Value = 9.1;
        String subStats2Name = "SPD";
        double subStats2Value = 4.6;
        String subStats3Name = "CRIT_RATE";
        double subStats3Value = 6.1;
        String subStats4Name = "CRIT_DMG";
        double subStats4Value = 11.0;

        // This is very Important part of the algorithm.

        // Create an instance of CharacterStats based on CharacterName
        CharacterStats characterStats;
        switch(CharacterName.toUpperCase()) {
            case "KAFKA":
                characterStats = new KafkaSTATS();
                break;
            // Add cases for other characters if needed
            default:
                // Default to a generic CharacterStats instance
                characterStats = new AcheronSTATS();
                break;
        }

        // Create an instance of RelicAlgorithm
        RelicAlgorithm algorithm = new RelicAlgorithm();

        // Call CalculateMainStats
        algorithm.CalculateMainStats(CharacterName, RelicName, relicRarity, relicLevel, mainStatValue, mainStatRate);

        // Call CalculateSubStats with the dynamically created CharacterStats instance
        algorithm.CalculateSubStats(characterStats, CharacterName, subStats1Name, subStats1Value, subStats2Name, subStats2Value, subStats3Name, subStats3Value, subStats4Name, subStats4Value);
    }
}
