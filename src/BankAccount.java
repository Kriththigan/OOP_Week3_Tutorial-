public class BankAccount {
    protected double balance;
    public BankAccount(double balance){
        this.balance = balance;
    }
    public void deposit (double amount){
        this.balance += amount;
    }
    public void withdraw(double amount){
        this.balance -= amount;
    }
    public void printDetails(){
        System.out.println("BankAccount Balance:" + balance);
    }
}
