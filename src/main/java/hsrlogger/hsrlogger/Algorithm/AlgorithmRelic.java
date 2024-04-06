package hsrlogger.hsrlogger.Algorithm;

import hsrlogger.hsrlogger.STATS.*;

import java.util.List;

public class AlgorithmRelic {
    private double MainStatScore;
    private double SubStatScore;
    public double TotalScore;
    public String ScoreRank;

    // Character Instance
    private KafkaSTATS KafkaStats; // Create an instance of KafkaStats
    private AcheronSTATS AcheronStats; // Create an instance of AcheronStats
    private HuohuoSTATS HuohuoStats; // Create an instance of HuohuoStats
    private SparkleSTATS SparkleStats; // Create an instance of SparkleStats
    private SeeleSTATS SeeleStats; // Create an instance of SeeleStats
    private SilverwolfSTATS SilverwolfStats; // Create instance of SilverwolfStats
    private TopazNumbySTATS TopazNumbyStats; // Create instance of TopazNumbyStats
    private FuxuanSTATS FuxuanStats; // Create instance of FuxuanStats

    public AlgorithmRelic() {
        KafkaStats = new KafkaSTATS(); // Initialize KafkaStats instance
        AcheronStats = new AcheronSTATS(); // Initialize AcheronStats instance
        HuohuoStats = new HuohuoSTATS(); // Initialize HuohuoStats instance
        SparkleStats = new SparkleSTATS(); // Initialize SparkleStats instance
        SeeleStats = new SeeleSTATS(); // Initialize SeeleStats instance
        SilverwolfStats = new SilverwolfSTATS(); // Initialize SilverwolfStats instance
        TopazNumbyStats = new TopazNumbySTATS(); // Initialize TopazNumbyStats instance
        FuxuanStats = new FuxuanSTATS(); // Initialize FuxuanStats instance
    }

    public void CalculateMainStats(String characterName, String relicName, double relicRarity, double relicLevel, double relicRate, RelicSetAndGet relic, CharacterStats characterStats) {
        double effectivetoCharacter = 12.0;
        double ineffectiveCharacter = 7.5;
        double relicScore = relicRate * relicRarity * relicLevel;

        boolean isMaxLevel = relicLevel >= 15;

        boolean isEffective = isEffectiveForCharacter(relicName, characterName);

        if (isMaxLevel) {
            if (isEffective) {
                MainStatScore = effectivetoCharacter;
            } else {
                MainStatScore = ineffectiveCharacter;
            }
        } else {
            MainStatScore = relicScore;
        }
        System.out.println(" ");
        System.out.println("Character: " + characterName.toUpperCase());
        System.out.println(" ");

        System.out.println("Main Stats: " + relicName + " | Score: " + String.format("%.2f", MainStatScore));
        CalculateSubStats(characterStats, relic);
    }

    private boolean isEffectiveForCharacter(String relicName, String characterName) {
        boolean statement = false;

        if (characterName.toUpperCase().equals("KAFKA")){
            statement = KafkaStats.isEffective(relicName); // Use KafkaStats instance to check effectiveness
        } else if (characterName.toUpperCase().equals("ACHERON")) {
            statement = AcheronStats.isEffective(relicName); // Use AcheronStats instance to check effectiveness
        } else if (characterName.toUpperCase().equals("HUOHUO")){
            statement = HuohuoStats.isEffective(relicName); // Use HuohuoStats instance of check effectiveness
        } else if (characterName.toUpperCase().equals("SPARKLE")){
            statement = SparkleStats.isEffective(relicName);
        } else if (characterName.toUpperCase().equals("SEELE")) {
            statement = SeeleStats.isEffective(relicName);
        } else if (characterName.toUpperCase().equals("SILVERWOLF")) {
            statement = SilverwolfStats.isEffective(relicName);
        } else if (characterName.toUpperCase().equals("TOPAZNUMBY")) {
            statement = TopazNumbyStats.isEffective(relicName);
        } else if (characterName.toUpperCase().equals("FUXUAN")) {
            statement = FuxuanStats.isEffective(relicName);
        }
        // Add other character checks if needed
        return statement;
    }

    public void CalculateSubStats(CharacterStats characterStats, RelicSetAndGet relic) {
        // Reset the total and sub-stat scores to zero for each relic calculation
        TotalScore = 0;
        SubStatScore = 0;

        double subStat1Rate = characterStats.getStatRate(relic.getSubStat1Name());
        double subStat1Score = relic.getSubStat1Value() * subStat1Rate;

        double subStat2Rate = characterStats.getStatRate(relic.getSubStat2Name());
        double subStat2Score = relic.getSubStat2Value() * subStat2Rate;

        double subStat3Rate = characterStats.getStatRate(relic.getSubStat3Name());
        double subStat3Score = relic.getSubStat3Value() * subStat3Rate;

        double subStat4Rate = characterStats.getStatRate(relic.getSubStat4Name());
        double subStat4Score = relic.getSubStat4Value() * subStat4Rate;

        System.out.println("Sub Stats: " + relic.getSubStat1Name() + " | Score: " + String.format("%.2f", subStat1Score));
        System.out.println("Sub Stats: " + relic.getSubStat2Name() + " | Score: " + String.format("%.2f", subStat2Score));
        System.out.println("Sub Stats: " + relic.getSubStat3Name() + " | Score: " + String.format("%.2f", subStat3Score));
        System.out.println("Sub Stats: " + relic.getSubStat4Name() + " | Score: " + String.format("%.2f", subStat4Score));

        SubStatScore += subStat1Score;
        SubStatScore += subStat2Score;
        SubStatScore += subStat3Score;
        SubStatScore += subStat4Score;

        TotalScore = MainStatScore + SubStatScore;

        Overall();
        System.out.println("Total Score: " + String.format("%.2f", TotalScore));
    }

    public void Overall() {
        if (TotalScore >= 52) {
            ScoreRank = "S+";
        } else if (TotalScore >= 52) {
            ScoreRank = "S";
        } else if (TotalScore >= 32) {
            ScoreRank = "A";
        } else if (TotalScore >= 25) {
            ScoreRank = "B";
        } else if (TotalScore >= 20) {
            ScoreRank = "C";
        } else if (TotalScore >= 15) {
            ScoreRank = "D";
        } else if (TotalScore < 15) {
            ScoreRank = "E";
        }
        System.out.println("Score Rank: " + ScoreRank);
    }
}
