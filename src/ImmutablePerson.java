import java.util.Date;

public final class ImmutablePerson {
    private final String name;
    private final int age;
    private final Date birthDate; // mutable object

    public ImmutablePerson(String name, int age, Date birthDate) {
        this.name = name;
        this.age = age;
        // Creating a defensive copy of the mutable Date object
        this.birthDate = new Date(birthDate.getTime());
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        // Returning a defensive copy of the mutable Date object
        return new Date(birthDate.getTime());
    }
}