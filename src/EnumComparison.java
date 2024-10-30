       public class EnumComparison {
        public enum Color {
            RED, GREEN, BLUE;
        }
        public static void main(String[] args) {
            Color color1 = Color.RED;
            Color color2 = Color.RED;
            Color color3 = Color.GREEN;

            if (color1 == color2) {
                System.out.println("color1 and color2 are the same");
            } else {
                System.out.println("color1 and color2 are different");
            }

            if (color1 == color3) {
                System.out.println("color1 and color3 are the same");
            } else {
                System.out.println("color1 and color3 are different");
            }
            if (color1.equals(color2)) {
                System.out.println("color1 and color2 are the same");
            } else {
                System.out.println("color1 and color2 are different");
            }

            if (color1.equals(color3)) {
                System.out.println("color1 and color3 are the same");
            } else {
                System.out.println("color1 and color3 are different");
            }
        }
    }
// Output
// color1 and color2 are the same
// color1 and color3 are different

