package src;

public class Cuadrado{

	//Metodo constructor	
	public Cuadrado(int lado){
		System.out.println("\n\nEjercicio 2.");
		this.lado = lado;
		System.out.println("Lado del cuadrado es: "+lado);
		iniciarComponentes();
	}

	private void iniciarComponentes(){
		calcularArea();
		calcularPerimetro();
	}

	private void calcularArea(){
		int area = lado*lado;
		System.out.println("EL area es: "+area);
	}

	private void calcularPerimetro(){
		int perimetro = lado*4;
		System.out.println("EL perimetro es: "+perimetro);
	}

	public void setLado(int lado){
		this.lado = lado;
	}

	public int getLado(){
		return this.lado;
	}

	private int lado;
}