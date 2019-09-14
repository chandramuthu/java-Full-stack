package com.pro1.exep;

@SuppressWarnings("serial")
public class AccountNotFoundException extends RuntimeException{
	public AccountNotFoundException(final String msg)
	{
		super(msg);
	}

}
