package com.nubank.service;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.nubank.repository.entity.Solicitacao;

@Service
public interface SolicitacaoService {
	
	public Solicitacao salvar(Solicitacao request);
	
	public List<Solicitacao> buscarTodos();
	
	public Optional<Solicitacao> buscarPorId(Long id);


}
