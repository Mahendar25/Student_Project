package interviewqst;

import java.util.Scanner;

public class NumberOfWords {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a String ");
		String name=s.nextLine();
		int count=1;
		for(int i=0;i<name.length()-1;i++)
		{
			if((name.charAt(i)==' ')&&(name.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		System.out.println("Number of words in a string : "+count);
	}

}
