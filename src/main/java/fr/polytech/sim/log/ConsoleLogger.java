package fr.polytech.sim.log;

/**
 * Console logger.
 */
public class ConsoleLogger extends NamedLogger {

    /**
     * Constructor.
     *
     * @param name logger name.
     */
    ConsoleLogger(String name) {
        super(name);
    }

    @Override
    protected void logFinalMessage(String message) {
        System.out.println(message);
    }
}
