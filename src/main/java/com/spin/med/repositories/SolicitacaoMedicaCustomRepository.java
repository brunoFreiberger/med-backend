package com.spin.med.repositories;

public interface SolicitacaoMedicaCustomRepository {

	public Boolean verifyPermission(Long codigo, Integer idade, String sexo);

}
