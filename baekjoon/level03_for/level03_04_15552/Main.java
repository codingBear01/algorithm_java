import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            int T = Integer.parseInt(br.readLine());
            
            StringTokenizer st;
            // StringTokenizer�� ������ ������,
            // �䱸������ �Է¹��� �� ���ٷ� �޵��� �Ǿ��ֱ� �����̴�.
            // splitó�� ����Ҽ��ִ�.
            
            for (int i = 0; i < T; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                
                bw.write(A + B + "\n");
                // ���� �����ִ� ���ڿ��� \n�� �����ָ�,
                // A+B�� �ڵ����� String���� �ٲ��.
            }
            bw.flush();
            bw.close();
            br.close();
    }
}

/*  without StringTokenizer

import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException{
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));    
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(bf.readLine());

        for(int i = 0; i < T; ++i){
            String s = bf.readLine();
            int a = Integer.parseInt(s.split(" ")[0]);
            int b = Integer.parseInt(s.split(" ")[1]);
            bw.write(a + b + "\n");
        }
        bw.flush();
    }
} */

/* BufferdReader& BufferdWriter �� �̿��� input ���� -> ���� �� ������
----- BufferedReader���� ����
1. IOException�� ����ó���� �ʼ����̴�.
2. �Է¹��� ��� �����Ͱ� String���� ��ȯ�ȴ�.
3. �ٸ��� �Է¹޾Ƽ�, ���� split�Ͽ� �����͸� ó�����־�� �Ѵ�.
4. ������������ �ޱ� ���ؼ��� ����ȯ�� �ʿ��ϴ�.

----- coding �۵� �帧
1. import�� java.io.*�� �Ѵ�. (Scanner�� java.util Ŭ�����̴�.)
2. main�Լ� ������ throws IOException�� ���� ���ܸ� ó���Ѵ�. (�޼ҵ� ����ο� throws�� ����ϸ�, �ش� �޼ҵ� ������ exception�� �߻��ϴ� ��� �ش� �޼ҵ带 ȣ���� ������ ���ܰ� �߻��Ѵ�.)
3. BufferedReader, BufferedWriter�� �����Ѵ�.
4. n�� �Է¹ް�, n��ŭ loop�� ����.
4-1. �ش� �� ��ü�� String���� �Է¹޾�, �����̽��� �����Ͽ� ����ȯ�Ͽ� ������ �����Ѵ�.
5. BufferedWriter�� ���ش�.
6. Buffer�� ����ش�.
*���⼭, bw.write()�� ���ۿ� ���°�����, ȭ�鿡 ��µǴ� ���� �ƴϴ�. ȭ�鿡 ����ϴ� ������ bw.flush()�� �����Ѵ�. bw.flush()�� ����� �ʿ��� �� �� ���� �������ָ� �ȴ�. ���� for�� �ȿ� bw.flush()�� ����, ���ۿ� ���� �ٷ� ����ϹǷ� System.out.print�� �ٸ��ٰ� ����.
*/

