package natwest;

enum ExistingUsers {
    USER1(1000, "Tanishq", "Yadav", "123 Main St", "City1", 9000000001L, 100001),
    USER2(2000, "Naveen", "Jangra", "456 Elm St", "City2", 9000000002L, 100002),
    USER3(3000,"Utkarsh", "Singh", "456 Nightmare St", "City3", 9000000003L, 100003),
    USER4(4000,"Vaibhav", "Ahuja", "458 Carcosa St", "City4", 9000000004L, 100004),
    USER5(5000,"Simran", "Makhijani", "459 User St", "City5", 9000000005L, 100005);

    private double accountBalance;

    private String firstName;
    private String lastName;
    private String address;
    private String city;
    private Long phoneNumber;

    private long accountNumber;

    ExistingUsers(double accountBalance, String firstName, String lastName, String address, String city, Long phoneNumber, long accountNumber) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.city = city;
        this.phoneNumber = phoneNumber;
        this.accountNumber = accountNumber;
        this.accountBalance = accountBalance;
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



    public long getAccountNumber() {
        return accountNumber;
    }

    public void deposit(double amount) {
        this.accountBalance += amount;
    }

    public void withdraw(double amount) {
        this.accountBalance -= amount;
    }

    public void transfer(double amount) {
        this.accountBalance -= amount;
    }
}
