package topicparactice;

public class CovariantOverriding {
	public static void main(String[] args) {
//		B obj=new B();
//		obj.my();
//		obj.msg();
		new B().my().msg();

	}

}
class A
{
	A my()
	{
		return this;
	}
}
class B extends A
{
	@Override /*A*/B my()
	{
		return this;
	}
	public void msg()
	{
		System.out.println("Covariant method ovrriding");
	}
}