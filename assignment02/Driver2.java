package assignment02;

public class Driver2 {
    public static void main(String[] args) {
        Bank bank = new Bank();
        bank.createTestAccounts();
        double totalDue = bank.computeInterestRateToPay(5);
        System.out.println(totalDue);
    }
}
