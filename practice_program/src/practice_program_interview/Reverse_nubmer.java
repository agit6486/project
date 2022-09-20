package practice_program_interview;

import java.util.Scanner;

public class Reverse_nubmer {
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number:"
				+ "");

		int num = sc.nextInt();
		/*int rev = 0;
		while(num!=0) {
			rev=rev*10+num%10;
			num =num/10;
		}
		System.out.println("reverse number is" + rev);*/
		
		
		//2nd approacch 
		StringBuffer rev;
		StringBuffer sb = new StringBuffer(String.valueOf(num));
		rev= sb.reverse();
		System.out.println("revertse number is" +rev);
		
		
		//string builder
		/*StringBuilder sb1=new StringBuilder();
		sb1.append(num);
		StringBuilder rev=sb1.reverse();
		
		System.out.println("Reverse Number is : "+rev);*/

		
		
		
		
		
	}

}
