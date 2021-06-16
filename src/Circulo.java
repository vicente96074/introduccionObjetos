package src;

public class Circulo{

	//Metodo constructor	
	public Circulo(int radio){
		System.out.println("\n\nEjercicio 3.");
		this.radio = radio;
		System.out.println("Radio del circulo es: "+radio);
		iniciarComponentes();
	}

	private void iniciarComponentes(){
		calcularArea();
		calcularPerimetro();
	}

	private void calcularArea(){
		double area = radio*radio*PI;
		System.out.println("EL area es: "+area);
	}

	private void calcularPerimetro(){
		double perimetro = 2*PI*radio;
		System.out.println("EL perimetro es: "+perimetro);
	}

	public void setRadio(int radio){
		this.radio = radio;
	}

	public int getRadio(){
		return this.radio;
	}

	private int radio;
	public static final double PI = 3.14159265;
}