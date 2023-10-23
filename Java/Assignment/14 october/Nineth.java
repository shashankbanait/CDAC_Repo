public class Nineth {
    public static void main(String[] args) {
        int n = 7; // Height of the letters
 
         for (int i = 0; i < n; i++) {
             for (int j = 0; j < n; j++) {
                 // Display 'T'
                 if (i == 0 || j == n / 2) {
                     System.out.print("T");
                 } else {
                     System.out.print(" ");
                 }
             }
            
             System.out.print("   "); 
 
             for (int j = 0; j < n; j++) {
                 if (j == 0 || (i == n / 2 && j >= n / 2) || (i == j && j >= n / 2) || (i + j == n - 1 && j <= n / 2)) {
                     System.out.print("K");
                 } else {
                     System.out.print(" ");
                 }
             }
             System.out.println();
         }
     }
 
}
