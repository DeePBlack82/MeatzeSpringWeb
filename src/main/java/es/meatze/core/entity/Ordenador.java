package es.meatze.core.entity;

import javax.persistence.*;

@Entity
@Table(name="ordenador")
public class Ordenador {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id_ordenador")
	private String id_ordenador;
	
	@Column(name="ns")
	private String ns;
	
	@Column(name="placa_base")
	private String placa_base;
	
	@Column(name="procesador")
	private String procesador;
	
	@Column(name="sistema_operativo")
	private String sistema_operativo;
	
	@Column(name="ram")
	private String ram;
	
	@Column(name="gpu")
	private String gpu;
	
	@Column(name="tarjeta_red")
	private boolean tarjeta_red;
	
	@Column(name="disco1")
	private String disco1;
	
	@Column(name="disco2")
	private String disco2;
	
	@Column(name="all_in_one")
	private boolean all_in_one;
	
	@Column(name="uso")
	private boolean uso;	
	
	@Column(name="operativo")
	private boolean operativo;
	
	@Column(name="comentario")
	private String comentario;		
		
	@ManyToOne
	@JoinColumn(name="id_aula")
	private Aula aula;

	
	public Ordenador() {
		super();
	}


	public Ordenador(String id_ordenador, String ns, String placa_base, String procesador, String sistema_operativo,
			String ram, String gpu, boolean tarjeta_red, String disco1, String disco2, boolean all_in_one, boolean uso,
			boolean operativo, String comentario) {
		super();
		this.id_ordenador = id_ordenador;
		this.ns = ns;
		this.placa_base = placa_base;
		this.procesador = procesador;
		this.sistema_operativo = sistema_operativo;
		this.ram = ram;
		this.gpu = gpu;
		this.tarjeta_red = tarjeta_red;
		this.disco1 = disco1;
		this.disco2 = disco2;
		this.all_in_one = all_in_one;
		this.uso = uso;
		this.operativo = operativo;
		this.comentario = comentario;
	}


	public String getId_ordenador() {
		return id_ordenador;
	}


	public void setId_ordenador(String id_ordenador) {
		this.id_ordenador = id_ordenador;
	}


	public String getNs() {
		return ns;
	}


	public void setNs(String ns) {
		this.ns = ns;
	}


	public String getPlaca_base() {
		return placa_base;
	}


	public void setPlaca_base(String placa_base) {
		this.placa_base = placa_base;
	}


	public String getProcesador() {
		return procesador;
	}


	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}


	public String getSistema_operativo() {
		return sistema_operativo;
	}


	public void setSistema_operativo(String sistema_operativo) {
		this.sistema_operativo = sistema_operativo;
	}


	public String getRam() {
		return ram;
	}


	public void setRam(String ram) {
		this.ram = ram;
	}


	public String getGpu() {
		return gpu;
	}


	public void setGpu(String gpu) {
		this.gpu = gpu;
	}


	public boolean isTarjeta_red() {
		return tarjeta_red;
	}


	public void setTarjeta_red(boolean tarjeta_red) {
		this.tarjeta_red = tarjeta_red;
	}


	public String getDisco1() {
		return disco1;
	}


	public void setDisco1(String disco1) {
		this.disco1 = disco1;
	}


	public String getDisco2() {
		return disco2;
	}


	public void setDisco2(String disco2) {
		this.disco2 = disco2;
	}


	public boolean isAll_in_one() {
		return all_in_one;
	}


	public void setAll_in_one(boolean all_in_one) {
		this.all_in_one = all_in_one;
	}


	public boolean isUso() {
		return uso;
	}


	public void setUso(boolean uso) {
		this.uso = uso;
	}


	public boolean isOperativo() {
		return operativo;
	}


	public void setOperativo(boolean operativo) {
		this.operativo = operativo;
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
		return "Ordenador [id_ordenador=" + id_ordenador + ", ns=" + ns + ", placa_base=" + placa_base + ", procesador="
				+ procesador + ", sistema_operativo=" + sistema_operativo + ", ram=" + ram + ", gpu=" + gpu
				+ ", tarjeta_red=" + tarjeta_red + ", disco1=" + disco1 + ", disco2=" + disco2 + ", all_in_one="
				+ all_in_one + ", uso=" + uso + ", operativo=" + operativo + ", comentario=" + comentario + "]";
	}

	

	
	
	
}
