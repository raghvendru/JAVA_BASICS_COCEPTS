package JAVA_CODE.SORTING;

import java.util.EnumMap;

enum Days{
    SUNDAY,MONDAY,TUESDAY,WEDNESDAY,THURSDAY,FRIDAY,SATURDAY;
}
public class EnumMapExample {
    public static void main(String[] args) {
        EnumMap<Days,String> en = new EnumMap<>(Days.class);
        en.put(Days.MONDAY,"gym");
        en.put(Days.TUESDAY,"study");
        for(Days d:Days.values()){
            System.out.println(d  + en.getOrDefault(d,"NO ACTIVITY"));
        }
    }

}
