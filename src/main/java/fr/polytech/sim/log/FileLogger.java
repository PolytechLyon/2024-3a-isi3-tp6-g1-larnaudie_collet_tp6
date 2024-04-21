package fr.polytech.sim.log;

import java.io.FileWriter;
import java.io.IOException;

/**
 * File logger.
 */
public class FileLogger extends NamedLogger {

    private static final String FILE_NAME = "logs.txt";

    /**
     * Constructor.
     *
     * @param name logger name.
     */
    public FileLogger(String name) {
        super(name);
    }

    @Override
    protected void logFinalMessage(String finalMessage) {
        try (FileWriter fileWriter = new FileWriter(FILE_NAME, true)) {
            fileWriter.write(finalMessage + "\n");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
