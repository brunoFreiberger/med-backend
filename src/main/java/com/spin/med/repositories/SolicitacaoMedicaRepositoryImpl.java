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
	public Boolean verifyPermission(Long code, Integer age, String sex) {
		QProcedimentoMedico procedimentoMedico = QProcedimentoMedico.procedimentoMedico;
		BooleanBuilder predicate = new BooleanBuilder();
		predicate.and(
				procedimentoMedico.code.eq(code).and(procedimentoMedico.age.eq(age).and(procedimentoMedico.sex.eq(sex))));
		Boolean result = new JPAQueryFactory(em).select(procedimentoMedico.allowed).from(procedimentoMedico)
				.where(predicate).fetchOne();
		return result;
	}

}
