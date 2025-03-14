package ilandStructure.UtilitiesAndObjectFabrics;

import java.util.Random;

public class RandomSingleton {
    private final Random randomizer = new Random();

    public Random getRandomizer() {
        return randomizer;
    }
}
