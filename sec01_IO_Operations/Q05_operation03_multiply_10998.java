// https://www.acmicpc.net/problem/10998

package sec01_IO_Operations;


import java.util.*;
import java.io.*;
public class Q05_operation03_multiply_10998 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        
        StringTokenizer st = new StringTokenizer(str, " ");
        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        System.out.println(A*B);

    }
}
