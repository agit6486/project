package practice_program_interview;

public class Count_sum_of_digits {
	publicstaticvoidmain(String[] args) {
		
		intnum=1234;
		intsum=0;
		
		while(num>0)
		{
			sum=sum+num%10;
			num=num/10;
		}
		System.out.println("Sum of digits of a number:" + sum);
	}

}

}
