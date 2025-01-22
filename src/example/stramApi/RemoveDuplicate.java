package example.stramApi;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class RemoveDuplicate {
    public static void main(String[] args) {

        List<Integer> numList= Arrays.asList(1,2,3,4,4,5,6,7,8);
        System.out.println("Before Converting "+numList);
        List<Integer>newList=numList.stream().distinct().collect(Collectors.toList());
        System.out.println("After Removing Duplicate "+newList);
    }
}
