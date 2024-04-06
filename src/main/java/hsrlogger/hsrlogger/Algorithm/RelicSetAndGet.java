package hsrlogger.hsrlogger.Algorithm;

class RelicSetAndGet {
    private String name;
    private double rarity;
    private double level;
    private double rate;
    private String subStat1Name;
    private double subStat1Value;
    private String subStat2Name;
    private double subStat2Value;
    private String subStat3Name;
    private double subStat3Value;
    private String subStat4Name;
    private double subStat4Value;

    public RelicSetAndGet(String name, double rarity, double level, double rate, String subStat1Name, double subStat1Value, String subStat2Name, double subStat2Value, String subStat3Name, double subStat3Value, String subStat4Name, double subStat4Value) {
        this.name = name;
        this.rarity = rarity;
        this.level = level;
        this.rate = rate;
        this.subStat1Name = subStat1Name;
        this.subStat1Value = subStat1Value;
        this.subStat2Name = subStat2Name;
        this.subStat2Value = subStat2Value;
        this.subStat3Name = subStat3Name;
        this.subStat3Value = subStat3Value;
        this.subStat4Name = subStat4Name;
        this.subStat4Value = subStat4Value;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getRarity() {
        return rarity;
    }

    public void setRarity(double rarity) {
        this.rarity = rarity;
    }

    public double getLevel() {
        return level;
    }

    public void setLevel(double level) {
        this.level = level;
    }

    public double getRate() {
        return rate;
    }

    public void setRate(double rate) {
        this.rate = rate;
    }

    public String getSubStat1Name() {
        return subStat1Name;
    }

    public void setSubStat1Name(String subStat1Name) {
        this.subStat1Name = subStat1Name;
    }

    public double getSubStat1Value() {
        return subStat1Value;
    }

    public void setSubStat1Value(double subStat1Value) {
        this.subStat1Value = subStat1Value;
    }

    public String getSubStat2Name() {
        return subStat2Name;
    }

    public void setSubStat2Name(String subStat2Name) {
        this.subStat2Name = subStat2Name;
    }

    public double getSubStat2Value() {
        return subStat2Value;
    }

    public void setSubStat2Value(double subStat2Value) {
        this.subStat2Value = subStat2Value;
    }

    public String getSubStat3Name() {
        return subStat3Name;
    }

    public void setSubStat3Name(String subStat3Name) {
        this.subStat3Name = subStat3Name;
    }

    public double getSubStat3Value() {
        return subStat3Value;
    }

    public void setSubStat3Value(double subStat3Value) {
        this.subStat3Value = subStat3Value;
    }

    public String getSubStat4Name() {
        return subStat4Name;
    }

    public void setSubStat4Name(String subStat4Name) {
        this.subStat4Name = subStat4Name;
    }

    public double getSubStat4Value() {
        return subStat4Value;
    }

    public void setSubStat4Value(double subStat4Value) {
        this.subStat4Value = subStat4Value;
    }
}