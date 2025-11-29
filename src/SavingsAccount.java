public class SavingsAccount extends BankAccount {
    private double interestRate;
    public SavingsAccount(double balance, double interestRate){
        super(balance);
        this.interestRate = interestRate;
    }
    @Override
    public void printDetails(){
        System.out.println("SavingsAccount Balance:" + balance);
        System.out.println("Interest Rate:" + interestRate + "%");
    }
}
