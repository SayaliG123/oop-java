

public class account 
{
	int account_no;
	String accountholder_name;
	double balance;
	
	public account(int account_no,String name,double balance) 
	{
		this.account_no=account_no;
		this.accountholder_name=name;
		this.balance=balance;
	}
	void deposit(double amount)
	{
		balance += amount;
		System.out.println("deposited "+amount+" now balance is "+balance);
		
	}
	void withdraw(double amount)
	{
		if(balance>=amount)
		{
			balance-=amount;
			System.out.println("withdrawn "+amount+" now balance is "+balance);
			
		}
		else
		{
			System.out.println("insufficient balance");
		}
	}
	
		void check_balance()
		{
			System.out.println("balance is "+balance);
		}
	class saving_ac extends account
	{
		double intrestrate;
		public saving_ac(int account_no,String name,double balance,double intrestrate)
		{
			super(account_no,name,balance);
			this.intrestrate=intrestrate;
			
		}
		void addinrest()
		{
			double intrets=balance*intrestrate/100;
			balance += intrets;
			System.out.println("Added intrest is "+intrets+" new balance is "+balance);
			
		}
	}
	class current_ac extends account
	{
		double overdraftlimit;
		public current_ac(int account_no,String name,double balance,double overdraftlimit)
		{
			super(account_no,name,balance);
			this.overdraftlimit=overdraftlimit;
		}
		@Override
		void withdraw(double amount)
		{
			if(balance+overdraftlimit>=amount)
			{
				balance-=amount;
				System.out.println("withdrwn "+amount+" new balace is "+balance);
				
			}
			else
			{
				System.out.println("overdraft limit is reached");
			}
		}
	}

	public static void main(String[] args) 
	{
		account a=new account(123444,"sayali",100000);
		saving_ac sa=a.new saving_ac(123444,"sayali",100000,5);
		sa.check_balance();
		sa.addinrest();
		sa.deposit(2000);
		System.out.println();
		current_ac s2=a.new current_ac(22456,"ghadge",50000,20000);
		s2.withdraw(3000);
		s2.withdraw(80000);
		

	}

}

