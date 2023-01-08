import java.util.Arrays;
import java.util.List;

public class IntermediateOperationExample {
    public static void main(String[] args) {
        String[][] namesArray = new String[][]{{"박해커", "이자바"}, {"김코딩", "나박사"}};

        Arrays.stream(namesArray).flatMap(Arrays::stream).forEach(System.out::println);
    }
}
