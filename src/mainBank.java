public class mainBank {
    public static void main(String[] args) {

        // Substitution Principle:
        // A SavingsAccount object can be stored in an Account reference
        Account accX = new SaveAccount(2000, 4.5);

        // Create an array of Accounts for polymorphism
        Account[] accounts = {
                new Account(1000),
                new SaveAccount(1500, 3.2),
                new SaveAccount(2500, 5.0),
                accX   // polymorphic reference
        };

        // Dynamic binding: correct printStatement() is chosen at runtime
        for (Account acc : accounts) {
            System.out.println("----- STATEMENT -----");
            acc.printStatement();

            // Using instanceof to check the actual type
            if (acc instanceof SaveAccount) {
                SaveAccount sa = (SaveAccount) acc; // safe cast
                System.out.println("This is a Savings Account.");
                System.out.println("Interest Rate: " + sa.getInterestRate() + "%");
            } else {
                System.out.println("This is a regular Account.");
            }

            System.out.println();
        }
    }
}
