import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalInt;
import java.util.stream.Collectors;

/**
 * @author tatek on 9/21/2023
 */
public class Main {
    public static void main(String[] args) {
        //reduce method combine elements and give as one or none optional output
        int []array ={1,2,4,5,6,7,9,11,13,14,18,20};

        String []stringArray = {"Jai", "Naren", "Nidhi",
                "Nidhi", "Naren", "Nidhi"};

        int initial = 0;

        //how reduce method adds the stream elements
        //initial = initial + first -> 1
        //initial1 = initial + second -> 2
        //initial2 = initial1 + third -> 3
        //          .
        //          .
        //          .
        //initial12 = initial11 + twelve -> 110
        int reduce = Arrays.stream(array).reduce(initial, (first, next) -> first + next);

        List<String> collect = Arrays.stream(array).mapToObj(i -> String.valueOf(i)).map(i -> i+i).collect(Collectors.toList());

        List<String> collect1 = collect.stream().map(i -> i+i).collect(Collectors.toList());


        System.out.println(collect);
        System.out.println(collect1);
        System.out.println("The sum is: "+reduce); //The sum is: 110


    }
}