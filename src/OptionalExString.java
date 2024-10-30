import java.util.Optional;

public class OptionalExString {
    public static void main(String[] args) {
        String name = "RAGH";
       // Optional<String> op = Optional.ofNullable(name);
        Optional<String> op = Optional.empty();
        //System.out.println(name);
        op.ifPresent(System.out::println);


    }
}
