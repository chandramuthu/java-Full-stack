package com.pro1.service;

import java.util.List;

import com.pro1.bean.Account;
import com.pro1.bean.Transaction;

public interface BankService {
Account createAccount(Account account);
long accountBalance(Long accNo1);
Account depositAmt(long accNo1, long depAmt);
Account withdrawAmt(long accNo1, long withAmt);
Account transfer(long accNo1, long accNo2, long amt);
List <Transaction> printTransactions();
boolean custNameOk(String custName);
boolean custNumOk(long custNum);
boolean accountTypeValidation(String accType);
}
//service