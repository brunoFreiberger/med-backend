package com.spin.med.repositories;

public interface SolicitacaoMedicaCustomRepository {

	public Boolean verifyPermission(Long code, Integer age, String sex);

}
