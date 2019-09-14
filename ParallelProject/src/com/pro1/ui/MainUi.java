package com.pro1.ui;

import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

import com.pro1.bean.Account;
import com.pro1.bean.Transaction;
import com.pro1.exep.AccountNotFoundException;
import com.pro1.service.BankService;
import com.pro1.service.BankServiceImpl;

public class MainUi {
	static BankService service = new BankServiceImpl();
	static Scanner scanner = new Scanner(System.in);

	public static void main(String[] args) {
		while (true) {
			System.out.println("Welcome to the Application"); //
			System.out.println("****************************");
			System.out.println("1. Create Account");
			System.out.println("2. Show Balance");
			System.out.println("3. Deposit");
			System.out.println("4. Withdraw");
			System.out.println("5. Fund Transfer");
			System.out.println("6. Print Transaction");
			System.out.println("Enter your Choice");
			int option = scanner.nextInt();
			switch (option) {
			case 1:
				try {
					String custName;
					long custNum;
					String accType;
					boolean accTypeValid = false;
					boolean isOkName = false;

					do {
						System.out.println("Enter the Customer Name:  ");
						custName = scanner.next();
						isOkName = service.custNameOk(custName); // Method
																	// calling
																	// for
																	// Customer
																	// name
																	// validation
						if (!isOkName) {
							System.out.println("Please enter Alphabets only");
						}
					} while (!isOkName);
					boolean isOkNum;
					do {
						System.out.println("Enter the Contact Number : ");
						custNum = scanner.nextLong();
						 isOkNum = service.custNumOk(custNum);// Method calling
																// for Mobile
																// number
																// validation
						if (!isOkNum) {
							System.out.println("Please enter Correct Mobile Number");
						}
					} while (!isOkNum);

					System.out.println("Enter the Branch Name : ");
					String branchName = scanner.next();

					do {
						System.out.println("Enter the Account Type('Savings' or 'Current') : ");
						accType = scanner.next();
						accTypeValid = service.accountTypeValidation(accType); // Method
																				// calling
																				// for
																				// account
																				// type
																				// validation
						if (!accTypeValid) {
							System.out.println("Enter Valid Account Type \n Savings or Current");
						}
					} while (!accTypeValid);

					System.out.println("Enter the Account Opening Balance : ");
					long balance = scanner.nextLong();
					long accNo = custNum + 1000;
					Account account = new Account();
					account.setAccNo(accNo);
					account.setAccType(accType);
					account.setBalance(balance);
					account.setBranchName(branchName);
					account.setCustName(custName);
					account.setCustNum(custNum);
					service.createAccount(account);
					System.out.println("Account created successfully with Account Number" + account.getAccNo());
					System.out.println(account);
				} catch (AccountNotFoundException e) {
					System.out.println(e.getMessage());
				}

				break;

			case 2:
				try {
					System.out.println("Enter the Account Number : ");
					long accNo1 = scanner.nextLong();
					long balan = service.accountBalance(accNo1);
					System.out.println("Balance in Account is " + balan);
					System.out.println("Balance Displayed");
				} catch (InputMismatchException ae) {
					// System.out.println(ae.getMessage());
					System.out.println("Input Type is Mismatch");
				} catch (AccountNotFoundException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 3:
				try {
					System.out.println("Enter the Account Number : ");
					long accNo1 = scanner.nextLong();
					System.out.println("Enter the Amount to be Deposited : ");
					long depAmt = scanner.nextLong();
					Account a = service.depositAmt(accNo1, depAmt);
					System.out.println("Balance in Account is: " + a.getBalance());
					System.out.println("Deposit Done Successfully");
				} catch (AccountNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 4:
				try {
					System.out.println("Enter the Account Number : ");
					long accNo1 = scanner.nextLong();
					System.out.println("Enter the Amount to be WithDrawn : ");
					long withAmt = scanner.nextLong();
					Account a = service.withdrawAmt(accNo1, withAmt);
					System.out.println("Balance in Account is: " + a.getBalance());
					System.out.println("Balance Displayed");
				} catch (AccountNotFoundException e) {
					System.out.println(e.getMessage());
				}
				break;
			case 5:
				try {
					System.out.println("Enter the Sender Account number");
					long accNo1 = scanner.nextLong();
					System.out.println("Enter the receiver Account number");
					long accNo2 = scanner.nextLong();
					System.out.println("Enter the Amount to transfer");
					long amt = scanner.nextLong();
					service.transfer(accNo1, accNo2, amt);
					System.out.println("Amount Transfered");
					System.out.println("Balance in Sender Account is: " + service.accountBalance(accNo1));
					System.out.println("Balance in Receiver Account is: " + service.accountBalance(accNo2));
				} catch (AccountNotFoundException e) {
					System.out.println(e.getMessage());
				}

				break;
			case 6:
				try {
					System.out.println("Showing all the Transaction");
					List<Transaction> result = service.printTransactions();
					Iterator<Transaction> itr = result.iterator();
					System.out.println(
							"===============================================================================================================");
					System.out.println(
							"Tran  Id      Tran Type      New Balance     Old Balance          From Account          To Account    ");
					System.out.println(
							"===============================================================================================================");

					while (itr.hasNext()) {
						Transaction tran = itr.next();

						System.out.println(tran.getTransId() + "           " + tran.getTransactionType() + "           "
								+ tran.getNewBalance() + "            " + tran.getOldBalance() + "             "
								+ tran.getFromAccount() + "            " + tran.getToAccount() + "               ");
						// System.out.println(itr.next());
					}
				} catch (Exception e) {
					System.out.println("Enter Valid information");
				}
				break;
			case 7:
				try {
					System.out.println("Thank You");
					System.exit(0);
				} catch (Exception e) {
					System.out.println("Enter Valid information");
				}
				break;
			default:
				System.out.println("Wrong Choice!!!!!!");
				break;
			}
		}
	}
} // main ui
