import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            
            int N = Integer.parseInt(br.readLine());
            int temp = N;
            int cnt = 0;

            while(true){
                int left = temp / 10;
                int right = temp % 10;
                temp = right * 10 + (left + right) % 10;
                cnt++;
                if(N == temp){
                    break;
                }

            }            
            System.out.println(cnt);
        }
    }    
