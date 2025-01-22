package example.stramApi;

import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

public class intermediateOpertaionFirst {
    public static void main(String[] args) {

        List<Integer> listOfNum= Arrays.asList(1,2,34,56,9,0,7,6);
        listOfNum.stream().filter(x-> x %2 ==0).collect(Collectors.toList());
        System.out.println("listoumnum"+ listOfNum);


    }
}
