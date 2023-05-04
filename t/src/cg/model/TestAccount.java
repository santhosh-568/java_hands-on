package cg.model;

public class TestAccount {

	public static void main(String[] args) {
		Account a1=new Account(25678);
		System.out.println(a1);
		Account a2=new Account(56279,0.0);
		System.out.println(a2);
		System.out.println("account number is" + a2.getNumber());
		System.out.println("account balance is " +a2.getBalance() );
		a1.credit(245.0);
		System.out.println(a1);
		a1.debit(43.0);
		System.out.println(a1);
		a1.debit(222.0);
		a2.transfer(300.0, a1);
		System.out.println(a1);
		System.out.println(a2);
		

	}

}
