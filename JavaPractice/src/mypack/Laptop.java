package mypack;

public interface Laptop {
	public void copy();
	public void cut();
	public void pate();
	public void keyboard();
	public default void Security()
	{
		CommanCode();
		Capture();
		System.out.println("Laptop Security code");
	}
	public static void Capture()
	{
		CommanCode();
		System.out.println("Add this feature");
	}
	private static void CommanCode()
	{
		System.out.println("CommanCode");
	}

}
