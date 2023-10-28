package domain;

import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Table(name = "Empleado")
@Entity(name = "Emp")

public class Empleado {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@Column(name = "ape_mat", length = 100, nullable = false)
	private String apeMat;
	
	@Column(name = "ape_pat", length = 100, nullable = false)
	private String apePat;
	
	@Column(name = "fecha_nacimiento", nullable = false)
	private Date fechaNacimiento;
	
	@Column(name = "nombres", length = 100, nullable = false)
	private String nombres;
	
	@Column(name = "nro_hijos", nullable = false)
	private int nroHijos;
	
	@Column(name = "sueldo", nullable = false)
	private double sueldo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getApeMat() {
		return apeMat;
	}

	public void setApeMat(String apeMat) {
		this.apeMat = apeMat;
	}

	public String getApePat() {
		return apePat;
	}

	public void setApePat(String apePat) {
		this.apePat = apePat;
	}

	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}

	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}

	public String getNombres() {
		return nombres;
	}

	public void setNombres(String nombres) {
		this.nombres = nombres;
	}

	public int getNroHijos() {
		return nroHijos;
	}

	public void setNroHijos(int nroHijos) {
		this.nroHijos = nroHijos;
	}

	public double getSueldo() {
		return sueldo;
	}

	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}

	@Override
	public String toString() {
		return "Empleado [id=" + id + ", apeMat=" + apeMat + ", apePat=" + apePat + ", fechaNacimiento="
				+ fechaNacimiento + ", nombres=" + nombres + ", nroHijos=" + nroHijos + ", sueldo=" + sueldo + "]";
	}

	
	
	
}
