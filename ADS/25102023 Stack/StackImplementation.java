class MyStack{
    final int SIZE = 3;
    int arr[] = new int[SIZE];
    int top = -1;

    public boolean isEmpty(){
        if(top==-1){
            return true;
        }
        else{
            return false;
        }
    }
    
    public boolean isFull(){
        if(top==SIZE-1){
            return true;
        }
        else{
            return false;
        }
    }

    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full........");
        }
        else{
            ++top;
            arr[top] = value;
        }
    }

    public void pop(){
        if(isEmpty()){
            System.out.println("Stack is Empty........");
        }
        else{
            System.out.println(arr[top] + " is popped.........");
            top--;
        }
    }

    public void peek(){
        if(isEmpty()){
            System.out.println("Stack is Empty........");
            return;
        }
        else{
            System.out.println("Peeked element is: "+ arr[top]);
        }
    }

    public void show(){
        for (int i = 0; i <= top; i++) {
            System.out.println(arr[i]);
        }
    }
}
public class StackImplementation{
    public static void main(String[] args) {
        MyStack stack = new MyStack();
        stack.push(3);
        System.out.println("3 is pushed");
        stack.push(18);
        System.out.println("18 is pushed");
        stack.push(9);
        System.out.println("9 is pushed");
        stack.push(63);
        stack.pop();
        stack.peek();

        System.out.println("*****************");

        // for printing the elements
        stack.show();
    }
}