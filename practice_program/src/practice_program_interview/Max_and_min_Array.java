package practice_program_interview;

public class Max_and_min_Array {publicstaticvoidmain(String[] args) {
	
	inta[]= {50,100,40,20,60};
	
	intmax=a[0];
	for(inti=1;i<a.length;i++)
	{
		if(a[i]>max)
		{
			max=a[i];
		}
	}
	System.out.println("Maximum element in array is:"+ max);
	
	intmin=a[0];
	for(inti=1; i<a.length;i++)
	{
		if(a[i]<min)
		{
			min=a[i];
		}
	}
	System.out.println("Minimum element in array is:"+ min);
}

}


}
