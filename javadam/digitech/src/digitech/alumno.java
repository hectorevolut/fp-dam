package digitech;

public class alumno {
	//Creamos las propiedades o atributos almacenan valores
	String nombre;
	String apellidos;
	int edad;
	String email;
	String movil;
	
	//Tenemos que declarar la función o método constructor.
	public alumno(String nombre, String apellidos, int edad, String email, String movil) {
		//Asociar entre el valor que recibo  y la propiedad o atributo con el operador this.
		this.nombre=nombre;
		this.apellidos=apellidos;
		this.edad=edad;
		this.email=email;
		this.movil=movil;
		
		System.out.println("El objeto se ha creado correctamente...");
	}

	public void Imprimir() {
		System.out.println("Nombre: "+nombre);
		System.out.println("Apellidos: "+apellidos);
		System.out.println("Edad: "+edad);
		System.out.println("Email: "+email);
		System.out.println("Móvil: "+movil);
	}
	
	public int calcularEdad(int n) {
		int edad=2025-n;
		System.out.println("Tu edad es: "+edad);
		return edad;
	}
}
