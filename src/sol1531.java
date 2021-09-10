import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class sol1531 {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());
        int m = Integer.parseInt(st.nextToken());
        int[][] picture = new int[100][100];    //    100x100 배열 생성
        for(int[] row: picture) {    //배열 내 값을 전부 0으로 초기화
            Arrays.fill(row, 0);        // java.util.Arrays 사용
        }

        for(int i = 0; i < n; i++) {    // 종이가 덮이는 부분을 한 겹당 +1 씩해준다 몇개의 종이가쌓이고 있는가 생각하면된다.
            StringTokenizer paper = new StringTokenizer(br.readLine());
            int x1 = Integer.parseInt(paper.nextToken()) -1;        // 배열의 array 는 0부터 시작하므로 -1 해준다
            int y1 = Integer.parseInt(paper.nextToken()) -1;
            int x2 = Integer.parseInt(paper.nextToken()) -1;
            int y2 = Integer.parseInt(paper.nextToken()) -1;
            for(int j = y1; j <= y2; j++) {
                for(int k = x1; k <= x2; k++) {
                    picture[j][k]++;                // 좌표 안에 해당하는 부분을 모두 1씩 더해준다
                }                                   // 물론 2번해당하면 2 가된다
            }


        }

        int cnt = 0;                    // 안보이는 좌표를 세줄것이다.
        for(int i = 0; i < 100; i++) {    //종이가 m번 넘게 덮여있는 부분을 카운트해준다.
            for(int j = 0; j < 100; j++) {
                if(picture[i][j] > m) {     // m보다 많이 종이가 덮혀있다면 그말은 즉슨 안보인다는것이다
                    cnt++;              // m보다 그 배열의 값이 클때 증가시켜준다.
                }
            }
        }
        System.out.println(cnt);


    }

}