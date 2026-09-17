//Private and protected are not allowed
public class Person {
    //Height, age, color, name, weight: instance variable

    double height;

    int age;

    String color;

    String name;

    double weight;

    //Constructors can have private, protected, or public modifiers
    Person() {
        //Default constructor can be empty
        height = 48;
        age = 18;
        color = "Black";
        name = "";
        weight = 140;

    }

    // Protected members are accessible within the same package.
    protected Person(double height, int age) {
        // Parameters are local variables to the constructor.
        this.height = height;
        this.age = age;
    }

    //overloaded constructor
    private Person(double height, int age, String color, String name, double weight) {
        // Parameters are local variables to the constructor.
        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }

    //Access, default return type, method Name, Parentheses, braces
    public Person Call_Private() {
        Person person3 = new Person(72, 70, "Blue", "Barack Obama", 170);
        return person3;
    }


}
