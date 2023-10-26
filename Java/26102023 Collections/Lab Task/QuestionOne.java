// Q1. .Write a java program to Create a collection of Employee class and sort objects using comparable and comparator interfaces
// package Lab Task;

import java.util.Iterator;
import java.util.PriorityQueue;

class Employee implements Comparable<Employee>{
    private int empId;
    private String name;


    public Employee(int empId, String name) {
        this.empId = empId;
        this.name = name;
    }

        @Override
    public String toString() {
        return "Employee [empId=" + empId + ", name=" + name + "]";
    }

    @Override
    public int compareTo(Employee o) {
        return this.empId - o.empId;
    }


    public int getEmpId() {
        return empId;
    }
    public String getName() {
        return name;
    }
    
}
public class QuestionOne {
    public static void main(String[] args) {
        PriorityQueue<Employee> v = new PriorityQueue<>();
        Employee s1 = new Employee(101,"Ramesh");
        Employee s2 = new Employee(102,"Bhavesh");
        Employee s3 = new Employee(105,"Maheshh");
        Employee s4 = new Employee(103,"Dinesh");

        v.add(s1);
        v.add(s2);
        v.add(s3);
        v.add(s4);

        Iterator<Employee> it = v.iterator();
        while(it.hasNext()){
            Employee emp = it.next();
            System.out.println("Id: "+emp.getEmpId() +" Name: " + emp.getName());
       
        }
    }
}
