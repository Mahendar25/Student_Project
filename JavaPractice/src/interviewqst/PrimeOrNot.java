package interviewqst;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		System.out.println("Enter a number");
		Scanner s=new Scanner(System.in);
		int number=s.nextInt();
		int count=0;
		if(number>1)//the given number is must be bigger than 1
		{
			for(int i=1;i<=number;i++)//loop for checking the given number has number of factors and count shows the no.of factors
			{
				if(number%i==0)
				{
					count++;
				}
				
			}
			if(count==2)//here checking count has only two factors then print the number is prime number 
			{
				System.out.println("Is a prime number");
			}else
			{
				System.out.println("Is not a prime number");
			}
		}
		else
		{
			System.out.println("Is not a pirme number");
		}
		
		
	}

}
