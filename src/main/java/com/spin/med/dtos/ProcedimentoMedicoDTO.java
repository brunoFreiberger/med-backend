package com.spin.med.dtos;

public class ProcedimentoMedicoDTO {

	private Long id;
	private Long codigo;
	private String sexo;
	private Integer idade;
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
