package mx.edu.itlapiedad.ws;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import mx.edu.itlapiedad.dao.AlumnoDAO;
import mx.edu.itlapiedad.models.Alumno;

@RestController
@RequestMapping("/hola")
public class Mensaje {
	
	@Autowired
	AlumnoDAO repositorio;
	
	@GetMapping("servicio")
	public String enviarSaludo() {
		return "Hola WS!";
	}
	
	@GetMapping("alumno")
	public Alumno mostrarAlumno() {
		Alumno alumno = new Alumno();
		alumno.setNombre("Pacheco");
		alumno.setNocontrol("16640121");
		alumno.setCarrera_id(1);
		return alumno;
	}
	
	@GetMapping("alumnos")
	public List<Alumno> consultarAlumnos(){
		return repositorio.consultar();
	}
	
	@PostMapping("alumno")
	public void insertarAlumno(@RequestBody Alumno alumno) {
		repositorio.insertar(alumno);
	}
	
	@GetMapping("alumnos/{id}")
	public Alumno buscarAlumno(@PathVariable int id) {
		return repositorio.buscar(id);
	}
	
	@DeleteMapping("alumnos/{id}")
	public void eliminarAlumno(@PathVariable int id) {
		repositorio.eliminar(id);
	}
	
	@PutMapping("alumnos")
	public void actualizarAlumno(@RequestBody Alumno alumno) {
		repositorio.actualizar(alumno);
	}
	
	@GetMapping("sumar/{n1}/{n2}")
	public int suma(@PathVariable int n1,@PathVariable int n2) {
		int res = 0;
		res = n1 *n2;
		//multiplica Miguel
		return res;
	}
	
}
