package codepractice;

public class Swapping {

	public static void main(String[] args) {
		int a=20;
		int b=40;
		System.out.println("Before swapping");
		System.out.println("a = "+a);
		System.out.println("b = "+b);
		System.out.println("After swapping");
		a=a+b;//20+40= 60
		b=a-b;//60-40= 20
		a=a-b;//60-20= 40
		System.out.println("a = "+a);
		System.out.println("b = "+b);

	}

}
