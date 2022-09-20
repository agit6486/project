package practice_program_interview;

public class Sort_ele_Array_BubbleSort {

	publicstaticvoidmain(String[] args) {
		
		inta[]= {4,2,1,5,3};
		System.out.println("Array before sorting:" + Arrays.toString(a));
		
		intn=a.length;
		
		for(inti=0; i<n-1; i++) //Number of passes
		{
			for(intj=0;j<n-1;j++) //Iteration in each pass
			{
				if(a[j]>a[j+1])
				{
					inttemp=a[j];
					a[j]=a[j+1];
					a[j+1]=temp;
				}
			}
		}
		
		System.out.println("Array after sorting:"+Arrays.toString(a));
	}

}


}
