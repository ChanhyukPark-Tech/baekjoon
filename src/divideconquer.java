import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

public class divideconquer {

    public static void main(String[] args) throws IOException {
        int[] arr = { 4,5,6,7,3,2,};
        System.out.println(foo(arr));

    }

    public static int foo(int[] arr){
        return foo(arr, 0, arr.length - 1, arr.length -1);
    }

    private static int foo(int[] arr, int p, int q, int max){
//        int max = arr.length - 1;

        if(p >= q) return max;
        int m = (p + q) / 2;
        max = foo(arr, p, m, max);
        max = foo(arr, m + 1, q, max);
        max = findMax(arr, p, m, q, max);
        return max;
    }

    private static int findMax(int[] arr, int p, int m, int q, int max){
//        int max = arr.length - 1;
        int right = m + 1;
        if(arr[p] <= arr[m] && arr[m] > arr[right] && max > m){
            max = m;
        }
        return max;
    }
}
