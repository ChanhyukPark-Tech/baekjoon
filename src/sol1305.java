import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class sol1305 {
    public static void main(String[] args) throws NumberFormatException, IOException {
        String pattern;
        int L;

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        L = Integer.parseInt(br.readLine());            // 문자열 길이 읽기 광고판의 크기
        pattern = br.readLine();                        // 두번째 줄에 주어지는 문자열 패턴

        int Pi[] = getPi(pattern);

        System.out.println(L-Pi[L-1]);
    }

    static int[] getPi(String Pattern) {            // aaaaa 면 접두사 aaaa 와 접미사 aaaa 가 같으므로 4 뱉음
        int[] pi = new int[Pattern.length()];       // pi 배열 지정

        int j = 0;

        for (int i = 1; i < Pattern.length(); i++) {    //

            while (j > 0 && Pattern.charAt(i) != Pattern.charAt(j)) {
                j = pi[j - 1];
            }
            if (Pattern.charAt(i) == Pattern.charAt(j)) {
                pi[i] = ++j;
            }
        }
        return pi;
    }
}