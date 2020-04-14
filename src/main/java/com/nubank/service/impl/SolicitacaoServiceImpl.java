package com.nubank.service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nubank.repository.SolicitacaoRepository;
import com.nubank.repository.entity.Solicitacao;
import com.nubank.service.SolicitacaoService;

@Service
public class SolicitacaoServiceImpl implements SolicitacaoService{
	
	@Autowired
	SolicitacaoRepository solicitacaoRepository;
	
	public Solicitacao salvar(Solicitacao request) {
		return this.solicitacaoRepository.saveAndFlush(request);
	}
	
	public List<Solicitacao> buscarTodos(){
		return this.solicitacaoRepository.findAll();
	}
	
	public Optional<Solicitacao> buscarPorId(Long id){
		return this.solicitacaoRepository.findById(id);
	}

}
