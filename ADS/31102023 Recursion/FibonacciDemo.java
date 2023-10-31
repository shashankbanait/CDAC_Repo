public class FibonacciDemo {
    public int fibo(int n){
        if(n<=1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
    public static void main(String[] args) {
        FibonacciDemo f = new FibonacciDemo();
        System.out.println(f.fibo(4));
    }
}
