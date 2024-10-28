public class OverRideing {
    class Animal {
        void sound() {
            System.out.println("Animal makes a sound");
        }
    }

    class Dog extends Animal {
        @Override
        void sound() {
            System.out.println("Dog barks");
        }
    }

    public static class Main {
        public static void main(String[] args) {
            OverRideing over = new OverRideing();
            OverRideing.Animal animal = over.new Dog();  // Upcasting
            animal.sound();             // Calls Dog's overridden method
        }
    }

}
