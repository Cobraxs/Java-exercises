package Biblioteca;

public class Revista extends Publicacion{
	
	private int numero;
	
	Revista(String codigo,String titulo,int aņoPublicacion,int numero){
		super(codigo,titulo,aņoPublicacion);
		this.numero=numero;
	
	};
	
	
	//METODOS DE OBJETO 
	
	public String  toStringObj() {
		
		return "[Codigo:"+this.codigo+"|Titulo:"+this.titulo+"|aņo de publicacion:"+this.aņoPublicacion+"|numero:"+this.numero+"]";
	}
	

}
