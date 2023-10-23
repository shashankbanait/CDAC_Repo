public class StringPract{
    public static void main(String[] args) {
        // StringBuffer s1 = new StringBuffer("Garry");
        // StringBuffer s2 = new StringBuffer("Vee");
        // System.out.println(s1);
        // // s1.append(s2);
        // System.out.println(s1);
        // s2.append(s1);
        // System.out.println("This is s2: "+s2);

        // String s = "My name is Garry vee";
        // char[] arr = s.toCharArray();
        // for(int i=0 ; i< 100; i++){
        //     System.out.println(arr[i]);
        // }


        // CompareTo()
        String s1 = "Jack";
        String s2 = "jack";
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareToIgnoreCase(s2));
    }
}