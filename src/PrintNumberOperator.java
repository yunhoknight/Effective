import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

public class PrintNumberOperator {
    public static void main(String[] args) {
        // 각 숫자를 배열화
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // Iterrator 생성
        Iterator<Integer> it = list.iterator();

        // 리시트를 순회하며 값 출력
        while (it.hasNext()) {
            int num = it.next();
            System.out.println(num);
        }
    }
}
