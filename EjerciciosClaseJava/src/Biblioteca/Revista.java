package Biblioteca;

public class Revista extends Publicacion{
	
	private int numero;
	
	Revista(String codigo,String titulo,int añoPublicacion,int numero){
		super(codigo,titulo,añoPublicacion);
		this.numero=numero;
	
	};
	
	
	//METODOS DE OBJETO 
	
	public String  toStringObj() {
		
		return "[Codigo:"+this.codigo+"|Titulo:"+this.titulo+"|año de publicacion:"+this.añoPublicacion+"|numero:"+this.numero+"]";
	}
	

}
