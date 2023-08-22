package natwest;

import java.time.LocalDateTime;
import java.util.UUID;




class Customer implements CustomerOperations {
    private static int customerIdCounter = 1;

    private UUID customerId;
    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private Long phoneNumber;
    private LocalDateTime joiningDate;

    public Customer(String firstName, String lastName, String address, String city, Long phoneNumber) {
        this.customerId = UUID.randomUUID();
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.joiningDate = LocalDateTime.now();
    }

    // Getters and setters

    public static int getCustomerIdCounter() {
        return customerIdCounter;
    }

    public static void setCustomerIdCounter(int customerIdCounter) {
        Customer.customerIdCounter = customerIdCounter;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public LocalDateTime getJoiningDate() {
        return joiningDate;
    }

    public void setJoiningDate(LocalDateTime joiningDate) {
        this.joiningDate = joiningDate;
    }

    @Override
    public String toString() {
        return "Customer ID: " + customerId + "\n" +
                "Name: " + firstName + " " + lastName + "\n" +
                "Address: " + address + "\n" +
                "City: " + city + "\n" +
                "Phone Number: " + phoneNumber + "\n" +
                "Joining Date: " + joiningDate;
    }

    public static Customer generateCustomer(String input) {
        String[] parts = input.split(",");
        return new Customer(parts[0], parts[1], parts[2], parts[3], Long.parseLong(parts[4]));
    }
}
