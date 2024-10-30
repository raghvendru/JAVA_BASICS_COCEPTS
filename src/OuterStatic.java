public class OuterStatic {
    private static int staticOuterField = 20;

    static class StaticNestedClass {
        void display() {
            System.out.println("Static outer field: " + staticOuterField);
        }
    }

    public static void main(String[] args) {
        OuterStatic.StaticNestedClass nested = new OuterStatic.StaticNestedClass();
        nested.display(); // Output: Static outer field: 20
    }
}