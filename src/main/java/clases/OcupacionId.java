package clases;
// Generated 21 dic 2024, 22:45:28 by Hibernate Tools 5.6.15.Final

/**
 * OcupacionId generated by hbm2java
 */
public class OcupacionId implements java.io.Serializable {

	private int inscripcion;
	private byte hospitalCod;
	private byte salaCod;

	public OcupacionId() {
	}

	public OcupacionId(int inscripcion, byte hospitalCod, byte salaCod) {
		this.inscripcion = inscripcion;
		this.hospitalCod = hospitalCod;
		this.salaCod = salaCod;
	}

	public int getInscripcion() {
		return this.inscripcion;
	}

	public void setInscripcion(int inscripcion) {
		this.inscripcion = inscripcion;
	}

	public byte getHospitalCod() {
		return this.hospitalCod;
	}

	public void setHospitalCod(byte hospitalCod) {
		this.hospitalCod = hospitalCod;
	}

	public byte getSalaCod() {
		return this.salaCod;
	}

	public void setSalaCod(byte salaCod) {
		this.salaCod = salaCod;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof OcupacionId))
			return false;
		OcupacionId castOther = (OcupacionId) other;

		return (this.getInscripcion() == castOther.getInscripcion())
				&& (this.getHospitalCod() == castOther.getHospitalCod())
				&& (this.getSalaCod() == castOther.getSalaCod());
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result + this.getInscripcion();
		result = 37 * result + this.getHospitalCod();
		result = 37 * result + this.getSalaCod();
		return result;
	}

}
