package practice_program_interview;

public class ReadDataFromTextFile {
	publicstaticvoidmain(String[] args) throwsIOException
	{
		//Approach 1: Using FileReaderBufferReader
		
		/*FileReaderfr=new FileReader("C:\\Users\\SOUMYASANTA SAHOO\\Desktop\\Text1.txt");
		BufferedReaderbr=new BufferedReader(fr);
		
		String str;
		
		while((str = br.readLine())!=null)
		{
			System.out.println(str);
		}
		
		br.close();*/
		
		//Approach 2: Using Scanner & File
		
		File file=newFile("C:\\Users\\SOUMYASANTA SAHOO\\Desktop\\Text1.txt");
		
		Scanner sc=new Scanner(file);
		
		//Loop statement
		/*while(sc.hasNextLine())
		{
			System.out.println(sc.nextLine());
		}*/
		
		//Approach 3
		sc.useDelimiter("\\Z");
		System.out.println(sc.next());
	}



}
