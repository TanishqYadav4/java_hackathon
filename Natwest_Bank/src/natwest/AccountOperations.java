package natwest;


import java.time.LocalDateTime;
import java.util.UUID;

interface AccountOperations {
    long getAccountNumber();
    double getAccountBalance();
    Category getAccountType();
    UUID getCustomerId();
    LocalDateTime getDateOpened();
    String toString();
}
