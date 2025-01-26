import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime;

public class UserInteractionLogger {

    private static final String LOG_FILE = "src/resources/data/user_interactions.log";

    // Method to log search interactions
    public void logSearch(String searchTerm) {
        log("Search for: " + searchTerm);
    }

    // Method to log sorting interactions
    public void logSort(String sortCriteria) {
        log("Sorted by: " + sortCriteria);
    }

    // Method to log viewing all books
    public void logViewAllBooks() {
        log("Viewed all books");
    }

    // Generic method to log messages with a timestamp
    public void log(String message) {
        // Ensure the directory exists
        File logFile = new File(LOG_FILE);
        logFile.getParentFile().mkdirs(); // Create directories if they don't exist

        try (FileWriter writer = new FileWriter(logFile, true)) { // Open file in append mode
            String logEntry = LocalDateTime.now() + " - " + message + System.lineSeparator();
            writer.write(logEntry); // Write the log entry to the file
        } catch (IOException e) { // Handle exceptions
            System.err.println("An error occurred while writing to the log file: " + e.getMessage());
        }
    }
}
