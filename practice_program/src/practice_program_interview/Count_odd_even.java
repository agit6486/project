package practice_program_interview;

public class Count_odd_even {
publicstaticvoidmain(String[] args) {
		
		intnum=1234;
		
		inteven_count=0;
		intodd_count=0;
		
		while(num>0)
		{
			intrem=num%10;
			
			if(rem%2==0)
			{
				even_count++;
			}
			else
			{
				odd_count++;
			}
			num=num/10;
		}
		
		System.out.println("Number of even count: " +even_count);
		System.out.println("Number of Odd_count: " +odd_count);
	}

}

}
