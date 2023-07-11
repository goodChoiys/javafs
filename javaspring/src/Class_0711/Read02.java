package Class_0711;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Read02 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("d:/out.txt"));
        while (true) {
            String line = br.readLine();
            if (line == null)
                break; // 더 이상 읽을 라인이 없을 경우 while 문을 빠져나간다.
            System.out.println(line);
        }
        br.close();
    }
}
