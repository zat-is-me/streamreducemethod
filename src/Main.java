import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalInt;

/**
 * @author tatek on 9/21/2023
 */
public class Main {
    public static void main(String[] args) {
        //reduce method combine elements and give as one or none optional output
        int []array ={1,2,4,5,6,7,9,11,13,14,18,20};

        int initial = 0;

        //how reduce method adds the element as the following
        //initial = initial + first -> 1
        //initial1 = initial + second -> 2
        //initial2 = initial1 + third -> 3
        //          .
        //          .
        //          .
        //initial12 = initial11 + twelve -> 110
        int reduce = Arrays.stream(array).reduce(initial, (first, next) -> first + next);

        System.out.println("The sum is: "+reduce); //The sum is: 110


    }
}