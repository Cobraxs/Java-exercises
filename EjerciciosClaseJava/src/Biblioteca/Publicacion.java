package Biblioteca;

public class Publicacion {
	
	protected String codigo;
	protected String titulo;
	protected int aņoPublicacion;

	
	Publicacion(String codigo,String titulo,int aņoPublicacion){
		
		this.codigo=codigo;
		this.titulo=titulo;
		this.aņoPublicacion=aņoPublicacion;
	};
	
	//GETTERS  
	
	public String GetCodigo() {
		return this.codigo;
	}
	public String GetTitulo() {
		return this.titulo;
	}
	public int GetAņoPublicacion() {
		
		return this.aņoPublicacion;
	}
	
	//SETTERS
	
	public void SetCodigo(String codigo) {
		
		this.codigo=codigo;
	}
	public void SetTitulo(String titulo) {
		this.titulo=titulo;
	}
	public void SetAņoPublicacion(int aņo) {
		this.aņoPublicacion=aņo;
	}
	
	//METODOS DE OBJETO 
	
	public String  toStringObj() {
		
		return "[Codigo:"+this.codigo+"|Titulo:"+this.titulo+"|aņo de publicacion:"+this.aņoPublicacion+"]";
	}
	

}
