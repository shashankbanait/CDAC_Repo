// 1.Create an Array of Employee class and initialize array elements with different employee objects.
class Employee{
    String name;
    int id;
    public Employee(String a, int b){
        name = a;
        id = b;
    }
}

public class QuestionOne{
    public static void main(String[] args) {
        Employee arrayOfEmployee[] = new Employee[3];
        arrayOfEmployee[0] = new Employee("Harshal", 1001);
        arrayOfEmployee[1] = new Employee("Prabhat", 1002);
        arrayOfEmployee[2] = new Employee("Milind", 1003);

        for(int i=0; i<3; i++){
            System.out.println("Id is: " + arrayOfEmployee[i].id + " Name is: " + arrayOfEmployee[i].name);
        }
    }
}