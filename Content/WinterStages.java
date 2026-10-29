package Content;

import java.util.Random;

public enum WinterStages {
    Early,Mid,Strong,Late;

    public static WinterStages random(Random random) {
        WinterStages[] values = values();
        return values[random.nextInt(values.length)];
    }
}