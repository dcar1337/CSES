import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class CoinPiles {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        try {
            long n = Long.parseLong(br.readLine().trim());

            while(n > 0) {
                String [] numbers = br.readLine().split(" ");
                long a = Long.parseLong(numbers[0]);
                long b = Long.parseLong(numbers[1]);

                if ((a + b) % 3 == 0 && a <= 2 * b && b <= 2 * a) {
                    System.out.println("YES");
                } else {
                    System.out.println("NO");
                }
                n--;
            }
        } catch(IOException e) {
            System.err.println(e.getMessage());
        }
    }
}
