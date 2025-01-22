package example.lambda;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class ExamplesOfPredicate {

    public static void main(String[] args) {
        Predicate<Integer> predict = x -> {
            for (int i = 2; i < Math.sqrt(x); i++) {
                if (x % i == 0) {
                    return false;
                }
            }

            return true;
        };

        if (predict.test(3)) {
            System.out.println("The given number is prime number");
        } else {
            System.out.println("The given number is not prime number");
        }


    }
}
