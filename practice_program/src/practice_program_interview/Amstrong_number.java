package practice_program_interview;

public class Amstrong_number {
	153
	//1*1*1
	//5*5*5
	//3*3*3
	//1+125+27=153
	
	publicstaticvoidisArmstrongNumber(intnum) {
		System.out.println("given number is:"+ num);
		intcube=0;
		intr;
		intt;
		t=num;
		
		while(num>0)
		{
			r=num%10;
			num=num/10;
			cube=cube+(r*r*r);
		}
		
		if(t==cube)
		{
			System.out.println("this is an armstrong number");
		}
		else
		{
			System.out.println("this is not an armstrong number");
		}
	}

	publicstaticvoidmain(String[] args) {
		isArmstrongNumber(153);
		isArmstrongNumber(372);
	}

}



}
