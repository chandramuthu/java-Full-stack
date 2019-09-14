package com.pro1.bean;

public class Transaction {
int transId;
long fromAccount;
long toAccount;
long oldBalance;
long newBalance;
public int getTransId() {
	return transId;
}
public void setTransId(int transId) {
	this.transId = transId;
}
public long getFromAccount() {
	return fromAccount;
}
public void setFromAccount(long fromAccount) {
	this.fromAccount = fromAccount;
}
public long getToAccount() {
	return toAccount;
}
public void setToAccount(long toAccount) {
	this.toAccount = toAccount;
}
public long getOldBalance() {
	return oldBalance;
}
public void setOldBalance(long oldBalance) {
	this.oldBalance = oldBalance;
}
public long getNewBalance() {
	return newBalance;
}
public void setNewBalance(long newBalance) {
	this.newBalance = newBalance;
}
public String getTransactionType() {
	return transactionType;
}
public void setTransactionType(String transactionType) {
	this.transactionType = transactionType;
}
String transactionType;
@Override
public String toString() {
	return "Transaction [transId=" + transId + ", fromAccount=" + fromAccount + ", toAccount=" + toAccount
			+ ", oldBalance=" + oldBalance + ", newBalance=" + newBalance + ", transactionType=" + transactionType
			+ "]";
}
}
//transaction class