package practice_program_interview;

public class Even_Odd_in_Array { 
publicstaticvoidmain(String[] args) {
		
		inta[]= {1,2,3,4,5,6};
		
		//Extracting even numbers.........
		System.out.println("Even numbers in array.........");
		/*for(inti=0; i<a.length;i++)
		{
			if(a[i]%2==0)
				System.out.println(a[i]);
		}*/
		
		//Enhanced for loop
		for(intvalue:a)
		{
			if(value%2==0)
				System.out.println(value);
		}
		
		
		System.out.println("Odd numbers in array...........");
		/*for(inti=0;i<a.length;i++)
		{
			if(a[i]%2!=0)
				System.out.println(a[i]);
		}*/
		
		for(intvalue:a)
		{
			if(value%2!=0)
				System.out.println(value);
		}
	}


}
