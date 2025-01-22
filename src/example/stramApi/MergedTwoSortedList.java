package example.stramApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MergedTwoSortedList {
    public static void main(String[] args) {

        List<Integer> listFirst= Arrays.asList(1,2,3,4);
        List<Integer> listSecond=Arrays.asList(5,6,7,8,9,10);

        List<Integer> newList=Stream
                .concat(listFirst.stream(),listSecond.stream()).
                collect(Collectors.toList());

        newList.stream().forEach(a-> System.out.println(a));
    }
}
