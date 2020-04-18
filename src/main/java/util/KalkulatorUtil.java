package util;

import java.util.concurrent.ThreadLocalRandom;

public class KalkulatorUtil {

    public static int randomHourBetween(int min, int max) {
        ThreadLocalRandom localRandom = ThreadLocalRandom.current();
        return localRandom.nextInt(min, max);
    }

}
