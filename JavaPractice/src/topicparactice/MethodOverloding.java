package topicparactice;

public class MethodOverloding {
	public int sum(int a)
	{
		return a;
	}
	
	private double sum(int a, int b)
	{
		return a+b;
	}
	public static void main(String[] args) {
		MethodOverloding md=new MethodOverloding();
		System.out.println("Sum of two numbers :");
		System.out.println(md.sum(10, 20));
		
		
	}

}
