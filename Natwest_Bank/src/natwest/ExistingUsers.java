package natwest;

enum ExistingUsers {
    USER1("Tanishq", "Yadav", "123 Main St", "City1", 9000000001L, 1000.0),
    USER2("Naveen", "Jangra", "456 Elm St", "City2", 9000000002L, 2000.0),
    USER3("Utkarsh", "Singh", "456 Nightmare St", "City3", 9000000003L, 3000.0),
    USER4("Vaibhav", "Ahuja", "458 Carcosa St", "City4", 9000000004L, 4000.0),
    USER5("Simran", "Makhijani", "459 User St", "City5", 9000000005L, 5000.0)
    ;

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private Long phoneNumber;
    private double initialDeposit;

    private long accountNumber;

    ExistingUsers(String firstName, String lastName, String address, String city, Long phoneNumber, double initialDeposit) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.initialDeposit = initialDeposit;
        this.accountNumber = accountNumber;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getAddress() {
        return address;
    }

    public String getCity() {
        return city;
    }

    public Long getPhoneNumber() {
        return phoneNumber;
    }

    public double getInitialDeposit() {
        return initialDeposit;
    }

    public long getAccountNumber() {
        return accountNumber;
    }
}
