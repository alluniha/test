package Com.sonata;

public class Vowelwithdolar {

	   public static void main(String[] args) 
	   {
	      String string = "Welcome to sonata";    
	      System.out.println("Input String : "+string);   
	      string = string.replaceAll("[aeiou]", "&");  
	      System.out.println(string);    
	      
	   }
}
