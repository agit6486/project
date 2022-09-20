package practice_program_interview;

public class Factorial {
	//fact of 4= 4*3*2*1= 24
		//fact of 1 =1
		//fact(0) =1
		
		//1. Without recursive -- use for loop
		publicstaticintfactorial(intnum)
		{
			intfact=1;
			if(num==0)
				return 1;
			for(inti=1;i<=num;i++)
			{
				fact=fact*i;
			}
			returnfact;
		}

		//2. With recursive function: a function is calling itself
		publicstaticintfact(intnum)
		{
			if(num==0)
			{
				return 1;
			}
			else
			{
				return(num*fact(num-1));
			}
		}
		
		publicstaticvoidmain(String[] args) {
			System.out.println(factorial(5));
			System.out.println(factorial(1));
			System.out.println(factorial(0));
		
			System.out.println(fact(7));
			System.out.println(fact(1));
			System.out.println(fact(0));
			System.out.println(fact(10));
		}



}
