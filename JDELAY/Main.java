import java.util.Scanner;
import java.util.stream.IntStream;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int T = sc.nextInt();
		for (int tc = 0; tc < T; tc++) {
			int N = sc.nextInt();
			int[] S = new int[N];
			int[] J = new int[N];
			for (int i = 0; i < N; i++) {
				S[i] = sc.nextInt();
				J[i] = sc.nextInt();
			}

			System.out.println(solve(S, J));
		}

		sc.close();
	}

	static int solve(int[] S, int[] J) {
		return (int) IntStream.range(0, S.length).filter(i -> J[i] - S[i] > 5).count();
	}
}
