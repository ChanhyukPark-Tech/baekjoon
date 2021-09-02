import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sol1010 {
    static int Left;
    static int Right;
    static int D[][];

    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        D = new int[31][31];
        for (int i = 0; i < 31; i++) {
            Arrays.fill(D[i], -1);
        }
        int T = Integer.parseInt(br.readLine());
        String input = null;
        StringTokenizer st = null;
        for (int test_case = 0; test_case < T; test_case++) {
            input = br.readLine();
            st = new StringTokenizer(input);
            Left = Integer.valueOf(st.nextToken());
            Right = Integer.valueOf(st.nextToken());
            System.out.println(Combination(Right, Left));
        }
    }

    private static int Combination(int i, int j) {
        if (i == j || j == 0) return 1;
        if (D[i][j] >= 0) return D[i][j];
        D[i][j] = Combination(i - 1, j) + Combination(i - 1, j - 1);
        System.out.println(D[i][j]);
        return D[i][j];
    }
}

