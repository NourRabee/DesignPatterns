import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class LogMessage {
    private String message;
    private LogType logType;
    private LocalDateTime createdAt;

    public LogMessage(String message, LogType logType, LocalDateTime createdAt) {
        this.message = message;
        this.logType = logType;
        this.createdAt = createdAt;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public LogType getLogType() {
        return logType;
    }

    public void setLogType(LogType logType) {
        this.logType = logType;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }

    @Override
    public String toString() {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd hh:mm");
        String timestamp = createdAt.format(formatter);
        return String.format("%7s  [%s] %s", logType.toString(), timestamp, message);
    }
}
