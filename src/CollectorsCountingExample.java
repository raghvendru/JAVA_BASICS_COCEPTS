import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsCountingExample {
    public static void main(String[] args) {
        List<String> al = Arrays.asList("raghu","ab","","cd","","ef");
        List<Integer> numbers = Arrays.asList(3, 5, 8, 1, 9, 12, 4);


        long count = al.stream().filter(string->!string.isEmpty()).collect(Collectors.counting());
        System.out.println(count);//4

        //collect non empty string to list
        List<String> filtered = al.stream().filter(string->!string.isEmpty()).collect(Collectors.toList());
        System.out.println(filtered);//[raghu, ab, cd, ef]


        // Join non-empty strings with a comma
        String mergedString = al.stream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.joining(", "));

        System.out.println("Merged String: " + mergedString);// Merged String: raghu, ab, cd, ef


        // Group strings by their length
        Map<Integer, List<String>> groupedByLength = al.stream().collect(Collectors.groupingBy(String::length));
        System.out.println(groupedByLength);//{0=[, ], 2=[ab, cd, ef], 5=[raghu]}


        // Partition strings into non-empty and empty
        Map<Boolean, List<String>> partitionedByEmpty = al.stream().collect(Collectors.partitioningBy(string->string.isEmpty()));
        System.out.println(partitionedByEmpty);//{false=[raghu, ab, cd, ef], true=[, ]}

        // Get summary statistics of the numbers
        IntSummaryStatistics stats = numbers.stream()
                .collect(Collectors.summarizingInt(Integer::intValue));

        System.out.println("Summary Statistics: " + stats);//Summary Statistics: IntSummaryStatistics{count=7, sum=42, min=1, average=6.000000, max=12}


        // Filter empty strings using parallel stream
        List<String> filtered1 = al.parallelStream()
                .filter(string -> !string.isEmpty())
                .collect(Collectors.toList());

        System.out.println("Filtered List (Parallel Stream): " + filtered1);//Filtered List (Parallel Stream): [raghu, ab, cd, ef]

        // Map function example
        List<Integer> lengths = al.stream()
                .filter(string -> !string.isEmpty())
                .map(String::length)
                .collect(Collectors.toList());

        System.out.println("Lengths of non-empty strings: " + lengths);//Lengths of non-empty strings: [5, 2, 2, 2]


        int sumOfSquare = numbers.stream().filter(n->n%2==0).mapToInt(n->n*n).sum();
        System.out.println(sumOfSquare);//224

        //uppercase
        List<String> upperCase = al.stream().map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(upperCase);//[RAGHU, AB, , CD, , EF]

        //flat map
        List<List<Integer>> nested = Arrays.asList(
                Arrays.asList(1,2,3),
                Arrays.asList(4,5,6),
                Arrays.asList(7,8,9)
        );

        List<Integer> flat = nested.stream().flatMap(List::stream).map(n->n*2).collect(Collectors.toList());
        System.out.println(flat);//[2, 4, 6, 8, 10, 12, 14, 16, 18]



        List<Integer> numbers1 = Arrays.asList(3, 5, 8, 1, 9, 12, 4);

//64
//144
//16
//[64, 144, 16]
        List<Integer> squareNum = numbers1.stream().filter(n->n%2==0).map(n->n*n).distinct().peek(System.out::println).collect(Collectors.toList());
        System.out.println(squareNum);//peek-->peek into stream(debugg),distinct-->rem duplicates snd collect res into list





    }
}
