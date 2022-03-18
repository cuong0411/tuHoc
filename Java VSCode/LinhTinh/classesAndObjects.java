class Person {
    String name;
    int age;

    void speak() {
        System.out.println("My name is " + name + " and I'm " + age + " years old");
    }

}

public class classesAndObjects {
    public static void main(String[] args) {

        //Create a Person object using Person class
        Person person1 = new Person();
        person1.name = "Topson";
        person1.age = 25;
        person1.speak();

        //Create a second Person object
        Person person2 = new Person();
        person2.name = "Jerax";
        person2.age = 26;
        person2.speak();

        
    }
}
