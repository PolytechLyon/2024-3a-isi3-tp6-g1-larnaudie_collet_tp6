package fr.polytech.sim.log;

public class LoggerFactory {
    public static Logger getLog(String name) {
        return new ConsoleLogger(name);
    }
}
