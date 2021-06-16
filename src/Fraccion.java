package src;
public class Fraccion{
	public Fraccion(double numerador1, double denominador1, double numerador2, double denominador2){
		System.out.println("\n\nEjercicio 7.");
		this.numerador1 = numerador1;
		this.denominador1 = denominador1;
		this.numerador2 = numerador2;
		this.denominador2 = denominador2;
		iniciarComponentes();
	}

	public void iniciarComponentes(){
		sumar();
		restar();
		dividir();
		multiplicar();
	}

	public void sumar(){
		System.out.printf("Sumar %f/%f + %f/%f\n", numerador1, denominador1, numerador2, denominador2);
		double suma = (numerador1/denominador1) + (numerador2/denominador2);
		System.out.println("La suma es: "+suma);
	}

	public void restar(){
		System.out.printf("\nRestar %f/%f - %f/%f\n", numerador1, denominador1, numerador2, denominador2);
		double resta = (numerador1/denominador1) - (numerador2/denominador2);
		System.out.println("La resta es: "+resta);

	}

	public void dividir(){
		System.out.printf("\nDivir %f/%f  / %f/%f\n", numerador1, denominador1, numerador2, denominador2);
		double division = (numerador1/denominador1)/(numerador2/denominador2);
		System.out.println("La division es: "+division);
	}


	public void multiplicar(){
		System.out.printf("\nMultiplicar %f/%f * %f/%f\n", numerador1, denominador1, numerador2, denominador2);
		double multiplicacion = (numerador1/denominador1)*(numerador2/denominador2);
		System.out.println("La multiplicacion es: "+multiplicacion);
	}

	public void setNumerador1(double numerador1){
		this.numerador1 = numerador1;
	}

	public double getNumerador1(){
		return this.numerador1;
	}

	public void setDenominador1(double denominador1){
		this.denominador1 = denominador1;
	}

	public double getDenominador1(){
		return this.denominador1;
	}

	public void setNumerador2(double numerador2){
		this.numerador2 = numerador2;
	}

	public double getNumerador2(){
		return this.numerador1+2;
	}

	public void setDenominador2(double denominador2){
		this.denominador2 = denominador2;
	}

	public double getDenominador2(){
		return this.denominador2;
	}

	//Variables globales
	double numerador1;
	double denominador1;
	double numerador2;
	double denominador2;
}