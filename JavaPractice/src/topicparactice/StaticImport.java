package topicparactice;
//import static java.lang.Integer.*;
//import static java.lang.System.*;
public class StaticImport {
		boolean same(Myclass m1,Myclass m2)
		{
			if(m1==m2)
				return true;
			else
				return false;
		}
	public static void main(String[] args) {
//		int x=10,y=20;
//		int a=sum(x,y);
//		int b=max(x,y);
//		out.println(a);
//		out.println(b);// this statement works when I'am importing static import with specified class name.
	
		Myclass m3=new Myclass();
		Myclass m4=new Myclass();
		StaticImport si=new StaticImport();
		boolean b=si.same(m3, m4);
		System.out.println(m3+" --> m3 hash code");
		System.out.println(m4+" --> m4 hash code");
		System.out.println("m3 is equal as m4 : "+b);
	
	
	}

}
class Myclass
{
	
}