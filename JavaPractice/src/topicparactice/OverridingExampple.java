package topicparactice;
class Cars
{
	void bmw(String color)
	{
		System.out.println("BMW method in Cars class "+color);
	}
}
class Cars1 extends Cars
{
	@Override void bmw(String red)
	{
	
	System.out.println("BMW method in Cars1 class "+red);
	}
}
class Cars2 extends Cars1
{
	@Override 
	void bmw(String red)
	{
	
	System.out.println("BMW method in Cars2 class "+red);
	}
}
public class OverridingExampple {
	public static void main(String[] args) {
		//Cars1 c=new Cars1();
		//c.bmw("Black");
		Cars1 c2=new Cars2();
		c2.bmw("yellow");
	}

}
