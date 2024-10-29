package topicparactice;

class Anonymous {

	public static void main(String[] args) {
//		Cal c=new Cal(),c1=new Cal(); //
//		c.sum(10,10);
//		c1.sum(20,20);
//		c.result();
//		c1.result();
		
		
		new Cal().sum(10);//anonymous object
	}

}
//class Cal
//{
//	int i;
//	int j;
//	void sum(int a,int b)
//	{
//		i=a;
//		j=b;
//	}
//	void result()
//	{
//		System.out.println(i+j);
//	}
//}
class Cal
{
	void sum(int a)
	{
		for(int i=1;i<=a;i++)
		{
			System.out.println(i);
		}
	}
}