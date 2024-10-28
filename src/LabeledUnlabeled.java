public class LabeledUnlabeled {
    public static void main(String[] args) {
        //unlabelled
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 3; j++) {
                if (j == 2) {
                    System.out.println(j);
                    break; // Breaks out of the inner loop
                }
            }
            System.out.println(i);
        }

        System.out.println("Outer Loop");

        //labelled
        outerloop:
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 5; j++) {
                System.out.println(i);
                System.out.println(j);
                if (i == 1 && j == 2) {
                    break outerloop; // Breaks out of the outer loop
                }
            }
        }
    }
}

