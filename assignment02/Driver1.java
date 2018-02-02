package assignment02;

public class Driver1 {
    public static void main(String[] args) {
        BankAccount1[] accs = new BankAccount1[3] ;

        accs[0]= new BankAccount1("0",100);
        accs[1]= new BankAccount1("111",50);
        accs[2]= new BankAccount1("222",50);

        Customer[] accs2 = new Customer[3] ;

        accs2[0]= new Customer("0",100);
        accs2[1]= new Customer("111",500);
        accs2[2]= new Customer("222",500);

        System.out.println(Question1.averageBankBalance(accs));
        System.out.println(Question1.lowestBankBalance(accs).getName());
        System.out.println(Question1.longestName(accs));
        System.out.println(Question1.averageCustomerBalance(accs2));
        System.out.println(Question1.greatestCustomerBalance(accs2).toString());
    }
}
