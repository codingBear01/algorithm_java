import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int H = in.nextInt();
        int M = in.nextInt();

        in.close();

        if(M < 45) { 
            H--; // 시간 1 빼기
            M += 15; // M = 60 - (45 - M)임

            if(H < 0){
                H += 24; // 시간 입력값이 0일 경우(출력 -1인 경우) 24를 더해줌
            }
            System.out.println(H + " " + M);
        } else {
            System.out.println(H + " " + (M - 45));
        }
    }
}