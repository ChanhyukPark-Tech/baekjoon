import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sol1032 {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        int number = Integer.parseInt(st.nextToken());
        String[] strArr = new String[number];
        for (int i = 0; i < number; i++) {          // 문제에서 주어진 문장들 집어넣기 문자의 길이가 같기때문에 가능하다.
            st = new StringTokenizer(br.readLine(), " ");
            strArr[i] = st.nextToken();

        }
        boolean checker;
        for (int i = 0; i < strArr[0].length(); i++) {
            checker = false;
            for (int j = 0; j < number - 1; j++) {
                if(strArr[j].charAt(i) != strArr[j+1].charAt(i)){
                    checker = true;
                    break;
                }
            }

            if(checker){
                System.out.print("?");
            }else{
                System.out.print(strArr[0].charAt(i));
            }

        }

    }
}
