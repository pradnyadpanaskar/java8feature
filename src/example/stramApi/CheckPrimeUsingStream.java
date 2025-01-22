package example.stramApi;

import java.util.Arrays;
import java.util.List;


public class CheckPrimeUsingStream {

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(2, 4, 6, 8, 10, 11, 12, 56, 14, 67);
        boolean containsPrime = numbers.stream()
                .anyMatch(CheckPrimeUsingStream::isPrime);
        System.out.println("List contains prime number: " + containsPrime);
    }
    private static boolean isPrime(int number) {
        if (number <= 1) return false; // 0 and 1 are not prime
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
}
