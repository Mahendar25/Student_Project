package codepractice;

import java.util.Scanner;
public class BanakingSystem {
	static double bal=1000.0;
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int c;
		 System.out.println("    --- Menu ---");
         System.out.println("Check Balance enter-1");
         System.out.println("Deposit Money enter-2");
         System.out.println("Withdraw Money enter-3");
         System.out.println("Exit enter-4");
         do {
        	 System.out.print("Enter your choice: ");
        	 c=s.nextInt();
        	 switch(c)
        	 {
        	 case 1:
        		 checkBalance();
        		 break;
        	 case 2:
        		 depositMoney(s);
        		 break;
        	 case 3:
        		 withdrawMoney(s);
        		 break;
        	 case 4:
        		 System.out.println("Thank you for using our bankig sytem.Have a nice day ");
        	 	break;
        	 default:
        		 System.out.println("Invalid choice plese enter valid choice");
        		 break;
        	 }
         }while(c!=4);
        
	}
	private static void withdrawMoney(Scanner s) {
		System.out.println("Enter amout to withdraw: $");
		double withd=s.nextDouble();
		if(withd>0)
		{
			if(withd<=bal)
			{
				bal=bal-withd;
				System.out.println("Successfully withdraw: $"+withd);
				
			}
			else
			{
				System.out.println("Insuficent Balance");
			}
		}
		else
		{
			System.out.println("Invalid amount enterd ");
		}
		
		
	}
	private static void depositMoney(Scanner s) {
		System.out.println("Enter amount to deposit: $");
		double dep=s.nextDouble();
		if(dep>0)
		{
			bal=bal+dep;
			System.out.println("Successfully deposited: $" + dep);	
		}
		else
		{
			System.out.println("Invalid amount enterd");
		}
		
	}
	private static void checkBalance() {
		System.out.println("Current balance: $"+bal);
		
	}

}
