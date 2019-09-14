package com.pro1.bean;

public class Account {
	String custName;
	String branchName;
	String accType;
	long balance;
	long accNo;
	long custNum;
	public String getCustName() {
		return custName;
	}
	public void setCustName(String custName) {
		this.custName = custName;
	}
	public String getBranchName() {
		return branchName;
	}
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	public String getAccType() {
		return accType;
	}
	public void setAccType(String accType) {
		this.accType = accType;
	}
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance;
	}
	public long getAccNo() {
		return accNo;
	}
	public void setAccNo(long accNo) {
		this.accNo = accNo;
	}
	public long getCustNum() {
		return custNum;
	}
	public void setCustNum(long custNum) {
		this.custNum = custNum;
	}
	@Override
	public String toString() {
		return "Account [custName=" + custName + ", branchName=" + branchName + ", accType=" + accType + ", balance="
				+ balance + ", accNo=" + accNo + ", custNum=" + custNum + "]";
	}
	
	
	
}
//Account main Class