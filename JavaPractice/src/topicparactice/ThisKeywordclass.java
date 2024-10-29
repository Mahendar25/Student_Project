package topicparactice;

class ThisKeyword
{
//	int rollno;
//	String name;
//	float fee;
//	ThisKeywordclass(int rollno,String name,float fee)
//	{
//		this.rollno=rollno;
//		this.name=name;
//		this.fee=fee;
//	}
//	void display()
//	{
//		System.out.println(rollno+" "+name+" "+fee);
//	}
//	public static void main(String args[]){
//	ThisKeywordclass s1=new ThisKeywordclass(111,"ankit",5000f);
//	ThisKeywordclass s2=new ThisKeywordclass(112,"sumit",6000f);
//	s1.display();
//	s2.display();
//	}
	
	ThisKeyword m()
	{
		return this;
	}
	void m1()
	{
		System.out.println("hi...");
	}
	
}
class ThisKeywordclass
{
	public static void main(String[] args) {
		ThisKeyword tk=new ThisKeyword();
		tk.m1();
	}
}