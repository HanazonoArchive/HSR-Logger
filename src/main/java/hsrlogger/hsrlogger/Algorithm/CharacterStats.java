package hsrlogger.hsrlogger.Algorithm;

import java.util.HashMap;
import java.util.Map;

public abstract class CharacterStats {
    protected Map<String, Double> stats = new HashMap<>();

    public double getStatRate(String statName) {
        return stats.getOrDefault(statName.toUpperCase(), 0.0);
    }
}
