package Biblioteca;

public class main {

	public static void main(String[] args) {
	
		Libro Libro1= new Libro("22323D","La biblioteca de la medianoche",2003);
		Libro1.prestar("Rodrigo");
		System.out.println(Libro1.toStringObj());
		Libro1.devolver();
		System.out.println(Libro1.toStringObj());
		
		
		
		
		Revista Revista1= new Revista("24345F","Let's go to the  milky way-National Geographic",2023,2035);
		System.out.println(Revista1.toStringObj());
	}

}
