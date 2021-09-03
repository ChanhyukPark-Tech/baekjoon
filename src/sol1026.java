import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;
import java.io.IOException;

public class sol1026 {
    public static int findMax(int[] arr) {
        // 최대값, 최대값의 인덱스 초기값 세팅
        int max = arr[0];
        int maxIndex = 0;
        // 최대값, 최대값의 인덱스 구하기
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                maxIndex = i;

            }
        }
        arr[maxIndex] = 0;

        return max;
    }



    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int length = Integer.parseInt(st.nextToken());

        int[] A = new int[length];
        int[] B = new int[length];

        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < A.length; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }
        st = new StringTokenizer(br.readLine(), " ");

        for (int i = 0; i < B.length; i++) {
            B[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);

        int sum = 0 ;
        for(int i = 0; i< length; i++){
            sum += A[i] * findMax(B);
        }
        System.out.println(sum);
    }
}
