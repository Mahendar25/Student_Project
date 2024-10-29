package topicparactice;

public class InstanceOf {

	public static void main(String[] args) {
		Super sb=new Sub();
	//	Sub sub = new Sub();
	//	System.out.println(s instanceof Sub);
		Sub.show(sb);
	}

}
class Super
{
}
class Sub extends Super
{
	static void show(Super sp)
	{
		if(sp instanceof Sub)
		{
			Sub sb=(Sub)sp;//down casting 
			System.out.println("Sub class");
		}
		
	}
	
}