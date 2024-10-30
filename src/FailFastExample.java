import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class FailFastExample {
    public void failFast() {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1, 2, 3));
        Iterator<Integer> iterator = numbers.iterator();
        while (iterator.hasNext()) {
            Integer number = iterator.next();
            // Simply print the current number without modifying the list
            System.out.println("Current number: " + number);
            numbers.add(50); // This line will throw error

        }
    }

    public static void main(String[] args) {
        new FailFastExample().failFast();
    }
}
