package mx.edu.itlapiedad.models;

public class Alumno {
	int id;
	int n1 , n2;
	String nombre;
	String nocontrol;
	int carrera_id;
	
	public Alumno() {
		super();
	}

	

	public Alumno(int carrera_id, int id, int n2, int n1, String nombre, String nocontrol) {
		super();
		this.carrera_id = carrera_id;
		this.id = id;
		this.n2 = n2;
		this.n1 = n1;
		this.nombre = nombre;
		this.nocontrol = nocontrol;
	}



	public int getId() {
		return id;
	}

	public int getN1() {
		return n1;
	}

	public void setN1(int n1) {
		this.n1 = n1;
	}

	public int getN2() {
		return n2;
	}

	public void setN2(int n2) {
		this.n2 = n2;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNocontrol() {
		return nocontrol;
	}

	public void setNocontrol(String nocontrol) {
		this.nocontrol = nocontrol;
	}

	public int getCarrera_id() {
		return carrera_id;
	}

	public void setCarrera_id(int carrera_id) {
		this.carrera_id = carrera_id;
	}
	
	
}
