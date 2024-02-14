package Biblioteca;

public class Libro extends Publicacion {
	
	private boolean prestado;
	private String PersonaPrestado;
	
	Libro(String codigo,String titulo,int a�oPublicacion){
		super(codigo,titulo,a�oPublicacion);
		prestado=false;
	};
	
	//METODOS DE OBJETO 
	
	public String  toStringObj() {
		
		return "[Codigo:"+this.codigo+"|Titulo:"+this.titulo+"|a�o de publicacion:"+this.a�oPublicacion+"|Prestado:"+this.prestado+"|Persona que se le prest�:"+this.PersonaPrestado+"]";
	}

	public void prestar(String Persona){
		prestado=true;
		PersonaPrestado=Persona;
		System.out.println("El libro "+this.titulo +" se ha prestado a "+PersonaPrestado);
		
	}
	public void devolver(){
		prestado=false;
		System.out.println("El libro "+this.titulo+"  ha sido   devuelto por: "+PersonaPrestado);
		PersonaPrestado="";
		
	}
}
