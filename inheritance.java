class Animal{
	void eat(){
		System.out.println("Animal is Eating");
	}
}

class Dog extends Animal{
	void bark(){
		System.out.println("Dog is barking");
	}
}

public class inheritance{
	public static void main(String args[]){
		Dog d = new Dog();

		d.bark();// Own method
		d.eat(); //inherited method
	}
}