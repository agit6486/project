package practice_program_interview;

public class WriteDataIntotextFile {
	publicstaticvoidmain(String[] args) throwsIOException
	{
		FileWriterfw=newFileWriter("C:\\Users\\SOUMYASANTA SAHOO\\Desktop\\Text2.txt");
		BufferedWriterbw=newBufferedWriter(fw);
		
		bw.write("Selenium with Java");
		bw.write("Selenium with Python");
		bw.write("Selenium with C#");
		
		System.out.println("Finished!!!!!");
		bw.close();
	}



}
