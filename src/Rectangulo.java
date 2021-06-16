package src;

public class Rectangulo{

	//Metodo constructor	
	public Rectangulo(int base, int altura){
		System.out.println("\n\nEjercicio 4.");
		this.base = base;
		this.altura = altura;
		System.out.println("La base del rectangulo es: "+base);
		System.out.println("La altura del rectangulo es: "+altura);
		iniciarComponentes();
	}

	private void iniciarComponentes(){
		calcularArea();
		calcularPerimetro();
	}

	private void calcularArea(){
		int area = base*altura;
		System.out.println("EL area es: "+area);
	}

	private void calcularPerimetro(){
		int perimetro = 2*base + 2*altura;
		System.out.println("EL perimetro es: "+perimetro);
	}

	public void setBase(int base){
		this.base = base;
	}

	public int getBase(){
		return this.base;
	}

	public void setAltura(int altura){
		this.altura = altura;
	}

	public int getAltura(){
		return this.altura;
	}

	//Encapsulamiento
	private int base;
	private int altura;
}