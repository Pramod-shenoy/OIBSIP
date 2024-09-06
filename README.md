# Java ATM System Simulation

Introduction
This project is a Java-based ATM system that simulates basic ATM operations for a savings account. The system enables users to create an account, deposit and withdraw funds, and view their transaction history. It includes validation and exception handling to ensure smooth and secure transactions, demonstrating essential object-oriented programming (OOP) concepts like inheritance, encapsulation, and exception handling.

Features:-
Create an Account: Users can create a savings account with a name, account number, and an initial deposit.
Deposit Funds: Users can deposit money into their account, with all deposits logged in the transaction history.
Withdraw Funds: Users can withdraw money, with the balance being checked to ensure sufficient funds.
Transaction History: Users can view their transaction history, which includes deposits and withdrawals.
Error Handling: Custom exception handling for invalid deposits or withdrawals (e.g., insufficient funds).
Account Count: The system tracks the total number of accounts created.

Project Structure
1. op (Main Class)
Responsibilities:
The central class that coordinates the creation and management of accounts.
Contains inner classes for the account structure and custom exceptions.

2. acc (Account Class)
Responsibilities:
Represents a bank account with attributes such as name, account number, balance, and transaction history.
Provides essential methods for depositing, withdrawing, and viewing the account’s transaction history.
Ensures that the transaction history is updated for each operation.
Key Methods:
deposit(double amount): Deposits a specified amount into the account, with input validation.
withdraw(double amount): Withdraws money, ensuring the amount doesn’t exceed the available balance.
printHistory(): Prints the entire transaction history of the account.

3. SavingsAccount Class
Responsibilities:
A specialized subclass of acc representing a savings account.
Inherits the features of the base account class and is currently tailored for basic ATM operations without additional savings-specific features like interest.

4. InvalidTransactionException Class
Responsibilities:
A custom exception class that handles invalid ATM transactions, such as depositing a negative amount or attempting to withdraw more than the account balance.
Application Flow
Account Creation:

Users are prompted to enter their name, account number, and initial deposit.
The program creates a SavingsAccount object and initializes it with the user's information.
ATM Transactions:

Deposit: The user enters an amount to deposit. The system validates the amount and updates the balance.
Withdraw: The user inputs an amount to withdraw. The system checks if the balance is sufficient before processing the withdrawal.
View Transaction History:

Users can view a log of all transactions, including deposits and withdrawals.
Account Summary:

The system provides a summary at the end, showing the total number of accounts created.
How to Run the Program
Steps to Compile and Run:
Clone the Repository:

bash
Copy code
git clone https://github.com/Pramod-shenoy/OIBSIP.git
cd OIBSIP

Compile the Java Files:
bash
Copy code
javac op.java

Run the Program:
bash
Copy code
java op

Interact with the System:
Follow the prompts to create a savings account, deposit funds, withdraw money, and view transaction history.
Future Improvements
Interest Application: Add functionality to calculate and apply interest to savings accounts.
Multiple Account Types: Expand the system to support different types of accounts (e.g., checking accounts).
Data Persistence: Implement file or database storage to save account data across multiple sessions.
User Authentication: Introduce PIN-based authentication for enhanced account security.

Contribution
Contributions are welcome! Feel free to fork this repository, make your changes, and submit a pull request. Please ensure your changes are well-tested and follow the project’s coding standards.

