package es.meatze.core.entity;

import java.util.List;

import javax.persistence.*;

import org.hibernate.annotations.Fetch;
import org.hibernate.annotations.FetchMode;

@Entity
@Table(name="centro")
public class Centro {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="id_centro")
	private String id_centro;
	
	@Column(name="localidad")
	private String localidad;
	
	@Column(name="direccion")
	private String direccion;
	
	@Column(name="cp")
	private String cp;
	
	@Column(name="telefono")
	private String telefono;
	
	@Column(name="whatsapp")
	private String whatsapp;
	
	@Column(name="email")
	private String email;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "centro")
	private List<Aula> aulas;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "aula")
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Periferico> perifericosCentro;

	@OneToMany(fetch = FetchType.EAGER, mappedBy = "aula")
	@Fetch(value = FetchMode.SUBSELECT)
	private List<Ordenador> ordenadoresCentro;
	
	public Centro() {
		super();
	}

	
	
	
	
	
	public Centro(String id_centro, String localidad) {
		super();
		this.id_centro = id_centro;
		this.localidad = localidad;
	}






	public Centro(String id_centro, String localidad, String direccion, String cp, String telefono, String whatsapp,
			String email) {
		super();
		this.id_centro = id_centro;
		this.localidad = localidad;
		this.direccion = direccion;
		this.cp = cp;
		this.telefono = telefono;
		this.whatsapp = whatsapp;
		this.email = email;
	}

	public String getId_centro() {
		return id_centro;
	}

	public void setId_centro(String id_centro) {
		this.id_centro = id_centro;
	}

	public String getLocalidad() {
		return localidad;
	}

	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCp() {
		return cp;
	}

	public void setCp(String cp) {
		this.cp = cp;
	}

	public String getTelefono() {
		return telefono;
	}

	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}

	public String getWhatsapp() {
		return whatsapp;
	}

	public void setWhatsapp(String whatsapp) {
		this.whatsapp = whatsapp;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public List<Aula> getAulas() {
		return aulas;
	}

	public void setAulas(List<Aula> aulas) {
		this.aulas = aulas;
	}

	public List<Periferico> getPerifericosCentro() {
		return perifericosCentro;
	}

	public void setPerifericosCentro(List<Periferico> perifericosCentro) {
		this.perifericosCentro = perifericosCentro;
	}






	public List<Ordenador> getOrdenadoresCentro() {
		return ordenadoresCentro;
	}






	public void setOrdenadoresCentro(List<Ordenador> ordenadoresCentro) {
		this.ordenadoresCentro = ordenadoresCentro;
	}






	@Override
	public String toString() {
		return "Centro [id_centro=" + id_centro + ", localidad=" + localidad + "]";
	}
	
	
	
}
