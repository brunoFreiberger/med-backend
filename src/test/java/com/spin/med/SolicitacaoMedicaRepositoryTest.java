package com.spin.med;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

import org.junit.jupiter.api.Test;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;

import com.spin.med.dtos.ProcedimentoMedicoDTO;
import com.spin.med.models.ProcedimentoMedico;
import com.spin.med.repositories.SolicitacaoMedicaRepository;

@DataJpaTest
public class SolicitacaoMedicaRepositoryTest {

	@Autowired
	private SolicitacaoMedicaRepository repository;

	@Test
	public void saveTest() {
		ProcedimentoMedicoDTO dto = this.getDTO();
		ProcedimentoMedico res = repository.save(new ModelMapper().map(dto, ProcedimentoMedico.class));
		assertEquals(res.getCodigo(), dto.getCodigo());
		assertEquals(res.getIdade(), dto.getIdade());
		assertEquals(res.getSexo(), dto.getSexo());
	}

	@Test
	public void verifyIsAllowed() {
		ProcedimentoMedicoDTO dto = this.getDTO();
		repository.save(new ModelMapper().map(dto, ProcedimentoMedico.class));
		assertEquals(repository.verifyPermission(dto.getCodigo(), dto.getIdade(), dto.getSexo()), Boolean.TRUE);
	}

	@Test
	public void verifyIsDanied() {
		Boolean danied = repository.verifyPermission(888l, 99, "F");
		assertNull(danied);
	}

	private ProcedimentoMedicoDTO getDTO() {
		ProcedimentoMedicoDTO dto = new ProcedimentoMedicoDTO();
		dto.setCodigo(999l);
		dto.setIdade(40);
		dto.setSexo("M");
		dto.setPermitido(Boolean.TRUE);
		return dto;
	}

}
