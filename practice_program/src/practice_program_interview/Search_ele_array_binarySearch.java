package practice_program_interview;

public class Search_ele_array_binarySearch {
	publicstaticvoidmain(String[]args)
	{
		inta[]= {1,2,3,4,5,6,7,8,9,10}; //should be in sorted order
		
		//Approach 1
		/*boolean flag=false;
		
		int key=5;
		
		int l=0;
		int h=a.length-1;
		
		while(l<=h)
		{
			int m=(l+h)/2;
			
			if(a[m]==key)
			{
				System.out.println("Element Found..");
				flag=true;
				break;
			}
			
			if(a[m]<key)
			{
				l=m+1;
			}
			
			if(a[m]>key)
			{
				h=m-1;
			}
		}
		
		if(flag==false)
		{
			System.out.println("Element not Found..");
		}
		*/
		
		//Approach 2:Arrays.binarySearch()
		System.out.println(Arrays.binarySearch(a,8));
	}


	

}
