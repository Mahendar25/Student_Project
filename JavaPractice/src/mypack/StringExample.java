package mypack;

import java.util.ArrayList;
import java.util.Arrays;

public class StringExample {
public static void main(String[] args) {
	 System.out.println("\n"+'a'+"b");//performing concatenation.
	 System.out.println('a'+'b');//here performing addition by their Unicode values.
	 System.out.println('a'+3);//performing addition
	 System.out.println("a"+"b");//performing concatenation.
	 System.out.println("a"+3);//performing concatenation.
	
	 System.out.println('a'* 10);//performing multiplication

	 System.out.println("Obito"+new ArrayList<>());//performing concatenation with objects.
	 System.out.println("Obito"+new Integer(10));//performing concatenation with objects.
	 
	 String x="Obito";
	 String y="Obito";
	 System.out.println("implicete creation of string  : "+(x==y));
	 
	 String mn=new String("Naruto");//....values are stored inside heap and out side string pool...here the values are assigned to their reference variable with separate addresses....
	 String nm=new String("Naruto");//     ...thats why the compression results gives "false"
	 System.out.println("Explicote creation of string  : "+(mn==nm));
	 
	// System.out.println(new Integer(20)+new ArrayList<>());The operator + is undefined for the argument type(s) Integer, ArrayList<Object>
	 System.out.println(new Integer(20)+""+new ArrayList<>());// thats why we use string ("") in between them.
	 
	// String alpha="";//declaring string variable.
		 for(int i=0;i<26;i++)
		 {
			 char ch=(char)('A'+i);
			 System.out.print(ch);
			// alpha+=ch;
			
		 }
		// System.out.println("\n"+alpha);
		 /*the difference between the above String code below
		  *  StrigBuilder does not creating new object,
		  *  it just changing their values.
		  *  StringBuilder is a mutable 
		  *  and String is immutable */
		 
	 System.out.println();
		// StringBuilder 
		 StringBuilder bud = new StringBuilder();
		 for(int i=0;i<26;i++)
		 {
			 char ch=(char)('A'+i);
			 bud.append(ch);
			
		 } 
		 System.out.print(bud+"\n");
		 bud.reverse();
		 System.out.println(bud);
		 bud.deleteCharAt(2);
		 System.out.println(bud);// deleting X character
		 bud.append(bud);
		 System.out.println("\n"+bud);
		 bud.length();
		 System.out.println("\n"+bud);
	
		 
		 String name="Obito Sharingan";
		 System.out.println(Arrays.toString(name.toCharArray()));
		 
		 System.out.println(name.toUpperCase());
		 System.out.println(name);
		 System.out.println(name.indexOf('a'));
		 System.out.println("     naruto    ".strip());
		 
		 
		 
		 
		 
		 
	}
}
