package topicparactice;

public class SuperKeyWord {

	public static void main(String[] args) {
//		BB obj=new BB();
//		obj.a();
//		obj.b();
//		obj.sysout();
//		obj.c();
		
		
		//BC bc=new BC();
		


		ClassA a=new ClassA(25,"Shesu");
		a.display();
		
		ClassB b=new ClassB(25,"Shesu",89);
		b.display();
	}

}
//class AA
//{
//	void a()
//	{
//		System.out.println("a method in Class AA ");
//	}
//}
//class BB extends AA
//{
//	void a()
//	{
//		System.out.println("a method in Class BB");
//	}
//	void b()
//	{
//		//super.a();
//		System.out.println("b method in Class BB");
//	}
//	void sysout() {
//		System.out.println("\nAfter using super keyword\n");
//	}
//	void c()
//	{
//		super.a();
//		b();
//	}
//}







// example of super keyword where super() is provided by the compiler implicitly.

//class AB
//{
//	AB()
//	{
//		System.out.println("AB constructor");
//	}
//}
//class BC extends AB
//{
//	BC()
//	{
//		System.out.println("BC constructor");
//	}
//}


//reusing the parent class constructor
class ClassA
{
	int roll_no;
	String name;
	
	ClassA(int roll_no,String name)
	{
		this.roll_no=roll_no;
		this.name=name;
	}
	void display() {
		System.out.println(roll_no+" "+name);
	}
}
class ClassB extends ClassA
{
	float marks;
	ClassB(int roll_no,String name,int marks)
	{
		super(roll_no,name);
		this.marks=marks;
		
	}
	void display() {
		System.out.println(roll_no+" "+name+" "+marks);
	}
}