package clases;
// Generated 21 dic 2024, 22:45:28 by Hibernate Tools 5.6.15.Final

import java.util.HashSet;
import java.util.Set;

/**
 * Sala generated by hbm2java
 */
public class Sala implements java.io.Serializable {

	private SalaId id;
	private Hospitales hospitales;
	private String nombre;
	private Short numCama;
	private Set ocupacions = new HashSet(0);
	private Set plantillas = new HashSet(0);

	public Sala() {
	}

	public Sala(SalaId id, Hospitales hospitales) {
		this.id = id;
		this.hospitales = hospitales;
	}

	public Sala(SalaId id, Hospitales hospitales, String nombre, Short numCama, Set ocupacions, Set plantillas) {
		this.id = id;
		this.hospitales = hospitales;
		this.nombre = nombre;
		this.numCama = numCama;
		this.ocupacions = ocupacions;
		this.plantillas = plantillas;
	}

	public SalaId getId() {
		return this.id;
	}

	public void setId(SalaId id) {
		this.id = id;
	}

	public Hospitales getHospitales() {
		return this.hospitales;
	}

	public void setHospitales(Hospitales hospitales) {
		this.hospitales = hospitales;
	}

	public String getNombre() {
		return this.nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Short getNumCama() {
		return this.numCama;
	}

	public void setNumCama(Short numCama) {
		this.numCama = numCama;
	}

	public Set getOcupacions() {
		return this.ocupacions;
	}

	public void setOcupacions(Set ocupacions) {
		this.ocupacions = ocupacions;
	}

	public Set getPlantillas() {
		return this.plantillas;
	}

	public void setPlantillas(Set plantillas) {
		this.plantillas = plantillas;
	}

}