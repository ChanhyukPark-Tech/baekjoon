import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import java.util.StringTokenizer;

public class sol1259 {

    public static boolean palindromeCheck(String str) {
        Stack<String> stack = new Stack<>();
        String[] arr = str.split("");
        int length = arr.length;
        int half = length / 2;

        for (int i = 0; i < half; i++) {
            stack.push(arr[i]);
        }
        if(length % 2 == 0){
            for (int i = half; i < length; i++) {
                if (!stack.pop().equals(arr[i])) return false;
            }
        }else{
            for (int i = half + 1; i < length; i++) {
                if (!stack.pop().equals(arr[i])) return false;
            }
        }
        return true;
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;
        List<String> list = new ArrayList<>();

        while (true) {
            st = new StringTokenizer(br.readLine()," ");
            String oneLine = st.nextToken();
            if(oneLine.equals("0")) {
                break;
            }
            list.add(oneLine);
        }

        for(String str : list){
            boolean result = palindromeCheck(str);
            if(result) System.out.println("yes");
            else{
                System.out.println("no");
            }
        }

    }
}
