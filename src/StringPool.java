public class StringPool {

    public static void main(String[] args) {
        // Creating a string object using the new keyword
        // This creates a new object in the heap memory
        String str1 = new String("Hello");

        // Creating another string object with the same value
        // This also creates a new object in the heap memory
        String str2 = new String("Hello");

        // Checking if str1 and str2 reference the same object
        // They are not the same object because each call to new creates a new object
        System.out.println("str1 == str2: " + (str1 == str2)); // Output: false

        // Creating a string object without using the new keyword
        // This checks the string pool and creates a new object only if the string is not already present
        String str3 = "Hello";

        // Checking if str1 and str3 reference the same object
        // They are not the same object because str3 is created in the string pool
        System.out.println("str1 == str3: " + (str1 == str3)); // Output: false
    }
}