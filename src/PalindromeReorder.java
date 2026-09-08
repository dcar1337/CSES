import java.util.Scanner;

public class PalindromeReorder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int [] arr = new int[26];

        StringBuilder palindrome = new StringBuilder();

        String letters = sc.nextLine();

        for (char c : letters.toCharArray()) {
            arr[c - 'A']++;
        }

        char middle = '?';

        for (int i = 0; i < 26; i++) {
            if (arr[i] % 2 == 1) {
                if (middle != '?') {
                    System.out.println("NO SOLUTION");
                    return;
                }
                middle = (char) ((char)'A' + i);
            } else {
                palindrome.append((""+(char) ((char)'A' + i)).repeat(arr[i]/2));
            }
        }
        String reversed = palindrome.reverse().toString();
        palindrome.reverse();
        if (middle != '?') {
            palindrome.append((""+middle).repeat(arr[middle - 'A']));
        }
        palindrome.append(reversed);
        System.out.println(palindrome);
    }
}
