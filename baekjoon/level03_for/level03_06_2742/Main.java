import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                
            int N = Integer.parseInt(br.readLine());
            
            br.close();

            for(int i = N; i > 0; i--){
                System.out.println(i);
            }
        }
    }

// import java.util.Scanner;

// public class Main {
//     public static void main(String[] args){
//         Scanner in = new Scanner(System.in);

//         int N = in.nextInt();
//         in.close();

//         int i = 1;

//         while(i <= N){
//             System.out.println(i);
//             i++;
//         }
//     }
// }
