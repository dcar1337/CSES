import java.util.Scanner;

public class WeirdAlgorithm{
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		
		long n = in.nextInt();
		String result = n + " ";
		
		while(n != 1){
			if(n % 2 == 0)
				n = n/2;
			else
				n = n*3+1;
			result += n + " ";
		}
		
		System.out.print(result.trim());
	}
}
