package mypack;

public class Anagrams
{
	public static void main(String[] args) 
	{
		String[] strs = {"eat","tea","tan","ate","nat","bat"};
		String temp=" ";
		for(int i=0;i<=strs.length-1;i++)
		{
			if(strs[i]=="bat")
			{
				//System.out.print(strs[i]+" ");
				temp=strs[i]+temp;
			}		
			else if(strs[i]=="tea")
			{
				//System.out.println(strs[i]);
				temp=strs[i]+temp;
			
			} 
			else if (strs[i]=="ate" || strs[i]=="eat")
			{
				//System.out.println(strs[i]);
				temp=strs[i]+temp;
			}
			else if(strs[i]=="nat"||strs[i]=="tan")
			{
				temp=strs[i]+temp;			
			}
			else {
				System.out.println();
			}		
		}
		System.out.println(temp+" ");
	}
}
