package assignment02;

public class Bank {
    private Customer[] customers = new Customer[2000];

    public void createTestAccounts(){
        for(int i = 0; i<=1999; i++){
            customers[i] = new Customer("Name"+i, 100+Math.random()*10000);
        }
    }

    public double computeInterestRateToPay(double rate){
        double totalInterest = 0;
        for (Customer i: customers) {
            double tempBal = i.getBalance();
            if (tempBal<1000) {
                totalInterest += rate / 1200 * tempBal;
            }
            else{
                totalInterest += 1.5*rate/1200 * tempBal;
            }
        }
        return totalInterest;
    }
}
