package com.nubank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nubank.converter.SolicitacaoConverter;
import com.nubank.domain.RequestSolicitacao;
import com.nubank.domain.ResponseSolicitacao;
import com.nubank.repository.entity.Solicitacao;
import com.nubank.service.SolicitacaoService;

@RestController
@RequestMapping("/solicitacao")
public class SolicitacaoController {
	
	@Autowired
	SolicitacaoService solicitacaoService;
	
	@Autowired
	SolicitacaoConverter solicitacaoConverter;
	
	@PostMapping
	public ResponseEntity<ResponseSolicitacao> salvar(@RequestBody RequestSolicitacao request){
		Solicitacao solicitacao = this.solicitacaoConverter.toEntity(request);
		try {
			solicitacao = this.solicitacaoService.salvar(solicitacao);
			return ResponseEntity.ok(this.success());
		} catch (Exception e) {
			return ResponseEntity.badRequest().build();
		}
				
				
	}
	
	@GetMapping
	public ResponseEntity<List<Solicitacao>> buscarTodos(){
		return ResponseEntity.ok(this.solicitacaoService.buscarTodos());
		//return this.success();
	}
	

	
	public ResponseSolicitacao success() {
		ResponseSolicitacao response = new ResponseSolicitacao();
		response.setCodigo(200L);
		response.setMensagem("Cadastro Efetuado");
		return response;
	
	}
	

}