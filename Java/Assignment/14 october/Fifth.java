/*
 * 5.Write a Java program to demonstrate Upcasting Vs Downcasting
 */
// UPCASTING
/*
class  Parent{  
    void show() {  
    System.out.println("method of parent class");  
}  
}  
  
class Child extends Parent {  
   void show() {  
      System.out.println("method of child class");  
   }  
}  
class Fifth{  
   public static void main(String args[]) {  
        
      Parent obj1 = (Parent) new Child();  
      Parent obj2 = (Parent) new Child();   
      obj1.show();  
      obj2.show();  
   }  
} 
*/

// DOWNCASTING
class Parent{   
    String name;
    void showMessage()   
    {   
        System.out.println("Parent method is called");   
    }   
}   
    
// Child class   
class Child extends Parent {   
    int age;   
    @Override  
    void showMessage()   
    {   
        System.out.println("Child method is called");   
    }   
}   
    
public class Fifth{  
    
    public static void main(String[] args)   
    {   
        Parent p = new Child();  
        p.name = "SoftPolynomials";
        Child c = (Child)p;   
    
        c.age = 18;   
        System.out.println(c.name);   
        System.out.println(c.age);   
        c.showMessage();
    }   
}  