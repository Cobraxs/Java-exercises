package Biblioteca;

public class Revista extends Publicacion{
	
	private int numero;
	
	Revista(String codigo,String titulo,int a�oPublicacion,int numero){
		super(codigo,titulo,a�oPublicacion);
		this.numero=numero;
	
	};
	
	
	//METODOS DE OBJETO 
	
	public String  toStringObj() {
		
		return "[Codigo:"+this.codigo+"|Titulo:"+this.titulo+"|a�o de publicacion:"+this.a�oPublicacion+"|numero:"+this.numero+"]";
	}
	

}
