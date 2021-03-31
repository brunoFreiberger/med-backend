package com.spin.med.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.DynamicInsert;
import org.hibernate.annotations.DynamicUpdate;

/**
 * 
 * @author Bruno H. Freiberger
 *
 */
@Entity
@DynamicInsert
@DynamicUpdate
@Table(name = "procedimento_medico")
public class ProcedimentoMedico {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;

	@Column(name = "codigo")
	private Long codigo;

	@Column(name = "sexo")
	private String sexo;

	@Column(name = "idade")
	private Integer idade;

	@Column(name = "permitido")
	private Boolean permitido;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Long getCodigo() {
		return codigo;
	}

	public void setCodigo(Long codigo) {
		this.codigo = codigo;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Integer getIdade() {
		return idade;
	}

	public void setIdade(Integer idade) {
		this.idade = idade;
	}

	public Boolean getPermitido() {
		return permitido;
	}

	public void setPermitido(Boolean permitido) {
		this.permitido = permitido;
	}

}
