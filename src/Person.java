public class Person {
    //Height, age, color, name, weight: instance variable

    double height;

    int age;

    String color;

    String name;

    double weight;

    Person(){
        //Default constructor can be empty
        height = 48;
        age = 18;
        color = "Black";
        name = "";
        weight = 140;

    }
    //overloaded constructor
    Person(double height, int age, String color, String name, double weight) {
        // Parameters are local variables to the constructor.
        this.height = height;
        this.age = age;
        this.color = color;
        this.name = name;
        this.weight = weight;
    }



}
