package jerarquia;

public class Empleado {
	
	protected String nombre;
	
	Empleado(String nombre){
		this.nombre=nombre;
	}
	
	public String toString() {
		
		return "nombre:"+this.nombre;
	}

}

class Directivo  extends Empleado{

	Directivo(String nombre) {
		super(nombre);

	}
	
}


 class Operario  extends Empleado{

	Operario(String nombre) {
		super(nombre);

	}
	
}
 
 
class Oficial extends Operario{
	
	Oficial(String nombre) {
		super(nombre);

	}
	
}

class Tecnico extends Operario{
	
	Tecnico(String nombre) {
		super(nombre);

	}
	
}
