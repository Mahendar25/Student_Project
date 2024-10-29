package topicparactice;
class Principal
{
	void msg()
	{
		System.out.println("hlo..");
	}
	//String name="Minato";
}
class Teachere extends Principal
{
	void msg()
	{
		System.out.println("buddies..");
	}
	//int id=101;
}
class Students extends Teachere//,Principal
{
	void msg()
	{
		System.out.println("gamers..");
	}
	//String cls="Fist class";
	//int roll_no=25;
}

public class Inheritance {

	public static void main(String[] args) {
		Students s=new Students();
		s.msg();
//		System.out.println("Pricipal name : "+s.name);
//		System.out.println("Teacher Id : "+s.id);
//		System.out.println("Student class :"+s.cls+" and Roll number "+s.roll_no);
	}

}
