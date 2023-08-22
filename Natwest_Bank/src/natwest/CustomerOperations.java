package natwest;

import java.time.LocalDateTime;
import java.util.UUID;

interface CustomerOperations {
    UUID getCustomerId();
    String getFirstName();
    String getLastName();
    String getAddress();
    String getCity();
    Long getPhoneNumber();
    LocalDateTime getJoiningDate();
    String toString();
}
