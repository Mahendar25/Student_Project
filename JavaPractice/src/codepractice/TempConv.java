package codepractice;

import java.util.Scanner;

public class TempConv {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("-- Choose convertion you want --");
		System.out.println("Celsius to Fahrenheit-->Enter 1 ");
		System.out.println("Fahrenheit to Celsius-->Ener 2  ");
		
		int num=s.nextInt();
		if(num==2)
		{
			System.out.println("Enter temperature in Fahrenheit: ");
			double fah=s.nextDouble();
			double cels=(fah-32)*5/9;
			System.out.println("Temperature in Celsius: "+cels);
			
		}
		else if(num==1)
		{
			System.out.println("Enter temperature in Celsius: ");
			double cels1=s.nextDouble();
			double fah1=(cels1*9/5)+32;
			System.out.println("Temperature in Fahrenheit: "+fah1);
			
		}
		else
		{
			System.out.println("Invalid choice");
		}
		s.close();
	}

}
