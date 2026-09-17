//student class will inherit Person class
// How to inherit
// How many class can a class inherit: 1
//Student is the child class and Person is the parent class
// Student is the subclass and person is the super class

public class Student extends Person {
 // Attributes are inherited - not the private attributes
    // setters and getters are also inherited
 //methods are inherited - not the private methods
 // Constructors Are not inherited, but you can use the constructors

    int studentID;
    double gpa;

    public Student(String firstName, String lastName, int studentID) {}
        Student(){


        }


    }


