import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);

        int A = in.nextInt();

        in.close();

        if(A >= 90) System.out.println("A");
        else if(A >= 80 && A < 90) System.out.println("B");
        else if(A >= 70 && A < 80) System.out.println("C");
        else if(A >= 60 && A < 70) System.out.println("D");
        else System.out.println("F");
    }
}