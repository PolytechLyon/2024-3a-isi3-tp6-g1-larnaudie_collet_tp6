package fr.polytech.sim;

import java.util.Random;

/**
 * A clock used to synchronize simulations.
 */
public class Clock {
    private static final Clock instance = new Clock();

    private final int time;

    private Clock() {
        // Initialisation aléatoire du temps
        time = new Random().nextInt(25);
    }

    public static Clock getInstance() {
        return instance;
    }

    public int getTime() {
        return time;
    }
}

