import java.io.BufferedInputStream;
import java.io.FileInputStream;

public class FileInputStreamExample {
    public static void main(String[] args) {
        try {
            FileInputStream fileInput = new FileInputStream("codestates.txt");
            BufferedInputStream bufferedInput = new BufferedInputStream(fileInput);
            int i = 0;
            while ((i = bufferedInput.read()) != -1) { // fileInput.read()의 리턴값을 i에 저장한 후, 값이 -1인지 확인합니다.
                System.out.println((char)i);
            }
            fileInput.close();
        }
        catch (Exception e) {
            System.out.println(e);
        }
    }
}
