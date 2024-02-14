package Biblioteca;

public class Publicacion {
	
	protected String codigo;
	protected String titulo;
	protected int a�oPublicacion;

	
	Publicacion(String codigo,String titulo,int a�oPublicacion){
		
		this.codigo=codigo;
		this.titulo=titulo;
		this.a�oPublicacion=a�oPublicacion;
	};
	
	//GETTERS  
	
	public String GetCodigo() {
		return this.codigo;
	}
	public String GetTitulo() {
		return this.titulo;
	}
	public int GetA�oPublicacion() {
		
		return this.a�oPublicacion;
	}
	
	//SETTERS
	
	public void SetCodigo(String codigo) {
		
		this.codigo=codigo;
	}
	public void SetTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void SetA�oPublicacion(int a�o) {
		this.a�oPublicacion=a�o;
	}
	
	//METODOS DE OBJETO 
	
	public String  toStringObj() {
		
		return "[Codigo:"+this.codigo+"|Titulo:"+this.titulo+"|a�o de publicacion:"+this.a�oPublicacion+"]";
	}
	

}
