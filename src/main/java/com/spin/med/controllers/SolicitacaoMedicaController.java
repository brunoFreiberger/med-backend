package com.spin.med.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.spin.med.dtos.ProcedimentoMedicoDTO;
import com.spin.med.services.SolicitacaoMedicaService;

@Controller
@RequestMapping(path = "/autorizador")
public class SolicitacaoMedicaController {

	@Autowired
	private SolicitacaoMedicaService solicitacaoMedicaService;

	@GetMapping(path = "/procedimento/{codigo}/idade/{idade}/sexo/{sexo}")
	public @ResponseBody ResponseEntity<Boolean> verifyPermission(@PathVariable Long codigo, @PathVariable Integer idade,
			@PathVariable String sexo) {
		Boolean res = this.solicitacaoMedicaService.verifyPermission(codigo, idade, sexo);
		return new ResponseEntity<>(res, HttpStatus.OK);
	}

	@PostMapping(path = "/procedimento/save")
	public @ResponseBody ResponseEntity<ProcedimentoMedicoDTO> save(@RequestBody ProcedimentoMedicoDTO obj) {
		return new ResponseEntity<>(this.solicitacaoMedicaService.save(obj), HttpStatus.OK);
	}

}
