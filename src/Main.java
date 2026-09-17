public class Main {
    public static void main(String[] args) {
        Person person1 = new Person();

//        Person person2 = new Person(72, 70, "Blue", "Barack Obama", 170);
//        System.out.println(person2.name);
        Person person2 = new Person(72, 70);
        System.out.println(person2.age);

        Person Person3 = person2.Call_Private();
        System.out.println();
    }
}