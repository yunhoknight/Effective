public class Main {
    public static void main(String[] args) {

        MyFunctionalInterfaceExample example;

        example = (x, y) -> {
            int result = x + y;
            return result;
        };

        int result1 = example.accept(2, 5);
        System.out.println(result1);

        example = (x, y) -> {return x + y;};
        int result2 = example.accept(2, 5);
        System.out.println(result2);

        example = (x, y) -> x + y;
        int result3 = example.accept(2, 5);
        System.out.println(result3);

        example = (x, y) -> sum(x, y);
        int result4 = example.accept(2, 5);
        System.out.println(result4);
    }
    public static int sum(int x, int y) {
        return x + y;
    }
}
