import java.util.Scanner;


public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        double A = scanner.nextDouble();
        double B = scanner.nextDouble();
        // 제한 조건 충족하려면 double 써야 함

        System.out.println(A / B);

        scanner.close();
    }
}
