package com.spin.med.services;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.spin.med.dtos.ProcedimentoMedicoDTO;
import com.spin.med.models.ProcedimentoMedico;
import com.spin.med.repositories.SolicitacaoMedicaRepository;

@Service
public class SolicitacaoMedicaServiceImpl implements SolicitacaoMedicaService {
	
	@Autowired
	private SolicitacaoMedicaRepository solicitacaoMedicaRepository;

	@Override
	public Boolean verifyPermission(Long id, Integer age, String sex) {
		Boolean res = solicitacaoMedicaRepository.verifyPermission(id, age, sex);
		return res != null && res;
	}
	
	@Override
	public ProcedimentoMedicoDTO save(ProcedimentoMedicoDTO obj) {
		ModelMapper mapper = new ModelMapper();
		ProcedimentoMedico entity = mapper.map(obj, ProcedimentoMedico.class);
		entity = solicitacaoMedicaRepository.save(entity);
		return mapper.map(entity, ProcedimentoMedicoDTO.class);
	}

}
