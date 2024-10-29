package topicparactice;
public class Wrapper {
	private String name;
	public String getName()
	{
		return name;
	}
	public void setName(String nname)
	{
		this.name=nname;
	}
	public static void main(String[] args) {
		Wrapper wp=new Wrapper();
		wp.setName("Abhi");
		System.out.println(wp.getName());
	}
}
