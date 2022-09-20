package practice_program_interview;

public class Sort_ele_Array_BuiltMethod {

public static void main(String[] args) {
		
		int a[]= {30,50,20,10,60};
		//Approach 1
		
		/*System.out.println("Array Elements before sorting:"+ Arrays.toString(a));
		Arrays.parallelSort(a);
		System.out.println("Array Elements after sorting:"+ Arrays.toString(a));*/
		
		//Approach 2
		System.out.println("Array Elements before sorting:"+ Arrays.toString(a));
		Arrays.sort(a);
		System.out.println("Array Elements after sorting:"+ Arrays.toString(a));
		
		//Approach 3
		//Reverse Descending order
		/*System.out.println("Array Elements before sorting:"+ Arrays.toString(a));
		Arrays.sort(a,Collections.reverseOrder());
		System.out.println("Array Elements after sorting:"+ Arrays.toString(a));*/
	}


	
}
