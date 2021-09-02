import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

import java.util.LinkedList;
import java.util.StringTokenizer;

public class sol1021 {

    public static void main(String[] args) throws IOException {

        LinkedList<Integer> deque = new LinkedList<Integer>();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");


        int count = 0;	// 2, 3번 연산이 실행된 횟수의 합


        int N = Integer.parseInt(st.nextToken());	// 큐의 크기(1 ~ N)
        int M = Integer.parseInt(st.nextToken());	// 뽑으려는 숫자의 개수 둘째 줄에 나오는 숫자 개수

        // 덱에 순서대로 숫자를 담아준다. (문제에서 이 부분에 대한 설명이 약간 아쉬웠다)
        for(int i = 1; i <= N; i++) {
            deque.offer(i);
        }

        int[] seq = new int[M];	// 뽑고자 하는 수를 담을 배열을 만들기

        st = new StringTokenizer(br.readLine(), " ");
        for(int i = 0; i < M; i++) {
            seq[i] = Integer.parseInt(st.nextToken()); // 배열에 뽑을 숫자들 하나하나 담아주자
        }


        for(int i = 0; i < M; i++) {

            // 덱에서 뽑고자 하는 숫자의 위치(index) 찾기
            int target_idx = deque.indexOf(seq[i]);
            int half_idx;
            /*
             *  만약 현재 덱의 원소가 짝수 개라면 중간 지점을
             *  현재 덱의 절반 크기에서 -1 감소시킨것으로 한다.
             *  {1, 2, 3, 4} 일 때, 2를 중간지점으로 하면
             *  인덱스는 1이기 때문이다.
             *  홀수인 경우에는 그냥 반으로 나눠주면 된다.
             */
            if(deque.size() % 2 == 0) {
                half_idx = deque.size() / 2 - 1;
            }
            else {
                half_idx = deque.size() / 2;
            }


            // 중간 지점 또는 중간 지점보다 원소의 위치가 앞에 있을 경우
            if(target_idx <= half_idx) {
                // idx 보다 앞에 있는 원소들을 모두 뒤로 보낸다. (문제에서의 2번 연산)
                for(int j = 0; j < target_idx; j++) {
                    int temp = deque.pollFirst();
                    deque.offerLast(temp);
                    count++;
                }
            }
            else {	// 중간 지점보다 원소의 위치가 뒤에 있는 경우
                // idx를 포함한 뒤에 있는 원소들을 모두 앞으로 보낸다. (문제에서의 3번 연산)
                for(int j = 0; j < deque.size() - target_idx; j++) {
                    int temp = deque.pollLast();
                    deque.offerFirst(temp);
                    count++;
                }

            }
            deque.pollFirst();	// 연산이 끝나면 맨 앞 원소를 삭제 해준다.(1번연산)
        }

        System.out.println(count);          // 최종 뽑고십은 숫자 다 뽑았을때까지 2번연산 실행된횟수 + 3번연산 실행된 횟수


    }
}