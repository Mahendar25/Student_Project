package topicparactice;

public class Arrays2 {

	public static void main(String[] args) {
		int[][] x=new int[3][2];
		x[0][0]=10;
		x[0][1]=11;
	//	x[0][2]=1;
		
		x[1][0]=12;
		x[1][1]=13;
	//	x[1][2]=13;
		
		x[2][0]=13;
		x[2][1]=13;
//		x[2][2]=13;
		//System.out.println(x[1][0]);
		for(int i=0;i<x.length;i++)
		{
			int[] sr=x[i];
			for(int j=0;j<sr.length;j++)
			{
				System.out.print(sr[j]+" ");
			}
			System.out.println();
		}
		

	}

}
