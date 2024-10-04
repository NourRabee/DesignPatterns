import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MemoryLogger {
    private int infoCount;
    private int warningCount;
    private int errorCount;

    private List<LogMessage> logs = new ArrayList<>();

    private MemoryLogger() {

    }

    private static class LazyHolder {
        // Lazy initialization->The instance is created only when accessed for the first time
        private static final MemoryLogger instance = new MemoryLogger();
    }

    public static MemoryLogger getLogger() {

        return LazyHolder.instance;

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
