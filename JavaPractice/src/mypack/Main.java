package mypack;

public class Main {

	public static void main(String[] args) {
		Laptop l = new Lenovo();
		l.copy();
		l.cut();
		l.pate();
		l.keyboard();
		l.Security();
		Laptop il = new Applee();
		il.copy();
		il.cut();
		il.pate();
		il.keyboard();
	//	il.Security();
		//l.Security();
		Laptop.Capture();
	}

}
