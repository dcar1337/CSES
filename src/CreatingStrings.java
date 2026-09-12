import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CreatingStrings {

    public static void solve(Set<String> solutions, StringBuilder str, String availableLetters, int index) {
        if (str.length() == availableLetters.length()) {
            solutions.add(str.toString());
            return;
        }


    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.nextLine();
        int n = s.length();

        Set<String> solutions = new TreeSet<>();
        StringBuilder str = new StringBuilder();

        solve(solutions, str, s, n);
    }
}
