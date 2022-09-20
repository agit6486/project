package practice_program_interview;

public class RemoveWhiteSpacesInString {
publicstaticvoidmain(String[] args) {
		
		String str="Java programming selenium automation";
		System.out.println("Before removing the white space:"+str);
		str=str.replaceAll("\\s", "");
		System.out.println("After removing the White space:"+str);
	}


}
