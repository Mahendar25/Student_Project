//Creating program on bricks count  
package topicparactice;

public class SynchronizationEx {

	public static void main(String[] args) throws Exception
	{
		BrickDairy bd=new BrickDairy();
		
		Runnable r1 = () -> {
			for(int i=0;i<5000;i+=50)
			{
				bd.incrementBrick();
			}
		};
		Runnable r2 = () -> {
			for(int i=0;i<50000;i+=50)
			{
				bd.incrementBrick();
			}
		};
		Runnable r3 = () -> {
			for(int i=0;i<5000;i+=50)
			{
				bd.incrementBrick();
			}
		};
		Thread t1=new Thread(r1);
		Thread t2=new Thread(r2);
		Thread t3=new Thread(r3);
		
		t1.start();
		t2.start();
		t3.start();
		
		t1.join();
		t2.join();
		t3.join();
		
		System.out.println("Truck 1 total bricks : "+bd.brickCount);
		System.out.println("Truck 2 total bricks : "+bd.brickCount1);

	}

}
class BrickDairy
{
	int brickCount=0;
	int brickCount1=0;
	public void incrementBrick()
	{
		brickCount +=50;
		synchronized (this)//synchronized keyword is used to manipulate the data and it is thread safe.
		{
			brickCount1+=50;//we can apply synchronized keyword to entire method and can also apply to a part of code 
		}
	//	brickCount1 +=50;
	}
}
