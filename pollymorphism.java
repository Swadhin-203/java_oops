class Shape{
	
	void draw(){
		System.out.println("Drawing a Shape");
	}
}

class Circle extends Shape{

	void draw(){
		System.out.println("Drawing a Circle");
	}
}

class Square extends Shape{

	void draw(){
		System.out.println("Drawing a Square");
	}
}

public class pollymorphism{
 public static void main(String[] args) {
		Shape s = new Circle();
		s.draw();

		Shape s1 = new Square();
		s1.draw();
	}
}