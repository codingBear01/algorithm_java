// import java.io.*;
// import java.util.StringTokenizer;
// import java.util.Arrays; // arr 활용 시 입력 필수

// public class Main {
//     public static void main(String[] args) throws IOException {
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        
//         int N = Integer.parseInt(br.readLine());        
//         StringTokenizer st  = new StringTokenizer(br.readLine(), " "); 

//         int[] arr = new int[N];

//         for(int i = 0; i < N; i++){
//             arr[i] = Integer.parseInt(st.nextToken());
//         }
//         Arrays.sort(arr);
//         System.out.print(arr[0] + " " + arr[N - 1]);
//     }    
// }


// ----- without arr
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));        
        
        int N = Integer.parseInt(br.readLine());        
        StringTokenizer st  = new StringTokenizer(br.readLine(), " "); 

        int max = -1000001;
        int min = 1000001;

        for(int i = 0; i < N; i++){
            int val = Integer.parseInt(st.nextToken());

            if(val > max){
                max = val;
            }
            if(val < min){
                min = val;
            }
        }
        System.out.println(min + " " + max);
    }    
}


