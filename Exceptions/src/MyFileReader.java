import java.io.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;


public class MyFileReader {
	Scanner input;
	
	public void openFile(String filename)
	{
		File f = new File(filename);
		
      try {
   		input = new Scanner(f); //Notice how this generates an error. You are forced to define how to handle an exception thrown here.
      }
      catch(FileNotFoundException e) //Most specific exception first!
      {
         System.out.println("File not found");
      }
      catch(Exception e)
      {
         System.out.println("An error occured.");
      }
      

	}
	
	public void closeFileAfterUse()
	{
		//insert code here to close the file after use.
	}
	
	public String readAndReturnOneLine()
	{
		//insert code here to read a line in the file.
		return null;

	}
}
