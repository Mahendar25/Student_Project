package codepractice;

import java.util.Scanner;

public class Factorial {
    public static void main(String[] args) {
        Scanner s= new Scanner(System.in);
        System.out.print("Enter positive number: ");

        int num=s.nextInt();
        if(num<0)
        {
        	System.out.println("Plese enter positive number.");
        	
        }
        long fac=1;
    	for(int i=1;i<=num;i++)
        {
        	fac=fac*i;
        	
        }
        System.out.println("factorial of "+num+" is "+fac);
        s.close();
     }
}
