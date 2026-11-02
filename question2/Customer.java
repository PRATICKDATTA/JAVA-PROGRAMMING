package question2;

public class Customer {
    protected String customerId;
    protected String customerName;
    protected String contactNumber;
    protected String email;

    public Customer(String customerId, String customerName, String contactNumber, String email) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.contactNumber = contactNumber;
        this.email = email;
    }

    public void displayCustomerInfo() {
        System.out.println("Customer ID    : " + customerId);
        System.out.println("Customer Name  : " + customerName);
        System.out.println("Contact Number : " + contactNumber);
        System.out.println("Email          : " + email);
    }
}
