package classesAndObjects;

class Person {
	//Classes can contain
	
	//1.data (state of an object) called instance variables
	//2.subroutines (methods)
	
	//Instance Variables
	String name;
	int age;
}


public class Application {

	public static void main(String[] args) {
		
		Person person1 = new Person();
		person1.name = "Ana Pham";
		person1.age = 23;
		System.out.println(person1.name + " is " + person1.age + " years old.");
		
		Person person2 = new Person();
		

	}

}
