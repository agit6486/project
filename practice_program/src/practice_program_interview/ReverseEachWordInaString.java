package practice_program_interview;

public class ReverseEachWordInaString {
	publicstaticvoidmain(String[] args) 
	{
		//Approach 1
		/*String str="Welcome to Java and Selenium"; //Original String
		String[] words=str.split(" "); //Spliting string into words
		String reverseString="";
		
		for(String w:words)
		{
			String reverseword="";
			
			for(inti=w.length()-1;i>=0;i++)
			{
				reverseword=reverseword+w.charAt(i);
			}
			
			reverseString = reverseString+reverseword+" ";
		}
		
		System.out.println(reverseString);*/
		
		//Approach 2
		String str="Welcome to Java";
		String[] words=str.split("\\s");
		
		String reverseword="";
		
		for(String w:words) //Java
		{
			StringBuilder sb=new StringBuilder(w);
			sb.reverse();
			reverseword=reverseword+sb.toString()+" ";
		}
	}



}
