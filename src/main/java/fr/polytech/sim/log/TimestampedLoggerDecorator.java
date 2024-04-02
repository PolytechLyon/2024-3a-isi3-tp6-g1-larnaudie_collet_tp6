package fr.polytech.sim.log;

import java.text.SimpleDateFormat;
import java.util.Date;

public class TimestampedLoggerDecorator implements Logger{

    /**
     * Constructor.
     *
     * @param name logger name.
     */
    private final Logger logger;
    private final SimpleDateFormat dateFormat;

    public TimestampedLoggerDecorator(Logger logger) {
        this.logger = logger;
        this.dateFormat = new SimpleDateFormat("HH:mm:ss");
    }

    @Override
    public void log(String format, Object... args) {
        String timestamp = dateFormat.format(new Date());
        logger.log(timestamp + "  " + format,args);
    }

}
