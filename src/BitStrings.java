import java.util.Scanner;

public class BitStrings {
    public static void main(String[] args) {
        int MOD = 1_000_000_007;
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int answer = 1;
        for (int i = 0; i < n; i++) {
            answer *= 2;
            answer %= MOD;
        }

        System.out.println(answer);
    }
}
