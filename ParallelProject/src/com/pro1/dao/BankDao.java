package com.pro1.dao;

import java.util.List;

import com.pro1.bean.Account;
import com.pro1.bean.Transaction;

public interface BankDao {
	Account createAccount(Account account);
	long accountBalance(Long accNo1);
	Account depositAmt(long accNo1, long depAmt);
	Account withdrawAmt(long accNo1, long withAmt);
	Account transfer(long accNo1, long accNo2, long amt);

	List <Transaction> printTransactions();
}


