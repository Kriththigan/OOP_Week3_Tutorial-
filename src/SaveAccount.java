public class SaveAccount extends Account {

    private double interestRate;
    public SaveAccount(double balance, double interestRate) {
        super(balance); // call parent constructor
        this.interestRate = interestRate;
    }
    @Override
    public void printStatement() {
        super.printStatement(); // call Account version
        System.out.println("Interest Rate: " + interestRate + "%");
    }
    public double getInterestRate() {
        return interestRate;
    }
}
