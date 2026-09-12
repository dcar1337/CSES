import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class CreatingStrings {

    public static String getString(String[] arr) {
        StringBuilder str = new StringBuilder();

        for (String s : arr) {
            str.append(s);
        }

        return str.toString();
    }

    public static void solve(Set<String> solutions, String[] currentString, int nextIndex) {
        if (nextIndex == currentString.length) {
            solutions.add(getString(currentString));
            return;
        }

        for (int i = nextIndex; i < currentString.length; i++) {
            String currentItem = currentString[i];
            currentString[i] = currentString[nextIndex];
            currentString[nextIndex] = currentItem;

            solve(solutions, currentString, nextIndex + 1);

            currentItem = currentString[nextIndex];
            currentString[nextIndex] = currentString[i];
            currentString[i] = currentItem;
        }

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String[] s = sc.nextLine().split("");

        Set<String> solutions = new TreeSet<>();
        solve(solutions, s,0);

        System.out.println(solutions.size());
        for (String solution : solutions) {
            System.out.println(solution);
        }
    }
}
