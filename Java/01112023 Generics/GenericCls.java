// class Container{
//     Object contain;

//     public Container(Object contain) {
//         this.contain = contain;
//     }
//     public Object getContain(){
//         return contain;
//     }
//     public void showType(){
//         System.out.println(contain.getClass());
//         System.out.println(contain.getClass().getName());
//     }
// }

class Container<T, V>{
    T contain;
    
    public T getContain(){
        return contain;
    }
    public V showData(V data){
        return data;
    }
    public void showType(){
        System.out.println(contain.getClass().getContain());
    }
}

public class GenericCls {
    public static void main(String[] args) {
        // Container c = new Container("Cdac");
        // System.out.println(c.getContain());
        // c.showType();

        // // Object ko string me store karne ke liye downcasting karna padega
        // String s = (String)c.getContain();
        // System.out.println(s);


        // Ise hum generics se directly kar sakte hai
        Container<String> c = new Container<>("Cdac");
        String s = c.getContain();
        System.out.println(s);
        c.showType();
    }
    
}
