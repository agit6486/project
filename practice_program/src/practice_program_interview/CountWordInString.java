package practice_program_interview;

public class CountWordInString {
	publicstaticvoidmain(String[] args) 
	{
		System.out.println("Enter the String");
		
		Scanner sc=newScanner(System.in);
		
		String s=sc.nextLine(); //Welcome to java
		
		intcount=1;
		
		for(inti=0;i<s.length();i++)
		{
			if((s.charAt(i)==' ') && (s.charAt(i+1)!=' '))
			{
				count++;
			}
		}
		
		System.out.println("Number of words in a string:"+ count);
	}
	



}
