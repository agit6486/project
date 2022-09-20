package practice_program_interview;

public class Count_no_of_digits {
publicstaticvoidmain(String[] args) {
		
		intnum=123456;
		intcount=0;
		while(num>0)
		{
			num=num/10;
			count++;
		}
		System.out.println("Number of Digits:" +count);
	}



}
