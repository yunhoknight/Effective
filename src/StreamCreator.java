import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamCreator {
    public static void main(String[] args) {
        IntStream ints = new Random().ints(1);

        ints.forEach((System.out::println));
    }
}
