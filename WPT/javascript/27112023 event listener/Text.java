import java.util.*;

import java.math.*;

public class PerfectSubarray {

    public static boolean checkPerfectSquare(double s) {
        double sqr;
        sqr = Math.sqrt(s);
        int sqroot = (int) sqr;

        return (sqr - sqroot == 0.0);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int count = 0;

        double sum = 0;

        boolean b;

        int numbers[] = new int[n];
        for (int i = 0; i < n; i++)

            numbers[i] = sc.nextInt();
        for (int i = 0; i < n; i++) {
            sum = 0;

            for (int j = i; j < n; j++) {

                sum = sum + numbers[j];

                b = checkPerfectSquare(sum);

                if (b == true)

                    count++;

            }

        }
        System.out.println(count);
    }
}