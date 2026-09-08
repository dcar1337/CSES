import java.util.*;

public class GrayCode {

    public static List<String> solve(int n) {

        if (n == 1) {
            return new ArrayList<>(List.of("0", "1"));
        }

        List<String> bitString = solve(n - 1);
        List<String> reversedBitString = new ArrayList<>(bitString);
        Collections.reverse(reversedBitString);
        bitString.replaceAll(s -> s + "1");
        reversedBitString.replaceAll(s -> s + "0");
        bitString.addAll(reversedBitString);
        return bitString;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        List<String> grayCode = solve(n);


        for (String bitString : grayCode) {
            System.out.println(bitString);
        }
    }
}
