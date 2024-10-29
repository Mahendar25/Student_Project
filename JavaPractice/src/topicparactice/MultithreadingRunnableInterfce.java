package topicparactice;

public class MultithreadingRunnableInterfce
{
	public static void main(String[] args) throws InterruptedException {
//		System.out.println("HI..");
//		System.out.println("Default thread name : "+Thread.currentThread().getName());
//		System.out.println("Number of threads in active state : "+Thread.activeCount());
//		System.out.println("Default thread priority : "+Thread.currentThread().getPriority());
		/*by default java provide a 'main' thread with normal priority
		 * where 0 has MIN
		 * 		 5 has NORMAL
			 * 		 10 has MAX*/
		
//		System.out.println("Default thread id : "+Thread.currentThread().getId());
//		Thread t=new Thread();
//		Thread t1=new Thread();
//		Thread t2=new Thread();
//		Thread t3=new Thread();
//		t.start();
//		t1.start();
//		t2.start();
//		t3.start();
//		System.out.println("Number of threads are in active state: "+Thread.activeCount());
		
		
		Student1 st1=new Student1();
		Teacher1 tc1=new Teacher1();
		Thread t1=new Thread(st1,"Naruto Maaga");// creating thread name by passing parameters
		Thread t2=new Thread(tc1,"Naruto Maaga");	
		System.out.println(t1.getState());
		t1.start();
		System.out.println(t1.getState());
		//t1.join();//join() method is stops the execution of all threads until it done
		t1.sleep(1000);//sleep() method stops the execution of all thread with a time period until it done
		t2.start();
		System.out.println(t1.getState());
		
		System.out.println("Student defult thread priority: "+t1.getPriority());
		t1.setPriority(1);
		System.out.println("Student after user defined thread priority: "+t1.getPriority());
		System.out.println("Teacher thread priority: "+t2.getPriority());
		System.out.println("Number of threads in active state : "+Thread.activeCount());
	}

}
class Student1 implements Runnable
{
//	public Student(String tName)//Here we creating our own thread-name by using constructor to pass parameters
//	{
//		super(tName);
//	}
	@Override public void run()
	{
		for(int i=1;i<=10;i++)
		{
			//System.out.println("Obito...."+"thread id "+Thread.currentThread().getId()+" and thread name..."+Thread.currentThread().getName());
		}
	}
	
}
class Teacher1 implements Runnable
{
//	public Teacher(String tName)//Here we creating our own thread-name by using constructor to pass parameters
//	{
//		super(tName);
//	}
	@Override public void run()
	{
		for(int i=1;i<=10;i++)
		{
			//System.out.println("Minato...."+"thread id "+Thread.currentThread().getId()+" and thread name..."+Thread.currentThread().getName());
		}
	}
	
}