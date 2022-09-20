package practice_program_interview;

public class Palidrome_String {
publicstaticvoidmain(String[] args) {
		
		Scanner sc=newScanner(System.in);
		System.out.println("Enter the String:");
		String str=sc.next();
		String org_str=str;
		
		String rev="";
	intlen=str.length();
	
	for(inti=len-1;i>=0;i--)
	    {
		rev=rev+str.charAt(i);
	    }
	if(org_str.equals(rev))
	    {
		System.out.println(org_str+" is Pallindrom String");
	    }
	else
	    {
		System.out.println(org_str+" is not a Pallindrom String");
	    }
	}

}




}
