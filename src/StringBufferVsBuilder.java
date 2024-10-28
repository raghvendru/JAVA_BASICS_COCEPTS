public class StringBufferVsBuilder {
    public static void main(String[] args) {
        // String Example
        String str = "Hello";
        System.out.println("Original String: " + str);

        // Concatenating a new string to the original string
        str = str + " World";
        System.out.println("Modified String (using String): " + str);

        // StringBuffer Example
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println("Original StringBuffer: " + stringBuffer);

        // Appending a new string to the original StringBuffer
        stringBuffer.append(" World");
        System.out.println("Modified StringBuffer: " + stringBuffer);

        stringBuffer.insert(0,"hi ");
        System.out.println("Modified StringBuffer: " + stringBuffer);



        // StringBuilder Example
        StringBuilder stringBuilder = new StringBuilder("Hello");
        System.out.println("Original StringBuilder: " + stringBuilder);

        // Appending a new string to the original StringBuilder
        stringBuilder.append(" World");
        System.out.println("Modified StringBuilder: " + stringBuilder);

        String reversed_sBuilder = new StringBuilder("raghavendra").reverse().toString();
        System.out.println(reversed_sBuilder);
        String reversed_sBuffer = new StringBuffer("raghavendra").reverse().toString();
        System.out.println(reversed_sBuffer);

        String formattedString = String.format("Hello, %s! Welcome to %s.", "Friend", "raghavendra.com");
        System.out.println(formattedString); //Hello, Friend! Welcome to raghavendra.com.
    }
}
