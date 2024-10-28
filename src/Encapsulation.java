public class Encapsulation {

    // Private data members
    private String name;
    private int age;

    // Constructor
    public Encapsulation(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Public method to access private data
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0) {
            this.age = age;
        }
    }


    public static void main(String[] args) {

        //Think of a capsule as a person.
        // The person's name and age are private information,
        // and they have methods to get or update this information safely.
        Encapsulation person = new Encapsulation("John", 30);
        System.out.println("Name: " + person.getName());
        System.out.println("Age: " + person.getAge());

        person.setAge(35); // updating age
        System.out.println("Updated Age: " + person.getAge());

    }
}


