package practice_program_interview;

public class Prime_number {
	//2 is the lowest prime no.
	
		publicstaticbooleanisPrimeNumber(intnum)
		{
			//edge/corner cases
			if(num<=1)
			{
				returnfalse;
			}
			for(inti=2; i<num;i++)
			{
				if(num%i==0)
				{
					returnfalse;
				}
			}
			returntrue;
		}
		
		publicstaticvoidgetPrimeNumbers(intnum)
		{
			for(inti=2; i<=num; i++)
			{
				if(isPrimeNumber(i))
					System.out.println(i + " ");
			}
		}
		publicstaticvoidmain(String[] args) {
			
			System.out.println("2 is prime number:"+ isPrimeNumber(2));
			System.out.println("10 is prime number:"+ isPrimeNumber(10));
			System.out.println("17 is prime number:"+ isPrimeNumber(17));
			System.out.println("0 is prime number:"+ isPrimeNumber(0));
			System.out.println("-3 is prime number:"+ isPrimeNumber(-3));
			
			getPrimeNumbers(7);
			getPrimeNumbers(20);
		}


}
