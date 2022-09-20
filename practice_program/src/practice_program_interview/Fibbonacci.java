package practice_program_interview;

public class Fibbonacci {

	publicstaticvoidmain(String[] args) {
		
		intn1=0, n2=1, sum=0;
		System.out.print(n1+" "+n2);
		
		for(inti=2;i<10;i++)
		{
			sum=n1+n2;
			System.out.print(" "+sum);
			n1=n2;
			n2=sum;
		}
	}


}
