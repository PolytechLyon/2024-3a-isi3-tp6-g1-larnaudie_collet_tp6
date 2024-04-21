package fr.polytech.sim.cycling;

import fr.polytech.sim.Clock;
import fr.polytech.sim.Simulation;
import fr.polytech.sim.log.FileLogger;
import fr.polytech.sim.log.Logger;
import fr.polytech.sim.log.LoggerFactory;
import fr.polytech.sim.utils.Context;

import java.util.Iterator;

/**
 * Bike simulation.
 */
public class BikeSimulator implements Simulation {
    private final Logger logger = LoggerFactory.getLog( "BikeSimulator");

    public void run() {
        //Bike bike = Context.inject(Bike.class);
        Iterator<Bike> allBike = Context.injectAll(Bike.class);
        while(allBike.hasNext()) {
            Bike bike = allBike.next();
            this.logger.log("Bike's speed %.2f Km/h.", bike.getVelocity());
            this.logger.log("Bike's mass %.2f Kg.", bike.getMass());
        }
    }
}
