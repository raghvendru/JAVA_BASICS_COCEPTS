public class Inheritance {
    // Base class: Animal
    class Animal {
        public void eat() {
            System.out.println("This animal eats food.");
        }
    }

    // Subclass: Dog inherits from Animal
    class Dog extends Animal {
        public void bark() {
            System.out.println("The dog barks.");
        }
    }

    // Main class to demonstrate inheritance
    public static class InheritanceExample {
        public static void main(String[] args) {
            Inheritance inheritance = new Inheritance();  // Creating an instance of the outer class

            Dog dog = inheritance.new Dog();  // Creating an instance of Dog
            dog.eat();  // inherited method
            dog.bark(); // method specific to Dog class
        }
    }
}
