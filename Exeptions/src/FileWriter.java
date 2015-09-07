import java.io.*;

public class FileWriter {
	public static void main(String[] args) {
		
		FileWriter f = new FileWriter();
		f.writeFile();
      
//      Movie m = new Movie("What women want", 192, ...);
      
	}

   public void saveMovie(Movie m)
   {
      //save the movie object to the file.
   }
   
   
	public void writeFile()
	{
		try {
			
			File f = new File("results.txt");
 			FileOutputStream fos = new FileOutputStream(f, true); //A file output stream is an output stream for writing data to a File ...
			PrintStream output = new PrintStream(fos); //Makes it easier to print various data values.
			
			output.println("Hej");
			output.println("dsafd");

      	output.close(); //remember to close
         fos.close();
         			
		} catch (IOException e) {

         System.out.println("Unknown error");
			//handle an exception by telling the user that something went wrong.
		}
      
	}
}






















































































//output.print(" ");
//output.print("Christian");
//output.print(" ");
//output.print(33);
//output.print(" ");
//output.println(1.79);
//
//output.print(2);
//output.print(" ");
//output.print("Jens");
//output.print(" ");
//output.print(26);
//output.print(" ");
//output.println(1.85);
