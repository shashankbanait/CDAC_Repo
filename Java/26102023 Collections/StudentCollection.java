import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Vector;

public class StudentCollection {
   public static void main(String[] args) {
        Vector<Student> v = new Vector<>();
        Student s1 = new Student(101,"Ramesh", 23);
        Student s2 = new Student(102,"Bhavesh", 24);
        Student s3 = new Student(105,"Maheshh", 25);
        Student s4 = new Student(103,"Dinesh", 21);

        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);

        // System.out.println(v.get(1).getName());
        // System.out.println(v.get(2).getName());
       
       
         System.out.println("---------------------------------");
         
        Collections.sort(v);
        Iterator<Student> it = v.iterator();
        while(it.hasNext()){
            Student student = it.next();
            System.out.println("Id: "+student.getId() +" Name: " + student.getName() + "Age: " + student.getAge());
       
    }}
}

