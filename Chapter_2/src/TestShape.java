class Shape {
	public double area() {
		return 0;
	} // Implementacao padrao
	// other members
}

class Circle extends Shape {
	private int radius;

	public Circle(int r) {
		radius = r;
	}

	// outro contstrutor
	public double area() {
		return Math.PI * radius * radius;
	}
	// outras declaraçoes
}

class Square extends Shape {
	private int side;

	public Square(int a) {
		side = a;
	}

	public double area() {
		return side * side;
	}
	// outras declaraçoes
}

public class TestShape {
	public static void main(String[] args) {
		Shape shape1 = new Circle(10);
		System.out.println(shape1.area());
		Shape shape2 = new Square(10);
		System.out.println(shape2.area());
	}
}

//RESULTADO
//314.1592653589793
//100.0


