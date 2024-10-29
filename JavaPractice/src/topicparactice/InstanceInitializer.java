package topicparactice;

public class InstanceInitializer {
//	int speed;
//	int dis=200;
//	
//	InstanceInitializer()
//	{
//		super();
//		{
//			System.out.print("instance initializer block is invoked-2");
//			speed=90;
//			System.out.println(" Distance- "+dis+"meters");
//		}
//		System.out.println("Constructor method is invoked");
//		System.out.println("Speed : "+speed+"kph");
//		
//	}
	
	
	public static void main(String[] args) {
	//	InstanceInitializer ii=new InstanceInitializer();
			Crow c=new Crow();
		//	Crow c1=new Crow(20);

	}

}
class Birds
{
	Birds()
	{
		System.out.println("parent cls");
	}
}
class Crow extends Birds
{
	Crow(){
	//	super();
		System.out.println("child cls");
	}
	Crow(int a){
		//super();
		System.out.println("child cls"+a);
	}
	{
		System.out.println("instace initializer block");
	}
	
}