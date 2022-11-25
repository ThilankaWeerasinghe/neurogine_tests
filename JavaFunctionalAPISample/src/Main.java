import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
// this file is created only for demonstrating the answers for question and have not followed proper practices
        String var1 = "i like dc movies";

        System.out.println("Array as Capital letters and joined with comma : "+Arrays.asList(var1.split(" ")).stream().map(x -> x.toUpperCase()).collect(Collectors.joining(",")));

        List<String> lst = Arrays.asList("ab","ac","ddd","","qsd","ae","","","xe","");

        System.out.println("Number of array elements starts with 'a' : "+lst.stream().filter(x -> x.startsWith("a")).count());
        System.out.println("Number of array elements which is empty : " + lst.stream().filter(x -> x.length()==0).count());

    }
}