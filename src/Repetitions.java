import java.util.Scanner;

public class Repetitions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String line = sc.nextLine();

        char seen = '\0';
        int counter = 0, max = 0;

        for (char letter : line.toCharArray()) {
            if (seen != letter) {
                seen = letter;
                counter = 1;
            } else {
                counter++;
            }
            max = Integer.max(counter, max);
        }

        System.out.println(max);
    }
}
