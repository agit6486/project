package practice_program_interview;

public class Sum_of_elements {

publicstaticvoidmain(String[] args) {
		
		inta[]= {5,2,7,9,6};
		intsum=0;
		
		/*for(inti=0; i<=a.length-1;i++)
		{
			sum=sum+a[i];
		}*/
		
		
		//Enhanced for loop
		for(intvalue:a)
		{
			sum=sum+value;
		}
		
		System.out.println("Sum of Array Elements:" + sum);
	}

}
