package practice_program_interview;

public class Reversre_string {

	public static void main(String[] args) {
		
		
		//1. Using String Concatination Operator (+)
		
				String str="BISWAJIT";
				String rev="";
				/*int len=str.length();//8
				
				for(int i=len-1;i>=0;i--)
				{
					rev=rev+str.charAt(i);
				}
				System.out.println("reverse string is :"+ rev);*/
				

				//2. Using Charachter Array
				/*char a[]=str.toCharArray();
				int len=a.length;//8
				
				for(int i=len-1;i>=0;i--)
				{
					rev=rev+a[i];
					}
                System.out.println("reverse string is :"+ rev);*/
				
				//3.UsingStringBuffer class
				StringBuffer sb=new StringBuffer(str);
				System.out.println(sb.reverse());
				 

	}

}
