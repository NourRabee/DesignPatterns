import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoryLogger {
    private int infoCount;
    private int warningCount;
    private int errorCount;

    private List<LogMessage> logs = new ArrayList<>();
    private static MemoryLogger instance = null;
    private static final Object lock = new Object();

    private MemoryLogger() {

    }

    public static MemoryLogger getLogger() {
        // In Java, the synchronized keyword is used to ensure that only one thread can access a particular block of code at a time.

        if (instance == null) {

            synchronized (lock) {

                if (instance == null) {
                    instance = new MemoryLogger();
                }
            }
        }
        return instance;

    }

    public List<LogMessage> getLogs() {
        return Collections.unmodifiableList(logs);
    }

    private void log(String message, LogType logType) {
        logs.add(new LogMessage(message, logType, LocalDateTime.now()));
    }

    public void logInfo(String message) {
        ++infoCount;
        log(message, LogType.INFO);
    }

    public void logError(String message) {
        ++errorCount;
        log(message, LogType.ERROR);
    }

    public void logWarning(String message) {
        ++warningCount;
        log(message, LogType.WARNING);
    }

    public void showLog() {
        for (LogMessage logMessage : logs) {
            System.out.println(logMessage);
        }
        System.out.println("-------------------------------");
        System.out.printf("Info (%d), Warning (%d), Error (%d)%n", infoCount, warningCount, errorCount);
    }
}
