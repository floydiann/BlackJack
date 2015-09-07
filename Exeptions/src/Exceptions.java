public class Exceptions {
	
   public static void main(String[] edgaras)
   {
      try {
        Exceptions e = new Exceptions(); 
      }
      catch(NullPointerException e)
      {
         System.out.println("Exception occured");
      }
   }
   
	public Exceptions() throws NullPointerException
	{
      try 
      { 
         int[] array = new int[2];
         array[2] = 1;
      }
      catch(ArrayIndexOutOfBoundsException exception)
      {
         System.out.println("Exception handled");
      }
  
  
      
      
      
      
      
      
      
      
      
      
      
      
      
      
     
     Person p = new Person();
     //try {
        if (p.getMale())
      		System.out.println("Male");
      	else
     			System.out.println("Female");
      //}
      //catch(NullPointerException e)
      //{
       //  System.out.println("There was an exception and we dont care!");
      //}  
     
	}
}