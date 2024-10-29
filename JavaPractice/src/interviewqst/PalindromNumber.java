package interviewqst;

import java.util.Scanner;

public class PalindromNumber {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter Number");
		int num=s.nextInt();
		int temp=num;
		int rev=0;
		while(num>0)
		{
			rev=(rev*10)+num%10;
			num=num/10;
			
		}
		if(temp==rev)
		{
			System.out.println("Is a palindrom number.");
		}
		else
		{
			System.out.println("Is not a palindrom number.");
		}
		s.close();
	}
}
