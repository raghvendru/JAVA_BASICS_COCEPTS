package JAVA_CODE.SORTING;
import java.util.*;
import java.util.EnumSet;

enum Day{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class EnumSetExample{
    public static void main(String[] args) {
        EnumSet<Day> weekend = EnumSet.of(Day.SATURDAY,Day.SUNDAY);
        EnumSet<Day> weekDay = EnumSet.range(Day.MONDAY,Day.FRIDAY);
        EnumSet<Day> alldays = EnumSet.allOf(Day.class);
        System.out.println("Weekend Days: " + weekend);
        System.out.println("Weekdays: " + weekDay);
        System.out.println("All Days: " + alldays);    }
}
