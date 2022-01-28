import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            int N = Integer.parseInt(br.readLine());

            br.close();

            String star = "";
            String space = "";

            for (int i = 1; i <= N; ++i) {
                star += "*";
                for(int j = N - i; j > 0; --j){
                space += " ";
                }
                System.out.print(space + star + "\n");
                space = "";
            }
        }
    }
