package codepractice;

import java.util.Scanner;
public class StudentGrading {

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println("Enter student name: ");
		String sn=s.nextLine();
		System.out.println("Enter student marks: ");
		int marks=s.nextInt();
		String grade;
		if(marks>100)
		{
			grade="I";
		}
		else if(marks>=90&&marks<=100)
		{
			grade="A";
		}
		else if(marks>=70&&marks<90)
		{
			grade="B";
		}
		else if(marks>=55&&marks<70) {
			grade="C";
		}
		else if(marks>=40&&marks<55) {
			grade="D";
		}
		else
		{
			grade="F";
		}
		System.out.println("Student: "+sn);
		System.out.println("Marks: "+marks);
		System.out.print("Grade: ");
		switch(grade)
		{
		case "A":
			System.out.println("Good student");
			break;
		case "B":
			System.out.println("Avarage student");
			break;
		case "C":
			System.out.println("Need to imoprove skills");
			break;
		case "D":
			System.out.println("Week student");
			break;
		case "F":
			System.out.println("Fail");
			break;
		case "I":
			System.out.println("Invalid Marks");
			break;
		}
		s.close();
	}

}
