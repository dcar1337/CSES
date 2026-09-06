import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TwoSets {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        StringBuilder A = new StringBuilder();
        StringBuilder B = new StringBuilder();
        long a = 0, b = 0, sizeA = 0, sizeB = 0;
        for (long i = n; i >= 1; i--) {
            if (a > b) {
                B.append(i).append(" ");
                b += i;
                sizeB++;
            } else {
                A.append(i).append(" ");
                a += i;
                sizeA++;
            }
        }

        if (a == b) {
            System.out.println("YES");
            System.out.println(sizeA);
            System.out.println(A);
            System.out.println(sizeB);
            System.out.println(B);
        } else {
            System.out.println("NO");
        }
    }
}
