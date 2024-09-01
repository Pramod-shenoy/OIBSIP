# OIBSIP
Project Overview:
This Java program is a simple banking application that simulates basic operations for a savings account. It allows users to create an account, deposit and withdraw money, and view the transaction history. The program is designed to handle multiple accounts and ensures safe transactions by validating input amounts and managing account balances.

Key Components:
Main Class (op):

Contains the logic for account management and transaction processing.
Manages the total number of accounts created.
Account Class (acc):

Represents a generic bank account with attributes like name, account number, balance, account type, and a transaction history.
Provides methods for depositing and withdrawing funds and printing transaction history.
Savings Account Class (SavingsAccount):

Inherits from the acc class and is specifically tailored for savings accounts.
Includes basic functionality for handling deposits and withdrawals, without applying interest.
Exception Handling (InvalidTransactionException):

Custom exception to manage invalid transactions, such as attempting to deposit a non-positive amount or withdrawing more than the available balance.
User Interaction:

The main method prompts users to input their details and interact with their account through deposits and withdrawals.
The program outputs the updated balance and transaction history after each operation.
Usage:
This code can be used as the foundation for a more comprehensive banking application. It demonstrates fundamental OOP concepts in Java, such as inheritance, encapsulation, and exception handling. It’s a good starting point for learning how to manage account-related operations in a software application.
