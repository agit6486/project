package practice_program_interview;

public class Search_an_element_Array {
publicstaticvoidmain(String[] args) {
		
		inta[]= {10,20,40,50,30};
		
		intsearch_ele=50;
		
		booleanflag=false;
		
		for(inti=0;i<a.length;i++)
		{
			if(search_ele==a[i])
			{
				System.out.println("Element found at:"+i);
				flag=true;
				break;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not found");
		}
	}



}
