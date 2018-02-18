package asw.dbManagement.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Agent")
public class Agent {

	// Id generado automáticamente para diferenciar cada uno (para mapear)
	@Id
	@GeneratedValue
	private Long id;

	// Nombres y apellidos en caso de persona
	private String nombre;
	// Opcional personas e identidades
	private String localizacion;
	@Column(unique = true)
	private String email;

	// CIF en caso de persona
	@Column(unique = true)
	private String ident;

	private String password;

	private Integer kind;

	/**
	 * Constructor vacío (ya que es para mapear)
	 */
	Agent() {
	}

	/**
	 * Constructor
	 * 
	 * @param nombre
	 * @param apellidos
	 * @param password
	 * @param fechaNacimiento
	 * @param email
	 * @param dNI
	 * @param direccion
	 * @param nacionalidad
	 */
	public Agent(String nombre, String apellidos, String password, Date fechaNacimiento, String email, String dNI,
			String direccion, String nacionalidad, boolean isAdmin, boolean isPolitician) {
		super();
		this.nombre = nombre;

		this.password = password;

		this.email = email;
	}

	public Long getId() {
		return id;
	}

	public String getNombre() {
		return nombre;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getLocalizacion() {
		return localizacion;
	}

	public String getIdent() {
		return ident;
	}
	
	public String getKind(){
		//Temporal
		return String.valueOf(getKindCode());
	}

	public Integer getKindCode() {
		return kind;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Agent other = (Agent) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "Agent [id=" + id + ", nombre=" + nombre + ", localizacion=" + localizacion + ", email=" + email
				+ ", ident=" + ident + ", password=" + password + ", kind=" + kind + "]";
	}

}
