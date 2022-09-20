package practice_program_interview;

public class largest_of_thre_numbers {

	publicstaticvoidmain(String[] args) {
		
		Scanner sc=newScanner(System.in);
		
		System.out.println("Enter first Number:");
		inta=sc.nextInt();
		
		System.out.println("Enter second Number:");
		intb=sc.nextInt();
		
		System.out.println("Enter Third Number:");
		intc=sc.nextInt();
		
		//Approach-1-Logic
		/*if(a>b && a>c)
		{
			System.out.println(a+" is largest number");
		}
		else if(b>a && b>c)
		{
			System.out.println(b+" is largest number");
		}
		else
		{
			System.out.println(c+" is largest number");
		}*/
		
		//Ternary Operator
		
		//int largest1=a>b?a:b;//largest of a & b
		//int largest2=c>largest1?c:largest1;//largest of c & largest1
		
		intlargest=c>(a>b?a:b)?c:(a>b?a:b);
		System.out.println(largest+"is largest number");


}
