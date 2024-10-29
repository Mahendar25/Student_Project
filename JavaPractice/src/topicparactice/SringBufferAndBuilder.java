package topicparactice;

public class SringBufferAndBuilder {

	public static void main(String[] args) {
/*		String s="Iam";
		String s1="Iam";
		System.out.println(s==s1);
		
		s=s+"Obito";
		System.out.println(s==s1);
		
		String s3="IamObito";
		System.out.println(s==s3);
		
		System.out.println(".........................");
		
		StringBuilder sd=new StringBuilder("Iam");
		StringBuilder sd1=new StringBuilder("Iam");
		System.out.println(sd==sd1);
		
		sb=sb.append("Obito");
		System.out.println(sd==sd1);
		
		StringBuilder sd3=new StringBuilder("IamObito");
		System.out.println(sd==sd3); */
		StringBuilder sd=new StringBuilder();
		StringBuffer sb=new StringBuffer();
		System.out.println(sd.capacity());
		System.out.println(sb.capacity());
		sb.append("Obito");
		System.out.println(sb);
		System.out.println(sb.capacity());
		
		

	}

}
