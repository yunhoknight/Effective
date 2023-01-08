import java.util.Arrays;

public class TerminalOperationExample {
    public static void main(String[] args) {
        int[] intArray = {1,2,3,4,5};

        // 카운팅
        long count = Arrays.stream(intArray).count();
        System.out.println("intArr의 전체 요서 개수 " + count);

        // 합계
        long sum = Arrays.stream(intArray).sum();
        System.out.println("intArr의 전체 요소 합 " + sum);

        // 평균
        double average = Arrays.stream(intArray).average().getAsDouble();
        System.out.println("IntArr의 전체 요소 평균 " + average);

        // 최대값
        int max = Arrays.stream(intArray).max().getAsInt();
        System.out.println("최대값 " + max);

        // 최소값
        int min = Arrays.stream(intArray).min().getAsInt();
        System.out.println("최소값 " + min);

        // 배열의 첫번쨰 요서
        int first = Arrays.stream(intArray).findFirst().getAsInt();
        System.out.println("IntArr의 전체 요소 평균 " + first);

    }
}
