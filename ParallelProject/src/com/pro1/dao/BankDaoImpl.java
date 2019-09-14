package com.pro1.dao;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.pro1.bean.Account;
import com.pro1.bean.Transaction;
import com.pro1.exep.AccountNotFoundException;

public class BankDaoImpl implements BankDao{
	Map<Long,Account> hash1=new HashMap<Long,Account>();
	Map<Transaction,Integer> hash2=new HashMap<Transaction,Integer>();
	@Override
	public Account createAccount(Account account) {
		return hash1.put(account.getAccNo(),account);
	}
	@Override
	public long accountBalance(Long accNo1) {
		Account a=hash1.get(accNo1);
		if(a==null)
		{
			throw new AccountNotFoundException("Enter Valid Account Number");
		}
		long bal=a.getBalance();
		return bal;
	}
	@Override
	public Account depositAmt(long accNo1, long depAmt) {
		Account a=hash1.get(accNo1);
		if(a==null)
		{
			throw new AccountNotFoundException("Enter Valid Account Number");
		}
		long bal1=a.getBalance();
		long bal2=bal1+depAmt;
		a.setBalance(bal2);
		Transaction t=new Transaction();
		t.setOldBalance(bal1);
		t.setNewBalance(bal2);
		t.setToAccount(accNo1);
		t.setTransactionType("Deposit");
		t.setTransId(100);
		hash2.put(t,100);
		return a;
	}
	@Override
	public Account withdrawAmt(long accNo1, long withAmt) {
		Account a=hash1.get(accNo1);
		if(a==null)
		{
			throw new AccountNotFoundException("Enter Valid Account Number");
		}
		long bal1=a.getBalance();
		long bal2=bal1-withAmt;
		a.setBalance(bal2);
		Transaction t=new Transaction();
		t.setOldBalance(bal1);
		t.setNewBalance(bal2);
		t.setFromAccount(accNo1);
		t.setTransactionType("WithDraw");
		t.setTransId(200);
		hash2.put(t,200);
		return a;
	}
	@Override
	public Account transfer(long accNo1, long accNo2,long amt) {
		Account a=hash1.get(accNo1);
		if(a==null)
		{
			throw new AccountNotFoundException("Enter Valid Account Number");
		}
		long bal1=a.getBalance();
		Account b=hash1.get(accNo2);
		if(b==null)
		{
			throw new AccountNotFoundException("Enter Valid Account Number");
		}
		long bal2=a.getBalance();
		bal1=bal1-amt;
		bal2=bal2+amt;
		a.setBalance(bal1);
		b.setBalance(bal2);
		Transaction t=new Transaction();
		t.setOldBalance(bal1);
		t.setNewBalance(bal2);
		t.setFromAccount(accNo1);
		t.setToAccount(accNo2);
		t.setTransactionType("transfer");
		t.setTransId(300);
		hash2.put(t,300);
		return a;
	}

	@Override
	public List <Transaction> printTransactions() {
		List<Transaction> List=new ArrayList<Transaction>(hash2.keySet());
		return List ;
	}


}

//daoimpl
