package topicparactice;

public class MultiThreadingThreadClass {

	public static void main(String[] args) {
//		System.out.println("HI");
//		System.out.println(Thread.currentThread().getName());
//		System.out.println(Thread.activeCount());
//		System.out.println(Thread.currentThread().getPriority());
		/*by default java provide a 'main' thread with normal priority
		 * where 0 has MIN
		 * 		 5 has NORMAL
			 * 		 10 has MAX*/
		
		System.out.println("Default thread id : "+Thread.currentThread().getId());
	//	Thread t=new Thread();
	//	Thread t1=new Thread();
	//	Thread t2=new Thread();
	//	Thread t3=new Thread();
	//	t.start();
	//	t1.start();
	//	t2.start();
	//  t3.start();
	// 	System.out.println(Thread.activeCount());
		
		
		Student st=new Student();
		Teacher tc=new Teacher();	
		st.start();
		tc.start();
		System.out.println("Student thread priority: "+st.getPriority());
		System.out.println("Teacher thread priority: "+tc.getPriority());
		System.out.println("Number of threads in active state : "+Thread.activeCount());
	}

}
class Student extends Thread
{
//	public Student(String tName)//Here we creating our own thread-name by using constructor to pass parameters
//	{
//		super(tName);
//	}
	@Override public void run()
	{
		System.out.println("Obito...."+"thread id "+Thread.currentThread().getId()+" and thread name..."+Thread.currentThread().getName());
		
	}
	
}
class Teacher extends Thread
{
//	public Teacher(String tName)//Here we creating our own thread-name by using constructor to pass parameters
//	{
//		super(tName);
//	}
	@Override public void run()
	{
		System.out.println("Minato...."+"thread id "+Thread.currentThread().getId()+" and thread name..."+Thread.currentThread().getName());
		
	}
	
}