package lianxi4;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class Account {

	private int id = 0;
	String name;
	private double balance = 0.0;
	private double annualInterestRate = 0.0;
	private Date dateCreate;
	ArrayList<Transactions> arrList = new ArrayList<>();
	public Account() {
	}
	public Account(int id, double balance) {
		super();
		this.id = id;
		this.balance = balance;
		dateCreate = new Date();
	}
	
	public Account(int id, String name, double balance) {
		super();
		this.id = id;
		this.name = name;
		this.balance = balance;
		dateCreate = new Date();
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public double getAnnualInterestRate() {
		return annualInterestRate;
	}
	public void setAnnualInterestRate(double annualInterestRate) {
		this.annualInterestRate = annualInterestRate;
	}
	public Date getDateCreate() {
		return dateCreate;
	}
	
	public double getMonthlyInterestRate() {
		
		return annualInterestRate/2;
	}
	
	public int withDraw(double rate) {
		if(rate>balance) {
			return 0;
		}
		balance -= rate;
		Transactions tt = new Transactions(new Date(), 'W', rate, balance, "衣服消费");
		arrList.add(tt);
		return 1;
	}
	
	public int deposit(double rate) {
		balance += rate;
		Transactions tt = new Transactions(new Date(), 'D', rate, balance, "工资收入");
		arrList.add(tt);
		return 1;
	}
	public static void main(String[] are) {
		Account account = new Account(1122,"George",20000);
		account.setAnnualInterestRate(4.5);
		account.withDraw(2500);
		account.deposit(3000);
		System.out.println("姓名:"+account.name+" 余额:"+account.getBalance()+" 月利息:"+account.getBalance()*account.getMonthlyInterestRate()/100+" 开户日期："+new SimpleDateFormat("yyyy-MM-dd").format(account.getDateCreate()));
	    for (Transactions tt : account.arrList) {
			System.out.println("交易时间："+new SimpleDateFormat("yyyy-MM-dd").format(tt.getDate())+
					"\n交易类型："+(tt.getType() == 'W'?"取款":"存款")+"\n交易金额："+tt.getAccount()+"\n余额："+tt.getBalance()+
					"\n备注："+tt.getDescription()+"\n");
		}
	}
}

class Transactions{
	Date date;
	char type;
	double account;
	double balance;
	String description;
	public Transactions(Date date, char type, double account, double balance, String description) {
		super();
		this.date = date;
		this.type = type;
		this.account = account;
		this.balance = balance;
		this.description = description;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public char getType() {
		return type;
	}
	public void setType(char type) {
		this.type = type;
	}
	public double getAccount() {
		return account;
	}
	public void setAccount(double account) {
		this.account = account;
	}
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
}