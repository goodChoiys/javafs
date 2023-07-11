package Class_0711;

import java.io.IOException;
import java.io.InputStream;

public class Sample03 {
    public static void main(String[] args) throws IOException {
        InputStream in = System.in;

        // 배열 형태로 변경
        byte[] a = new byte[3];
        in.read(a);

        System.out.println(a[0]);
        System.out.println(a[1]);
        System.out.println(a[2]);
    }
}
