public class RecursionDemo{
    public int fact(int n){
        if(n==1){
            return n;
        }
        return n*fact(n-1);
    }
    public static void main(String[] args) {
        RecursionDemo r = new RecursionDemo();
        System.out.println(r.fact(5));
    }
}