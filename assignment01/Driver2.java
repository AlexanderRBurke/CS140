package assignment01;

public class Driver2 {
    public static void main(String[] args) {
        Customer cust = new Customer("Jane Smith", 100.0);
        System.out.println(cust);
        Customer cust2 = new Customer("John Doe", 10.0);
        System.out.println(cust.hasMoreFundsThan(cust2));
        System.out.println(cust2.hasMoreFundsThan(cust));
    }
}

