import java.util.*;

public class AppleDivision {

    public static long getDiff(List<Long> g1, List<Long> g2) {
        long sum1 = 0, sum2 = 0;
        for (long n : g1) {
            sum1 += n;
        }

        for (long n : g2) {
            sum2 += n;
        }

        return Math.abs(sum1 - sum2);
    }

    public static long solve(List<Long> g1, List<Long> g2, long [] weights, long minimumDiff, int index) {
        if ((g1.size() + g2.size()) == weights.length) {
            long currentDiff = getDiff(g1, g2);

            if (currentDiff < minimumDiff) {
                minimumDiff = currentDiff;
            }

            return minimumDiff;
        }

        for (int i = 0; i < 2; i++) {
            if (i == 0) {
                g1.add(weights[index]);
            }

            if (i == 1) {
                g2.add(weights[index]);
            }

            minimumDiff = solve(g1, g2, weights, minimumDiff, index + 1);

            if (i == 0) {
                g1.remove(g1.size() - 1);
            }

            if (i == 1) {
                g2.remove(g2.size() - 1);
            }
        }

        return minimumDiff;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int applesNumber = sc.nextInt();
        long [] weights = new long[applesNumber];

        for (int i = 0; i < weights.length; i++) {
            weights[i] = sc.nextLong();
        }

        List<Long> g1 = new ArrayList<>(), g2 = new ArrayList<>();

        long minimumDiff = solve(g1, g2, weights, Long.MAX_VALUE, 0);

        System.out.println(minimumDiff);
    }
}
