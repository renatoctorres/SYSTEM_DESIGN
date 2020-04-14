package com.nubank.converter;

import org.springframework.stereotype.Component;

import com.nubank.domain.RequestSolicitacao;
import com.nubank.repository.entity.Solicitacao;

@Component
public class SolicitacaoConverter {
	
	public Solicitacao toEntity(RequestSolicitacao request) {
		
		if(request != null) {
			Solicitacao solicitacao = new Solicitacao();
			if(request.getCpf()!=null) {
				solicitacao.setCpf(request.getCpf());
			}
			
			if(request.getDataNascimento()!=null) {
				solicitacao.setDataNascimento(request.getDataNascimento());
			}
			
			if(request.getNome()!=null) {
				solicitacao.setNome(request.getNome());
			}
			
			if(request.getNomeMae()!=null) {
				solicitacao.setNomeMae(request.getNomeMae());
			}
			
			if(request.getNomePai()!=null) {
				solicitacao.setNomePai(request.getNomePai());
			}
			
			if(request.getRendaMensal()!=null) {
				solicitacao.setRendaMensal(request.getRendaMensal());
			}
			
			if(request.getSobrenome()!=null) {
				solicitacao.setSobrenome(request.getSobrenome());
			}
			
			return solicitacao;
		}
		return null;
	}

}
