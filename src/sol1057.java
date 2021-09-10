import java.util.Scanner;

public class sol1057 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int N = scan.nextInt();	// 참가자 수
        int Kim = scan.nextInt();	// 김지민 번호
        int Lim = scan.nextInt();	// 임한수 번호
        int count = 0;

        while(Kim != Lim) {         // 둘의 숫자가 같지 않을때까지 계속 진행
            Kim = (Kim + 1) / 2;    // 8일때 이기면, 4가 되고 4일때이기면 2가된다. 9일때 이기면 5가된다. 그러므로 이와같은 연산처리
            Lim = (Lim + 1) / 2;
            count  ++;
        }
        System.out.println(count);
        scan.close();
    }
}
