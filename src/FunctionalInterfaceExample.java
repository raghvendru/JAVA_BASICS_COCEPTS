@FunctionalInterface
interface MathOperation{
    int operation(int a,int b);
}



public class FunctionalInterfaceExample {
    public static void main(String[] args) {

        MathOperation add = (a,b)->a+b;
        System.out.println(operate(5,3,add));

    }

    private static int operate(int a,int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }
}
