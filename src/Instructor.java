public class Instructor extends Person {

    int assignments;

    public Instructor(String firstName, String lastName, int age, int assignments) {
        this.name = firstName + " " + lastName;
        this.age = age;
        this.assignments = assignments;
    }

    Instructor() {
    }
}