import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));    

            StringTokenizer st  = new StringTokenizer(br.readLine(), " "); // �Է°� ���� �������� ����

            int N = Integer.parseInt(st.nextToken());
            int X = Integer.parseInt(st.nextToken());

            st  = new StringTokenizer(br.readLine(), " ");
            // for ���� �Է°� ���� �������� ����

            for (int i = 0; i < N; i++) {
                int num = Integer.parseInt(st.nextToken());
                if(num < X) bw.write(num + " ");
            }
            br.close();
            bw.flush();
            bw.close();
        }
    }


/* using arr
import java.util.Scanner;
 
public class Main {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
 
		int N = in.nextInt();
		int X = in.nextInt();
		int arr[] = new int[N];
        
		for (int i = 0; i < N; i++) {
			arr[i] = in.nextInt();
		}
 
		in.close();
        
		for (int i = 0; i < N; i++) {
			if (arr[i] < X) {
				System.out.print(arr[i] + " ");
			}
		}
	}
} */