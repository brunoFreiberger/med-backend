package com.spin.med.repositories;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.querydsl.core.BooleanBuilder;
import com.querydsl.jpa.impl.JPAQueryFactory;
import com.spin.med.models.QProcedimentoMedico;

@Repository
public class SolicitacaoMedicaRepositoryImpl implements SolicitacaoMedicaCustomRepository {

	@Autowired
	private EntityManager em;

	@Override
	public Boolean verifyPermission(Long codigo, Integer idade, String sexo) {
		QProcedimentoMedico procedimentoMedico = QProcedimentoMedico.procedimentoMedico;
		BooleanBuilder predicate = new BooleanBuilder();
		predicate.and(
				procedimentoMedico.codigo.eq(codigo).and(procedimentoMedico.idade.eq(idade).and(procedimentoMedico.sexo.eq(sexo))));
		Boolean result = new JPAQueryFactory(em).select(procedimentoMedico.permitido).from(procedimentoMedico)
				.where(predicate).fetchOne();
		return result;
	}

}
