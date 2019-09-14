package com.pro1.service;

import java.util.List;

import com.pro1.bean.Account;
import com.pro1.bean.Transaction;
import com.pro1.dao.BankDao;
import com.pro1.dao.BankDaoImpl;

public class BankServiceImpl implements BankService {
	BankDao dao = new BankDaoImpl();

	@Override
	public Account createAccount(Account account) {
		// TODO Auto-generated method stub
		return dao.createAccount(account);
	}

	@Override
	public long accountBalance(Long accNo1) {
		// TODO Auto-generated method stub
		return dao.accountBalance(accNo1);

	}

	@Override
	public Account depositAmt(long accNo1, long depAmt) {
		// TODO Auto-generated method stub
		return dao.depositAmt(accNo1, depAmt);
	}

	@Override
	public Account withdrawAmt(long accNo1, long withAmt) {
		return dao.withdrawAmt(accNo1, withAmt);
	}

	@Override
	public Account transfer(long accNo1, long accNo2, long amt) {
		// TODO Auto-generated method stub
		return dao.transfer(accNo1, accNo2, amt);
	}

	@Override
	public List<Transaction> printTransactions() {
		// TODO Auto-generated method stub
		return dao.printTransactions();
	}

	@Override
	public boolean custNameOk(String custName) {
		// TODO Auto-generated method stub
		if(custName.matches("[A-Z][a-z A-z]*"))
		{
        return true;
		}
        else
        {
        	return false;
        }
           
       
	}

	@Override
	public boolean custNumOk(long custNum) {
		String custNum1=Long.toString(custNum);
		if(custNum1.matches("[6-9][0-9]{9}"))
		{
        return true;
		}
        else
        {
        	return false;
        }
	}

	@Override
	public boolean accountTypeValidation(String accType) {
		  if (accType.equalsIgnoreCase("saving") || accType.equalsIgnoreCase("current") )
		  {
	            return true;
		  }
		  else{
		return false;
		  }
	}

	

}// serviceimpl