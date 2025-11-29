public class main_b {
    public static void main(String[] args){
        BankAccount acc1 = new BankAccount(500.0);
        acc1.printDetails();
        System.out.println();

        SavingsAccount acc2 = new SavingsAccount(1000.0, 5.0);
        acc2.printDetails();
        System.out.println();

        BankAccount acc3 = new SavingsAccount(2000.0, 3.5);
        acc3.printDetails();
        System.out.println();
    }
}
