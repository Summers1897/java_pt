package com.k.thread.java.synchronized_.bank;
public class MoneyThread extends Thread {
	private Bank bank;
	public MoneyThread(Bank bank) {
		this.bank = bank;
	}
	@Override
	public void run() {
		System.out.println(bank.getMoney(800));
	}
}
