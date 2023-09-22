package ar.unlam.intraconsulta;

import java.util.ArrayList;
import java.util.Collection;

public class Comision {
//comision es lo mismo que cursada 

	private Integer comisionId;
	private ArrayList<Materia> materias;
	private ArrayList<Turno> turno;
	private ArrayList<CicloLectivo> cicloLectivos;
	private ArrayList<Profesor> profesores;
	// private ArrayList <InscripcionAComision> inscripcionAComision;
	private ArrayList<Comision> comision;

	public Comision() {

		this.comisionId = comisionId;
		turno = new ArrayList<>();
		materias = new ArrayList<>();
		cicloLectivos = new ArrayList();
		profesores = new ArrayList();
		comision= new ArrayList();
	}
	

	public ArrayList<Profesor> getProfesores() {
		return profesores;
	}


	public void setProfesores(ArrayList<Profesor> profesores) {
		this.profesores = profesores;
	}


	public ArrayList<Comision> getComision() {
		return comision;
	}


	public void setComision(ArrayList<Comision> comision) {
		this.comision = comision;
	}


	public Integer getComisionId() {
		return comisionId;
	}

	public void setComisionId(Integer comisionId) {
		this.comisionId = comisionId;
	}

	public ArrayList<Materia> getMaterias() {
		return materias;
	}

	public void setMaterias(ArrayList<Materia> materias) {
		this.materias = materias;
	}

	public ArrayList<Turno> getTurno() {
		return turno;
	}

	public void setTurno(ArrayList<Turno> turno) {
		this.turno = turno;
	}

	public ArrayList<CicloLectivo> getCicloLectivos() {
		return cicloLectivos;
	}

	public void setCicloLectivos(ArrayList<CicloLectivo> cicloLectivos) {
		this.cicloLectivos = cicloLectivos;
	}

	// agregar Comision que no se pueden generar 2 comisiones para la misma
	// materia,cicloLectivo y turno
	public boolean esIgual(Comision otraComision) {

		boolean mismaMateria = this.materias.equals(otraComision.getMaterias());
		boolean mismoCicloLectivo = this.cicloLectivos.equals(otraComision.getCicloLectivos());
		boolean mismoTurno = this.turno.equals(otraComision.getTurno());

		return mismaMateria && mismoCicloLectivo && mismoTurno;
	}

}
