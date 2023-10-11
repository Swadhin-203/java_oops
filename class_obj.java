class Car{
	
	// creating the instance varible for the Car class
	String model;
	int year;

	// method
	void display(){
		System.out.println("Model: "+model+" Year: "+year);
	}
}

public class class_obj{
	public static void main(String args[])
	{
		//instantiated and created the reference of the car class
		Car c = new Car();

		c.model="Audi";
		c.year=2025;
		c.display();
	}
}