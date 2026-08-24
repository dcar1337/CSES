import java.util.Scanner;

public class Permutations {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();

        if (n == 1) {
            System.out.println(1);
        }

        if (n == 2 || n == 3) {
            System.out.println("NO SOLUTION");
        }

        if (n > 3) {
            StringBuilder result = new StringBuilder();
            for (int i = 2; i <= n; i += 2) {
                result.append(i).append(" ");
            }
            for (int i = 1; i <= n; i += 2) {
                result.append(i).append(" ");
            }
            System.out.println(result.toString().trim());
        }
    }
}
