package com.k.thread.java.synchronized_.bank;
public class FetchMoneyTest {
	public static void main(String[] args) {
		Bank bank = new Bank();
		Thread t1 = new MoneyThread(bank);// 从银行取钱
		Thread t2 = new MoneyThread(bank);// 从取款机取钱
		t1.start();
		t2.start();
	}
}
