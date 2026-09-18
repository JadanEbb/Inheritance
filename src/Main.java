//https://github.com/JadanEbb/Inheritance.git

public class Main {
    static void main(String[] args) {
//        Person person1 = new Person();
//        Person person2 = new Person(72, 70, "Blue", "Barack Obama", 170);
//        System.out.println(person2.name);
//
//        Person person2 = new Person(72, 70);
//        System.out.println(person2.age);
//
//        Person Person3 = person2.Call_Private();
//
//        Student st1 = new Student();
//        st1.age = 20;
//        st1.gpa = 4.00;
//        System.out.println(st1.gpa);

        Instructor instructor1 = new Instructor("Avijoy", "Chakma", 28, 4);
        System.out.println(instructor1.name);
        System.out.println(instructor1.age);
        System.out.println(instructor1.assignments);
    }
}