package hsrlogger.hsrlogger;

public class AcheronSTATS extends CharacterStats {
    public AcheronSTATS() {
        // Add Acheron's stats
        stats.put("ATK_FLAT", 0.04);
        stats.put("ATK_PERCENT", 1.2);
        stats.put("BREAK_EFF", 0.5);
        stats.put("CRIT_RATE", 2.0);
        stats.put("CRIT_DMG", 1.0);
        stats.put("DEF_FLAT", 0.02);
        stats.put("DEF_PERCENT", 0.1);
        stats.put("FIRE_DMG_BOOST", 0.0);
        stats.put("ICE_DMG_BOOST", 0.0);
        stats.put("IMAGINARY_DMG_BOOST", 0.0);
        stats.put("PHYSICAL_DMG_BOOST", 0.0);
        stats.put("LIGHTING_DMG_BOOST", 1.68);
        stats.put("QUANTUM_DMG_BOOST", 0.0);
        stats.put("WIND_DMG_BOOST", 0.0);
        stats.put("ENERGY_REGENERATION_RATE", 0.0);
        stats.put("EFFECT_HIT_RATE", 0.3);
        stats.put("EFFECT_RES", 0.5);
        stats.put("HP_FLAT", 0.02);
        stats.put("HP_PERCENT", 0.6);
        stats.put("OUTGOING_HEALING_BOOST", 0.0);
        stats.put("SPD", 2.5);
    }

    public boolean isEffective(String relicName) {
        // Define which relic stats are effective for Acheron
        switch (relicName.toUpperCase()) {
            case "ATK_PERCENT":
            case "CRIT_DMG":
                return true;
            default:
                return false;
        }
    }
}
