package com.nubank.repository.entity;

import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


@Entity
@Table(name = "TAB_SOLICITACAO")
public class Solicitacao {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	Long id;
	
	@Column(name = "DESC_NOME_SOLI", length=50)
	String nome;
	
	@Column(name = "DESC_SOB_NOME_SOLI", length=50)
	String sobrenome;
	
	@Column(name = "DESC_NOME_PAI_SOLI", length=50)
	String nomePai;
	
	@Column(name = "DESC_NOME_MAE_SOLI", length=50)
	String nomeMae;
	
	@Column(name = "DATA_NASC_SOLI")
	LocalDateTime dataNascimento;
	
	@Column(name = "DESC_CPF_SOLI", length=11)
	String cpf;
	
	@Column(name = "VLR_REND_SOLI")
	Double rendaMensal;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public LocalDateTime getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(LocalDateTime dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public Double getRendaMensal() {
		return rendaMensal;
	}

	public void setRendaMensal(Double rendaMensal) {
		this.rendaMensal = rendaMensal;
	}

}
