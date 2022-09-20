package practice_program_interview;

public class Duplicates_element_Array {
publicstaticvoidmain(String[]args) {
		
		String arr[]= {"java","C","C++","Python","java"};
		
		//Approach1
		/*boolean flag=false;
		for(inti=0;i<arr.length;i++)
		{
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==arr[j])
				{
					System.out.println("Found Duplicate Element:"+arr[i]);
					flag=true;
				}
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate Element not found");
		}*/
		
		//Approach2
		HashSet <String>langs=newHashSet();
		booleanflag=false;
		
		for(String l : arr)
		{
			if(langs.add(l)==false)
			{
				System.out.println("Found Duplicate Element:"+l);
				flag=true;
			}
		}
		if(flag==false)
		{
			System.out.println("Duplicate Element not found");
		}
	}


}
