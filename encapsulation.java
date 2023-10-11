class BankAccount{

	private double balance;

	public void deposit(double ammount){
		if (ammount>0){
			balance+=ammount;
			System.out.println("Deoposit Sucessfull. New Balance: "+balance);

		}
		else{

			System.out.println("Invalid deposit amount ! ");
		}
	}

	public void withdraw(double ammount){
		if (ammount>0 && ammount<=balance)
		{
			balance-=ammount;
			System.out.println("Withdrawal Sucessfull. New balance: "+balance);

		}
		else{
			System.out.println("Invalid withdrawal ammount !");
		}
	}

	public void getBalance(){
		System.out.println("Current Balance :"+balance);
	}
}

class encapsulation{
	public static void main(String args[])
	{
		BankAccount b= new BankAccount();
		b.deposit(100);
		b.getBalance();
		b.withdraw(20);
		b.getBalance();
	}
}
