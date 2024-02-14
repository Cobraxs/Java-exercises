package Biblioteca;

public class Libro extends Publicacion {
	
	private boolean prestado;
	private String PersonaPrestado;
	
	Libro(String codigo,String titulo,int añoPublicacion){
		super(codigo,titulo,añoPublicacion);
		prestado=false;
	};
	
	//METODOS DE OBJETO 
	
	public String  toStringObj() {
		
		return "[Codigo:"+this.codigo+"|Titulo:"+this.titulo+"|año de publicacion:"+this.añoPublicacion+"|Prestado:"+this.prestado+"|Persona que se le prestó:"+this.PersonaPrestado+"]";
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
