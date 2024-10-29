package topicparactice;
class Account 
{
	int ac_no;
	String name;
	float amount;
	void status(String s,int i,float f)
	{
		name=s;
		ac_no=i;
		amount=f;
		
	}
	void deposit(float f)
	{
		amount+=f;
		System.out.println("Deposit "+f+"rupess");
	}
	void withdraw(float f)
	{
		if(amount<f)
		{
			System.out.println("insufficent balance");
		}
		else
		{
			amount-=f;
			System.out.println("Withdraw "+f+"rupess");
		}
	}
	void checkBal()
	{
		System.out.println("Profile : "+name+" "+"--Account Number--"+ac_no+" "+"--Blance--"+amount);
	}
	
}
public class Bank {

	public static void main(String[] args) {
		Account ac=new Account();
		ac.status("Vijju", 100, 1000);
		ac.status("Shsu", 100100, 100);
		ac.checkBal();
		ac.deposit(2000);
		ac.withdraw(500);
		ac.withdraw(2500);
		ac.withdraw(2500);
		ac.deposit(500);
		ac.checkBal();

	}

}
