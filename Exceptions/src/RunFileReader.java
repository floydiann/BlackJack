
public class RunFileReader
{
	public static void main(String[] args)
	{
		MyFileReader reader = new MyFileReader();
		reader.openFile("myfile.txt"); //create this file on harddisk and change the path and filename
		
		String question1 = reader.readAndReturnOneLine();
		String question2 = reader.readAndReturnOneLine();
	
	
		System.out.println(question1);
		System.out.println(question2);
	}
}