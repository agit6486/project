package practice_program_interview;

public class Generate_random_numbers {
publicstaticvoidmain(String[] args) {
		
		//Approach1- Random
		Random rand=newRandom();
		
		intrand_int=rand.nextInt(100);
		System.out.println(rand_int);
		
		doublerand_dbl=rand.nextDouble();//range 0.0 and less than 1.0
		System.out.println(rand_dbl);
		
		//Approach2-Math
		System.out.println(Math.random());
	}


}
