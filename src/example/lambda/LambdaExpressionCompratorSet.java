package example.lambda;

import java.util.Set;
import java.util.TreeSet;

public class LambdaExpressionCompratorSet {
    public static void main(String[] args) {

        Set<Integer> set= new TreeSet<>();
        set.add(1);
        set.add(2);
        set.add(3);

        System.out.println("unsorted set1 elements :"+set);
        Set<Integer> set1 = new TreeSet<>((a, b)-> b-a);
        set1.add(1);
        set1.add(2);
        set1.add(3);

        System.out.println("sorted set1 elements :"+ set1);
    }
}
