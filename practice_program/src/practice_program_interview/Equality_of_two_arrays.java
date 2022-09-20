package practice_program_interview;

public class Equality_of_two_arrays {
	publicstaticvoidmain(String[] args) {
		
		inta1[]= {1,2,3,4,5};
		inta2[]= {1,2,3,4,5};
		
		/*boolean status=Arrays.equals(a1,a2);
		
		if(status==true)
		{
			System.out.println("Arrays are Equal");
		}
		else
		{
			System.out.println("Arrays are not Equal");
		}*/
		
		//Approach2
		booleanstatus=true;
		if(a1.length == a2.length)
		{
			for(inti=0;i<a1.length;i++)
			{
				if(a1[i] != a2[i])
				{
					status=false;
				}
			}
		}
		else
		{
			status=false;
		}
		
		if(status==true)
		{
			System.out.println("Arrays are equal");
		}
		else
		{
			System.out.println("Arrays are not equal");
		}
				
	}


}
