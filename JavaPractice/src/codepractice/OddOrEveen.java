package codepractice;

import java.util.Scanner;
public class OddOrEveen{
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.print("Enter how many times you want check: ");
		int c=s.nextInt();
		for(int i=1;i<=c;i++)
		{
			System.out.print("Enter a number: ");
			int num=s.nextInt();
			if(num%2==0)
			{
				System.out.println(num+" is Even number");
			}
			else
			{
				System.out.println(num+" is Odd number");
			}
		}
		s.close();
	}
}