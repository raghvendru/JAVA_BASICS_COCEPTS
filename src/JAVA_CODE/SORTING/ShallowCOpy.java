package JAVA_CODE.SORTING;

public class ShallowCOpy {
    int x = 30 ;

    public static void main(String[] args) {
        ShallowCOpy obj = new ShallowCOpy();
        ShallowCOpy obj2 = obj;
        obj2.x = 6;
        System.out.println(obj.x);

    }
}
