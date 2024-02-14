package Biblioteca;

public class Publicacion {
	
	protected String codigo;
	protected String titulo;
	protected int añoPublicacion;

	
	Publicacion(String codigo,String titulo,int añoPublicacion){
		
		this.codigo=codigo;
		this.titulo=titulo;
		this.añoPublicacion=añoPublicacion;
	};
	
	//GETTERS  
	
	public String GetCodigo() {
		return this.codigo;
	}
	public String GetTitulo() {
		return this.titulo;
	}
	public int GetAñoPublicacion() {
		
		return this.añoPublicacion;
	}
	
	//SETTERS
	
	public void SetCodigo(String codigo) {
		
		this.codigo=codigo;
	}
	public void SetTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void SetAñoPublicacion(int año) {
		this.añoPublicacion=año;
	}
	
	//METODOS DE OBJETO 
	
	public String  toStringObj() {
		
		return "[Codigo:"+this.codigo+"|Titulo:"+this.titulo+"|año de publicacion:"+this.añoPublicacion+"]";
	}
	

}
