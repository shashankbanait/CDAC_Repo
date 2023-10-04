public class JaggedArray {
    public static void main(String[] args) {
        // int[][] jag = new int[3][];
        // jag[0] = new int[]{1, 2, 3, 4, 5};
        // jag[1] = new int[]{1, 2, 3};
        // jag[2] = new int[]{4, 5, 6, 7};

        // shortcut
        int[][] jag = {{1, 2, 3, 4, 5}, {1, 2, 3}, {4, 5, 6, 7}};


        // for (int i = 0; i < jag.length; i++) {
        //     for (int j = 0; j < jag[i].length; j++) {
        //         System.out.print(jag[i][j] + " ");
        //     }
        //     System.out.println();
        // }

        for(int i=0; i<jag.length; i++){
            for(int j=0; j<jag[i].length; j++){
                System.out.print(jag[i][j] + " ");
            }
            System.out.println();
        }
    }
}
