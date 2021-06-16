package src;
import src.*;	

public class Principal{

	//Metodo main
	public static void main(String[] args){

		System.out.println("Ejercicio 8, crear a la clase principal.\n");

		//Instanciamos un objeto(crear objeto nuevo)
		//De la clase Contador
		Contador contador = new Contador(10);

		//De la clase Cuadrado
		Cuadrado cuadrado = new Cuadrado(5);

		//De la clase Circulo
		Circulo circulo = new Circulo(5);

		//De la clase Rectangulo
		Rectangulo rectangulo = new Rectangulo(4,3);

		//De la clase ContadorUno
		ContadorUno contadorUno = new ContadorUno(10);
		
		//De la clase libro
		Libro libro = new Libro(false, "Lord of the rings", 12345);	

		//De la clase fraccion
		Fraccion fraccion = new Fraccion(5.2,3.4,8.1,7.0);
	}
}