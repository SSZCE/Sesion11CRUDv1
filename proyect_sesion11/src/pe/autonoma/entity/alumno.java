package pe.autonoma.entity;

public class alumno {
	private int alumno_id;
	private String nombre;
	private String apellido;
	private int edad;
	private int ciclo;
	private int aingreso;
	public int getAlumno_id() {
		return alumno_id;
	}
	public void setAlumno_id(int alumno_id) {
		this.alumno_id = alumno_id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public int getEdad() {
		return edad;
	}
	public void setEdad(int edad) {
		this.edad = edad;
	}
	public int getCiclo() {
		return ciclo;
	}
	public void setCiclo(int ciclo) {
		this.ciclo = ciclo;
	}
	public int getAingreso() {
		return aingreso;
	}
	public void setAingreso(int aingreso) {
		this.aingreso = aingreso;
	}
	public alumno(int alumno_id, String nombre, String apellido, int edad, int ciclo, int aingreso) {
		super();
		this.alumno_id = alumno_id;
		this.nombre = nombre;
		this.apellido = apellido;
		this.edad = edad;
		this.ciclo = ciclo;
		this.aingreso = aingreso;
	}

	

}
