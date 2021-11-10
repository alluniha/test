
import java.util.ArrayList;
import java.util.List;
 public class Student {
   String name; 
   int marks; 
   int id; 
   public String getName() {
      return name; 
   } 
   public int getmarks() { 
      return marks; 
   } 
   public int getId() { 
      return id; 
   } 
   Student(String n, int a, int i){ 
      name = n; 
      marks = a; 
      id = i; 
   } 
   @Override public String toString() {     
      return ("Student[ "+"Name:"+this.getName()+             
              " Age: "+ this.getmarks() +                     
              " Id: "+ this.getId()+"]"); 
   }
}

 



	
	

