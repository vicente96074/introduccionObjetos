package src;

public class ContadorUno{

	//Constructor por defecto
	public ContadorUno(){		
	}

	//Constructor con parametros
	public ContadorUno(int contador){
		System.out.println("\n\nEjercicio 5.");
		this.contador = contador;
		incremento(contador);
		decremento(contador);
		System.out.println("");
	}


	//Metodos para incrementar
	public void incremento(int contador){
			System.out.println("Incrementar desde 0 hasta " + contador);
			for(int i=0; i<=contador; i++){
				System.out.print(i + " ");
			}
	}

	//Metodo para decrementar

	public void decremento(int contador){
			System.out.println("\nDecrementar desde " + contador + " hasta 0");
			for(int i=contador; i>=0; i--){
				System.out.print(i + " ");
			}
	}


	//Metodos getters y setters
	public void setContador(int contador){
		this.contador = contador;
	}


	public int getContador(){
		return this.contador;
	}

	//Variables respestando ocultamiento de datos
	private int contador;
}