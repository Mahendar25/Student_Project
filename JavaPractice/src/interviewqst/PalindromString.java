package interviewqst;

import java.util.Scanner;

public class PalindromString {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string");
		String name=s.nextLine();
		String temp=name.toLowerCase();
		String rev="";
		for(int i=name.length()-1;i>=0;i--)
		{
			rev=rev+name.toLowerCase().charAt(i);
		}
		if(temp.equals(rev))
		{
			System.out.println("Is a Palindrom String.");
		}
		else
		{
			System.out.println("Is not a Plaindrom String.");
		}
		s.close();
	}


}
