package es.meatze.core.entity;

import javax.persistence.*;

@Entity
@Table(name="periferico")
public class Periferico {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_periferico")
	private String id_periferico;
	
	@Column(name="nombre")
	private String nombre;
	
	@Column(name="marca")
	private String marca;
	
	@Column(name="modelo")
	private String modelo;
	
	@Column(name="ns")
	private String ns;
	
	@Column(name="operativo")
	private boolean operativo;
	
	@Column(name="uso")
	private boolean uso;
	
	@Column(name="comentario")
	private String comentario;
	
	@ManyToOne
	@JoinColumn(name="id_aula")
	private Aula aula;

	
	public Periferico() {
		super();
	}


	public Periferico(String id_periferico, String nombre, String marca, String modelo, String ns, boolean operativo,
			boolean uso, String comentario) {
		super();
		this.id_periferico = id_periferico;
		this.nombre = nombre;
		this.marca = marca;
		this.modelo = modelo;
		this.ns = ns;
		this.operativo = operativo;
		this.uso = uso;
		this.comentario = comentario;
	}


	public String getId_periferico() {
		return id_periferico;
	}


	public void setId_periferico(String id_periferico) {
		this.id_periferico = id_periferico;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getNs() {
		return ns;
	}


	public void setNs(String ns) {
		this.ns = ns;
	}


	public boolean isOperativo() {
		return operativo;
	}


	public void setOperativo(boolean operativo) {
		this.operativo = operativo;
	}


	public boolean isUso() {
		return uso;
	}


	public void setUso(boolean uso) {
		this.uso = uso;
	}


	public String getComentario() {
		return comentario;
	}


	public void setComentario(String comentario) {
		this.comentario = comentario;
	}


	public Aula getAula() {
		return aula;
	}


	public void setAula(Aula aula) {
		this.aula = aula;
	}


	@Override
	public String toString() {
		return "Periferico [id_periferico=" + id_periferico + ", nombre=" + nombre + ", marca=" + marca + ", modelo="
				+ modelo + ", ns=" + ns + ", operativo=" + operativo + ", uso=" + uso + ", comentario=" + comentario
				+ "]";
	}
	
	
	
	
}
