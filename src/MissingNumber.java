import java.util.Scanner;

public class MissingNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        sc.nextLine();

        long total = n * (n + 1) / 2;

        long sum = 0;

        String line = sc.nextLine();

        for (String number : line.split(" ")) {
            sum += Integer.parseInt(number);
        }

        System.out.println(total - sum);
    }
}
