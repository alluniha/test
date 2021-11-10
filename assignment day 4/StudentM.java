
import java.util.ArrayList;
import java.util.List;

public class StudentM {

 public static void main(String[] args) {
      List<Student> studentlist = new ArrayList<Student>();
      studentlist.add(new Student("Niha", 22, 11)); 
      studentlist.add(new Student("Maha", 19, 13)); 
      studentlist.add(new Student("Varun", 23, 15)); 
      studentlist.add(new Student("Teja", 20, 16)); 
      studentlist.add(new Student("Kiran", 18, 17));
      System.out.println("Before Sorting the student data:"); 
 
      
      studentlist.forEach((s)->System.out.println(s));

      System.out.println("After Sorting the student data by marks:"); 

      //Lambda expression for sorting by marks
      studentlist.sort((Student s1, Student s2)->s2.getmarks()-s1.getmarks()); 
      //  for printing the list
      studentlist.forEach((s)->System.out.println(s));         

     
 }

}
