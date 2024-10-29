package mypack;

public class CheckingPallindrom {

	public static void main(String[] args) {
		String s=null;
		System.out.println(muPall(s));
	}

	static boolean muPall(String s) {
		if(s==null||s=="")
			return true;
		s=s.toLowerCase();
		for(int i=0;i<=s.length()/2;i++)
		{
			char st=s.charAt(i);
			char ed=s.charAt(s.length()-1-i);
			
			if(st!=ed)
				return false;
		}
		 return true;
	}

}
