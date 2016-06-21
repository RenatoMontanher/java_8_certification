package graphicshape;

public class Circle extends Shape {
	private int radius; // private field

	public void area() { // public method: acessivel em qualquer outro lugar
		// access to private field radius inside the class:
		System.out.println("area: " + 3.14 * radius * radius);
	}

	// The fillColor method has default access
	void fillColor() {
		// access to protected field, in subclass:
		System.out.println("color: " + color);
	}
}
//para um m�todo publico ser acessivel de qualquer lugar � necess�rio que a CLASSE 
//TAMBEM SEJA P�BLICA, do contr�rio, a classe sendo acessivel como default e 
// o metodo so ficara disonivel para ser acessado no proprio pacote