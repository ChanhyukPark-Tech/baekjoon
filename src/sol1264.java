import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;
import java.util.StringTokenizer;

public class sol1264 {
    public static int vowelChecker(String[] arr) { // 들어온 String array 에 vowel 이 몇개 있는지 확인한다.
        int vowelCount = 0;             // 모음의개수
        for (String str :
                arr) {
            str = str.toLowerCase();        // 대문자도 그냥 소문자로다바꿔서 처리
            if(str.equals("a") || str.equals("e") || str.equals("i") || str.equals("o") || str.equals("u")){
                vowelCount++;
            }
        }
        return vowelCount;
    }

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        while (true){
            StringTokenizer st = new StringTokenizer(br.readLine(), ""); // 한 줄을 읽어준다 (8줄중 하나)
            String temp = st.nextToken();               // # 인지 아닌지체크하기 위해
            if(temp.equals("#")){ // 끝 도달
                break;
            }
            String[] arr;
            arr = temp.split("");                     // i 가 0 이 아닐때는 새로운 줄을 읽어준다
            System.out.println(vowelChecker(arr));
        }

    }
}
