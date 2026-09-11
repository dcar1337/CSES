import java.util.Scanner;

public class TowerOfHanoi {

    public static void solve(int n, int from, int to) {
        int other = 6 - from - to;
        if (n == 0) {
            return;
        }
        solve(n-1, from, other);
        System.out.println(from + " " + to);
        solve(n-1,other, to);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        //move from 1 to two
        System.out.println((int)Math.pow(2, n) - 1);
        solve(n, 1, 3);
    }
}
