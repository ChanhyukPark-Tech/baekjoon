import java.util.Scanner;

public class sol1094 {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int count = 0;
        int stick = 64;

        while(X>0){
            if(stick>X) stick /= 2;
            else{
                count ++;
                X-=stick;
            }
        }
        System.out.println(count);
    }
}
