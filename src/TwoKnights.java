import java.util.Scanner;

public class TwoKnights {

    public static long calculateTwoKnights(int n) {
        return (long) n*n*((long) n *n-1)/2 - 4L *(n-2)*(n-1);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            long result = calculateTwoKnights(i);
            System.out.println(result);
        }
    }
}
