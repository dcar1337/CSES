import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

class FastReader {
    private final BufferedReader bufferedReader;

    private StringTokenizer tokenizer;

    public FastReader() {
        this.bufferedReader = new BufferedReader(new InputStreamReader(System.in));
    }

    public String next() {
        while (this.tokenizer == null || !this.tokenizer.hasMoreElements()) {
            try {
                this.tokenizer = new StringTokenizer(this.bufferedReader.readLine());
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return tokenizer.nextToken();
    }

    public int nextInt() {
        return Integer.parseInt(this.next());
    }

    public long nextLong() {
        return Long.parseLong(this.next());
    }

    public double nextDouble() {
        return Double.parseDouble(this.next());
    }

    public String nextLine() {
        String str = "";
        try {
            if (this.tokenizer.hasMoreTokens()) {
                str = this.tokenizer.nextToken("\n");
            } else {
                str = this.bufferedReader.readLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return str;
    }
}

public class NumberSpiral {

    private static void solve(long row, long col) {
        //If 2x2 -> MAX=4.
        // n=2 => 2->4
        // n=3 => 5->9
        // (layer - 1)^2 + 1 -> layer^2
        long layer = Long.max(row, col);

        if (layer % 2 != 0) {
            long aux = col;
            col = row;
            row = aux;
        }

        if (layer == row) {
            System.out.println(layer*layer - (col - 1));
        } else {
            System.out.println((layer - 1)*(layer - 1) + 1 + (row - 1));
        }

    }

    public static void main(String[] args) {
        FastReader sc = new FastReader();

        int n = sc.nextInt();
        while (n > 0) {
            long row = sc.nextLong();
            long col = sc.nextLong();
            solve(row, col);
            n--;
        }
    }
}
