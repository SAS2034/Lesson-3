package One;

public class User {

    String lastName;
    String firstName;
    int age;

    @Override
    public String toString() {
        return "\"" + "LastName: " + lastName + ", " +
                "name: " + firstName + " - " +
                " age " + age + "\"";
    }

    public User(String lastName, String firstName, int age) {
        this.lastName = lastName;
        this.firstName = firstName;
        this.age = age;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}

