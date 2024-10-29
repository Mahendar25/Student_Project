package interviewqst;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int n1=0,n2=1,sum=0;
		System.out.println("Enter a number: ");
		int num=s.nextInt();
		System.out.print("Fibonacci Series : ");
		System.out.print(n1+" "+n2);
		for(int i=2;i<=num;++i)
		{
			sum=n1+n2;
			n1=n2;
			n2=sum;
			System.out.print(" "+sum);
			
		}

	}

}
