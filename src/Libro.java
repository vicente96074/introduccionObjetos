package src;

public class Libro{

	//Constructor por defecto
	public Libro(){
	}

	//Constructor con parametros
	public Libro(boolean estadoPrestamo, String nombreDelLibro, int idLibro){
		System.out.println("\n\nEjercicio 6.");
		this.estadoPrestamo = estadoPrestamo;
		this.nombreDelLibro = nombreDelLibro;
		this.idLibro = idLibro;
		mostrarInformacion();
	}

	public void prestamoLibro(){
		estadoPrestamo = true;
		System.out.println("El libro ha sido prestado");
	}

	public void devolucionLibro(){
		estadoPrestamo = false;
		System.out.println("El libro ha sido devuelto");

	}

	public void mostrarInformacion(){
		System.out.printf("\nNombre del libro: %s,  está prestado el libro: %b,  id del libro: %d\n", nombreDelLibro, estadoPrestamo, idLibro);
	}

	public void setEstadoPrestamo(boolean estadoPrestamo){
		this.estadoPrestamo = estadoPrestamo;
	}

	public boolean getEstadoPrestamo(){
		return estadoPrestamo;
	}

	public void setNombreDelLibro(){
		this.nombreDelLibro = nombreDelLibro;
	}

	public String getNombreDelLibri(){
		return this.nombreDelLibro;
	}

	public int getIdLibro(){
		return idLibro;
	}


	//Variables ocultas
	private boolean estadoPrestamo;
	private String nombreDelLibro;
	private int idLibro;
}