import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class IntermediateOperationExample {
    public static void main(String[] args) {
        List<String> animals = Arrays.asList("Tiger", "Lion", "Monkey", "Duck", "Horse", "Cow");

        animals.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
    }
}
