package hsrlogger.hsrlogger.STATS;

import hsrlogger.hsrlogger.Algorithm.CharacterStats;

public class SparkleSTATS extends CharacterStats {
    public SparkleSTATS() {
        // Add Soarkle's stats
        stats.put("ATK_FLAT", 0.04);
        stats.put("ATK_PERCENT", 0.2);
        stats.put("BREAK_EFF", 0.5);
        stats.put("CRIT_RATE", 0.2);
        stats.put("CRIT_DMG", 1.0);
        stats.put("DEF_FLAT", 0.04);
        stats.put("DEF_PERCENT", 1.2);
        // 7 Elemental Boost
        stats.put("FIRE_DMG_BOOST", 0.0);
        stats.put("ICE_DMG_BOOST", 0.0);
        stats.put("IMAGINARY_DMG_BOOST", 0.0);
        stats.put("PHYSICAL_DMG_BOOST", 0.0);
        stats.put("LIGHTING_DMG_BOOST", 0.0);
        stats.put("QUANTUM_DMG_BOOST", 0.0);
        stats.put("WIND_DMG_BOOST", 0.0);
        //======================================//
        stats.put("ENERGY_REGENERATION_RATE", 3.35);
        stats.put("EFFECT_HIT_RATE", 0.2);
        stats.put("EFFECT_RES", 1.5);
        stats.put("HP_FLAT", 0.05);
        stats.put("HP_PERCENT", 1.5);
        stats.put("OUTGOING_HEALING_BOOST", 0.0);
        stats.put("SPD", 2.5);
    }

    public boolean isEffective(String relicName) {
        // Define which relic stats are effective for Sparkle
        switch (relicName.toUpperCase()) {
            case "SPD":
            case "HP_PERCENT":
            case "DEF_PERCENT":
            case "CRIT_DMG":
                return true;
            default:
                return false;
        }
    }
    /*
    * Maximum Cap Main Stat
    * 1. Helmet: FLAT HP = 7.5
    * 2. Glove: FLAT ATK = 7.5
    * 3. Body: Outgoing Heal Boost = 7.5
    * 4. Shoes: -
    * 5. Planar Sphere: 7 Element DMG BOOST = 7.5
    * 6. Link Rope: Energy Regeneration Rate = 7.5
    * */
}
