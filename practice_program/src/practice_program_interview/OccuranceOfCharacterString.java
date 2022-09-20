package practice_program_interview;

public class OccuranceOfCharacterString {
	publicstaticvoidmain(String[] args) {
		String s="Java Programming Java oops";
		
		inttotalcount=s.length();
		
		inttotalcount_afterRemove=s.replace("a", "").length();
		
		intcount=totalcount-totalcount_afterRemove;
		
		System.out.println("Number occurances of a is:"+count);
	}



}
