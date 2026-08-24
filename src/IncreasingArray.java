import java.util.Scanner;

public class IncreasingArray {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        long lastNumber = 0;
        long minimumMoves = 0;

        for (int i = 0; i < n; i++) {
            long currentNumber = sc.nextLong();

            if (i == 0) {
                lastNumber = currentNumber;
                continue;
            }

            if (currentNumber < lastNumber) {
                minimumMoves += Math.abs(currentNumber - lastNumber);
                currentNumber += Math.abs(currentNumber - lastNumber);
            }

            lastNumber = currentNumber;
        }

        System.out.println(minimumMoves);
    }
}
