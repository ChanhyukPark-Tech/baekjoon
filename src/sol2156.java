import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sol2156 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), "");
        int length = Integer.parseInt(st.nextToken());

        int[] grape = new int[length];

        for (int i = 0; i < length; i++) {
            st = new StringTokenizer(br.readLine(), "\n");
            grape[i] = Integer.parseInt(st.nextToken());
        }
        System.out.println(grapeShot(grape));
    }

    // DP = [0,6,16,
    public static int grapeShot(int[] grape) {
        // grape = [5,2] grape.length = 2 DP 가 3개짜리가만들어진다.
        // grape = [2,7,5] grape.length = 3 DP 가 4개짜리가 만들어진다
        int[] DP = new int[grape.length + 1];
        if (grape.length >= 0) {
            DP[0] = 0;
        }
        if (grape.length >= 1) {
            DP[1] = grape[0];
        }
        if (grape.length >= 2) {
            DP[2] = grape[0] + grape[1];
        }

        if(grape.length >= 3){
            for (int i = 3; i <= grape.length; i++) {
                DP[i] = max3(DP[i - 1], DP[i - 2] + grape[i - 1], DP[i - 3] + grape[i - 2] + grape[i - 1]);
            }
        }

        return DP[grape.length];
    }

    public static int max3(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }
}
