package com.spin.med.services;

import com.spin.med.dtos.ProcedimentoMedicoDTO;

public interface SolicitacaoMedicaService {

	public Boolean verifyPermission(Long codigo, Integer idade, String sexo);

	public ProcedimentoMedicoDTO save(ProcedimentoMedicoDTO obj);

}
