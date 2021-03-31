package com.spin.med.services;

import com.spin.med.dtos.ProcedimentoMedicoDTO;

public interface SolicitacaoMedicaService {

	public Boolean verifyPermission(Long id, Integer age, String sex);

	public ProcedimentoMedicoDTO save(ProcedimentoMedicoDTO obj);

}
