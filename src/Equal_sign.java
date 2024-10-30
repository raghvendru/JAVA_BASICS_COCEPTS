public class Equal_sign {
    public static void main(String[] args) {
        int a = 5;
        int b = 5;
        System.out.println(a == b); // Output: true

        String s1 = new String("hello");
        String s2 = new String("hello");
        System.out.println(s1 == s2); // Output: false (different objects in memory)
        System.out.println(s1.equals(s2)); // Output: true (content is the same)


        Equal_sign obj1 =new Equal_sign();
        Equal_sign obj2 =new Equal_sign();
        System.out.println(obj1.equals(obj2));// Output: false (default behavior)
    }
}
