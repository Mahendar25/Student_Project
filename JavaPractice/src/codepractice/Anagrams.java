package codepractice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Anagrams {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter a string-1 name : ");
		String name1=s.nextLine().toLowerCase();
		
		System.out.println("Enter a string-2 name : ");
		String name2=s.nextLine().toLowerCase();
	//	System.out.print(name1+","+name2);
		char[] c1=name1.toCharArray();
		char[] c2=name2.toCharArray();
		ArrayList<String> arr=new ArrayList<>();
		arr.add(name1);
		arr.add(name2);
		System.out.print(arr);
		Arrays.sort(c1);
		Arrays.sort(c2);
		if(Arrays.equals(c1, c2))
		{
			System.out.println("--they are anagrams");
		}
		else
		{
			System.out.println("--they are not anagrams");
		}
	}

}
