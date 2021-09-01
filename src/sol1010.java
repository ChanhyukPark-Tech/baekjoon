import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sol1010 {
    static int N;
    static int M;
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
            N = Integer.valueOf(st.nextToken());
            M = Integer.valueOf(st.nextToken());
            System.out.println(C(M, N));
        }
    }

    private static int C(int i, int j) {
        if (i == j || j == 0) return 1;
        if (D[i][j] >= 0) return D[i][j];
        D[i][j] = C(i - 1, j) + C(i - 1, j - 1);
        System.out.println(D[i][j]);
        return D[i][j];
    }
}

