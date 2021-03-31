package com.spin.med.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.querydsl.QuerydslPredicateExecutor;

import com.spin.med.models.ProcedimentoMedico;

public interface SolicitacaoMedicaRepository extends JpaRepository<ProcedimentoMedico, Long>, SolicitacaoMedicaCustomRepository, QuerydslPredicateExecutor<ProcedimentoMedico> {

}
