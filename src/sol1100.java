import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class sol1100 {
    public static void main(String[] args) throws IOException {

        final int oneLine = 8;      // 체스판의 한 가로길이와 세로길이를 상수값으로 지정
        String[] arr; // 들어오는 8 * 8 의 한줄을 담을 배열
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), ""); // 한 줄을 읽어준다 (8줄중 하나)

        int count = 0;          // 최종 답으로 제출할 값 계속 누적하여 쌓아갈 것임
        for (int i = 0; i < oneLine; i++) {     // i 는 위에서 아래로 한줄 한줄을 뜻한다
            if (i != 0) {
                st = new StringTokenizer(br.readLine(), "");    // 첫줄은 이미 위에서 읽었으므로 i가 0일때는 한줄 더 읽을 필요없습니다.
            }
            arr = st.nextToken().split("");                     // i 가 0 이 아닐때는 새로운 줄을 읽어준다
            for (int j = 0; j < oneLine; j++) {                         // j는 왼쪽에서 오른쪽으로 한칸한칸을 뜻한다
                if (i % 2 == 0 && j % 2 == 0 && arr[j].equals("F")) count++;    // 여기서 String String 비교할때 Object값이므로 주의하자
                if (i % 2 == 1 && j % 2 == 1 && arr[j].equals("F")) count++;
            }
        }
        System.out.println(count);
    }
}
