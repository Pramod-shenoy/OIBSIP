import java.util.*;

public class op {

    public static int account = 0;

    public class acc {

        private String name;
        private int accno;
        private double balance;
        private ArrayList<String> history;
        private String acctype;

        acc(String name, int accno, double initialDeposit, String accountType) {
            this.name = name;
            this.accno = accno;
            this.balance = initialDeposit;
            this.history = new ArrayList<>();
            this.acctype = accountType;
            this.history.add("Initial deposit: " + initialDeposit + " into " + accountType + " account");
            account++;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getName() {  
            return name;
        }

        public void setAccno(int accno) {
            this.accno = accno;
        }

        public int getAccno() {
            return accno;
        }

        public double getBalance() {
            return balance;
        }

        public String getAcctype() {
            return acctype;
        }

        public void deposit(double amount) throws InvalidTransactionException { 
            if (amount <= 0) {
                throw new InvalidTransactionException("Deposit amount must be greater than zero");
            }
            balance += amount;
            history.add("Deposit: " + amount);
        }

        public void deposit(double[] amounts) throws InvalidTransactionException {
            for (double amount : amounts) {
                deposit(amount);
            }
        }

        public void withdraw(double amount) throws InvalidTransactionException {
            if (amount <= 0) {
                throw new InvalidTransactionException("Withdrawal amount must be greater than zero");
            }
            if (amount > balance) {
                throw new InvalidTransactionException("Insufficient balance");
            }
            balance -= amount;
            history.add("Withdrawal: " + amount);
        }

        public void printHistory() {
            System.out.println("Transaction History for account " + accno + " (" + acctype + "):");
            for (String record : history) {
                System.out.println(record);
            }
        }

        public static int getTotalAccounts() { 
            return account;
        }
    }

    public class SavingsAccount extends acc {
        private double interestRate;

        SavingsAccount(String name, int accno, double initialDeposit, double interestRate) {
            super(name, accno, initialDeposit, "Savings");
            this.interestRate = interestRate;
        }

        public void applyInterest() {
            double interest = getBalance() * (interestRate / 100);
            try {
                deposit(interest);
                System.out.println("Interest of " + interest + " applied to account " + getAccno());
            } catch (InvalidTransactionException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public class InvalidTransactionException extends Exception { 
        public InvalidTransactionException(String message) {
            super(message);
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.print("Enter your account number: ");
        int accno = scanner.nextInt();

        System.out.print("Enter initial deposit: ");
        double initialDeposit = scanner.nextDouble();

        System.out.print("Enter interest rate for Savings Account: ");
        double interestRate = scanner.nextDouble();

        op obsip = new op();  
        SavingsAccount savingsAccount = obsip.new SavingsAccount(name, accno, initialDeposit, interestRate);

        System.out.println("\nAccount created successfully!");
        System.out.println("Account name: " + savingsAccount.getName());
        System.out.println("Account number: " + savingsAccount.getAccno());
        System.out.println("Initial balance is: " + savingsAccount.getBalance());

        try {
            System.out.print("\nEnter the amount to deposit: ");
            double depositAmount = scanner.nextDouble();
            savingsAccount.deposit(depositAmount);
            System.out.println("Balance after deposit is: " + savingsAccount.getBalance());

            System.out.print("\nEnter the amount to withdraw: ");
            double withdrawAmount = scanner.nextDouble();
            savingsAccount.withdraw(withdrawAmount);
            System.out.println("Balance left after the withdrawal is: " + savingsAccount.getBalance());

            System.out.println("\nApplying interest...");
            savingsAccount.applyInterest();
            System.out.println("Balance after applying interest: " + savingsAccount.getBalance());

        } catch (InvalidTransactionException e) {  
            System.out.println(e.getMessage());
        }

        System.out.println("\nPrinting transaction history:");
        savingsAccount.printHistory();

        System.out.println("\nTotal number of accounts created: " + acc.getTotalAccounts());

        scanner.close();
    }
}
