import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Stream;

public class PrintNumberOperator2 {
    public static void main(String[] args) {
        // 각 숫자를 배열화
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        // Iterrator 생성
        Stream<Integer> stream = list.stream();
        stream.forEach(System.out::print);
    }
}
