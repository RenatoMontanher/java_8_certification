package graphicshape;

public class Circle extends Shape {
	private int radius; // private field

	public void area() { // public method: acessivel em qualquer outro lugar
		// access to private field radius inside the class:
		System.out.println("area: " + 3.14 * radius * radius);
	}

	// método fillColor tem accesso default 
	void fillColor() {
		// acessando campo protected, na subclass:
		System.out.println("color: " + color);
	}
}
//para um método publico ser acessivel de qualquer lugar é necessário que a CLASSE 
//TAMBEM SEJA PÚBLICA, do contrário, a classe sendo acessivel como default e 
// o metodo so ficara disonivel para ser acessado no proprio pacote