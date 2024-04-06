package hsrlogger.hsrlogger;

public class TestData {
    public static void main(String[] args) {
        // Main Stats
        String CharacterName = "Kafka";
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

        RelicAlgorithm algorithm = new RelicAlgorithm();
        algorithm.CalculateMainStats(CharacterName, RelicName, relicRarity, relicLevel, mainStatValue, mainStatRate);
        algorithm.CalculateSubStats(CharacterName, subStats1Name, subStats1Value, subStats2Name, subStats2Value, subStats3Name, subStats3Value, subStats4Name, subStats4Value);
    }
}
