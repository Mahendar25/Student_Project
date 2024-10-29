package interviewqst;

import java.util.Scanner;

public class CountCharRep {

	public static void main(String[] args) {
		System.out.println("Enter String");
		Scanner s=new Scanner(System.in);
		String name=s.nextLine();
		int tc=name.length();
		int af_tc=name.replace("J","").length();
		int count=tc-af_tc;
		System.out.println("Number of times repeating a character: "+count);
		

	}

}
