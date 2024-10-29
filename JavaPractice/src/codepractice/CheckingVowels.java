package codepractice;

import java.util.Scanner;

public class CheckingVowels {

	public static void main(String[] args) {
		System.out.println("Enter a string");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine().toUpperCase();
		int count=0;
		for(int i=0;i<=name.length()-1;i++)
		{
			char vc=name.charAt(i);
			if(vc=='A'||vc=='E'||vc=='I'||vc=='O'||vc=='U')
			{
				count++;
			}
		}
		System.out.println("Number of VOWELS are presnt in string is : "+count);

	}

}
