package example.lambda;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class lambdaExpComparatorList {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(10);
        list.add(5);
        list.add(6);
        list.add(3);
        list.add(1);

        System.out.println("Unsorted List Elements :"+list);
        // comparing the given list using comprator

        Collections.sort(list,(a,b)-> a-b);//use of lambda exxpression

        System.out.println("Sorted List Elements :"+list);
    }
}
