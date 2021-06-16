package src;

public class Contador{

	//Constructor por defecto
	public Contador(){		
	}

	//Constructor con parametros
	public Contador(int numero){
		System.out.println("\nEjercicio 1.");
		this.numero = numero;
		incremento(numero);
		decremento(numero);
		System.out.println("");
	}


	//Metodos para incrementar
	public void incremento(int numero){
			System.out.println("Incrementar desde 0 hasta " + numero);
			for(int i=0; i<=numero; i++){
				System.out.print(i + " ");
			}
	}

	//Metodo para decrementar

	public void decremento(int numero){
			System.out.println("\nDecrementar desde " + numero + " hasta 0");
			for(int i=numero; i>=0; i--){
				System.out.print(i + " ");
			}
	}


	//Metodos getters y setters
	public void setNumero(int numero){
		this.numero = numero;
	}


	public int getNumero(){
		return this.numero;
	}

	//Variables respestando ocultamiento de datos
	private int numero;
}
