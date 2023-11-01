import java.util.List;

public class GenericsDemo{
    // Generics use
    // public static <E>void showData(E arr[]){
    //     for(E s: arr){
    //         System.out.println(s);
    //     }
    // }

    // upper bound
    // public static <E>void showData(List <E> lst){
    //     for(E s: lst){
    //         System.out.println(s);
    //     }
    // }

    // I think also upper bound
    public static void showData(List <? extends Number> lst){
        for(Number s: lst){
            System.out.println(s);
        }
    }


    public static void main(String[] args) {
        // String names[] = {"RAmeshe" , "Sureshe", "Visheshe" , "Tameshe"};
        // Integer ages[] = {23, 53, 52, 12};
        // showData(ages);

        // List lst1 = List.of("Ramesh", "Suresh", "Mahesh", "Brijesh");
        // showData(lst1);

        List lst2 = List.of(23, 79, 42, 21, 29);
        showData(lst2);
    }
}   