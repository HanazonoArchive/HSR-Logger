package hsrlogger.hsrlogger;

public class RelicAlgorithm {
    public double TotalScore;
    public String ScoreRank;
    private KafkaSTATS kafkaStats; // Create an instance of KafkaStats

    public RelicAlgorithm() {
        kafkaStats = new KafkaSTATS(); // Initialize KafkaStats instance
    }

    public void CalculateMainStats(String characterName, String relicName, double relicRarity, double relicLevel, double relicValue, double relicRate) {
        double mainStatScore = 0;
        double effectivetoCharacter = 12.0;
        double ineffectiveCharacter = 7.5;
        double relicScore = relicRate * relicRarity * relicLevel;

        boolean isMaxLevel = relicLevel >= 15;

        boolean isEffective = isEffectiveForCharacter(relicName, characterName);

        if (isMaxLevel) {
            if (isEffective) {
                mainStatScore = effectivetoCharacter;
            } else {
                mainStatScore = ineffectiveCharacter;
            }
        } else {
            mainStatScore = relicScore;
        }

        System.out.println("Main Stats: " + relicName + " | Score: " + String.format("%.2f", mainStatScore));
        TotalScore += mainStatScore;
    }

    private boolean isEffectiveForCharacter(String relicName, String characterName) {
        boolean statement = false;

        if (characterName.toUpperCase().equals("KAFKA")){
            statement = kafkaStats.isEffective(relicName); // Use KafkaStats instance to check effectiveness
        }
        // Add other character checks if needed
        return statement;
    }

    public void CalculateSubStats(String characterName, String Sub1Name, double Sub1Value, String Sub2Name, double Sub2Value, String Sub3Name, double Sub3Value, String Sub4Name, double Sub4Value) {
        double subStat1Rate = kafkaStats.getStatRate(Sub1Name); // Use KafkaStats instance to get stat rate
        double subStat1Score = Sub1Value * subStat1Rate;

        double subStat2Rate = kafkaStats.getStatRate(Sub2Name);
        double subStat2Score = Sub2Value * subStat2Rate;

        double subStat3Rate = kafkaStats.getStatRate(Sub3Name);
        double subStat3Score = Sub3Value * subStat3Rate;

        double subStat4Rate = kafkaStats.getStatRate(Sub4Name);
        double subStat4Score = Sub4Value * subStat4Rate;

        System.out.println("Sub Stats: " + Sub1Name + " | Score: " + String.format("%.2f", subStat1Score));
        System.out.println("Sub Stats: " + Sub2Name + " | Score: " + String.format("%.2f", subStat2Score));
        System.out.println("Sub Stats: " + Sub3Name + " | Score: " + String.format("%.2f", subStat3Score));
        System.out.println("Sub Stats: " + Sub4Name + " | Score: " + String.format("%.2f", subStat4Score));

        TotalScore += subStat1Score;
        TotalScore += subStat2Score;
        TotalScore += subStat3Score;
        TotalScore += subStat4Score;

        Overall();

        System.out.println("Character: " + characterName);
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

        System.out.println("Total Score: " + String.format("%.2f", TotalScore));
        System.out.println("Score Rank: " + ScoreRank);
    }
}
