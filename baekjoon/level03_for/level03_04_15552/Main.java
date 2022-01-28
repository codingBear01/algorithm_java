import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
            BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
            
            int T = Integer.parseInt(br.readLine());
            
            StringTokenizer st;
            // StringTokenizer를 선언한 이유는,
            // 요구사항이 입력받을 때 한줄로 받도록 되어있기 때문이다.
            // split처럼 사용할수있다.
            
            for (int i = 0; i < T; i++) {
                st = new StringTokenizer(br.readLine(), " ");
                
                int A = Integer.parseInt(st.nextToken());
                int B = Integer.parseInt(st.nextToken());
                
                bw.write(A + B + "\n");
                // 개행 시켜주는 문자열인 \n을 더해주면,
                // A+B는 자동으로 String으로 바뀐다.
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

/* BufferdReader& BufferdWriter 를 이용한 input 연습 -> 성능 더 좋아짐
----- BufferedReader에도 단점
1. IOException의 예외처리가 필수적이다.
2. 입력받은 모든 데이터가 String으로 반환된다.
3. 줄마다 입력받아서, 따로 split하여 데이터를 처리해주어야 한다.
4. 숫자형식으로 받기 위해서는 형변환이 필요하다.

----- coding 작동 흐름
1. import는 java.io.*로 한다. (Scanner는 java.util 클래스이다.)
2. main함수 우측에 throws IOException을 통해 예외를 처리한다. (메소드 선언부에 throws를 명시하면, 해당 메소드 내에서 exception이 발생하는 경우 해당 메소드를 호출한 곳에서 예외가 발생한다.)
3. BufferedReader, BufferedWriter를 선언한다.
4. n을 입력받고, n만큼 loop를 돈다.
4-1. 해당 줄 전체를 String으로 입력받아, 스페이스로 구분하여 형변환하여 덧셈을 수행한다.
5. BufferedWriter에 써준다.
6. Buffer를 비워준다.
*여기서, bw.write()는 버퍼에 쓰는것이지, 화면에 출력되는 것이 아니다. 화면에 출력하는 역할은 bw.flush()가 수행한다. bw.flush()는 출력이 필요할 때 한 번만 수행해주면 된다. 만약 for문 안에 bw.flush()를 쓰면, 버퍼에 쓰고 바로 출력하므로 System.out.print와 다를바가 없다.
*/

