package example.ParallelStream;

import java.util.Arrays;
import java.util.List;

public class ParallelStreamExample {
    public static void main(String[] args) {
        System.out.println("Normal Stream VS Parallel Stream");
        long strat=0;
        long end=0;
        //Normal Stream
        strat=System.currentTimeMillis();
        List<Integer> listOfNum= Arrays.asList(1,2,3,9,5,6,7,8,9,80,7,8);
        end=System.currentTimeMillis();
        listOfNum.stream().forEach(System.out::println);
        System.out.println("Time Taken By Normal Stream is "+(end-strat));

        System.out.println("........Parallel Stream......");
        strat=System.currentTimeMillis();
        listOfNum.parallelStream().forEach(System.out::println);
        end=System.currentTimeMillis();
        System.out.println("Time Taken By Parallel Stream is "+(end-strat));


    }
}
