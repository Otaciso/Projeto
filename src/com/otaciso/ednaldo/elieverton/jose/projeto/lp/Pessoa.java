package com.otaciso.ednaldo.elieverton.jose.projeto.lp;

public class Pessoa {

	private String nome;
	private int idade;
	private String sexo;
	private Object cpf;
	private String rg;
	private Endereco endereco;

	public Pessoa(String nome, int idade, String sexo, String cpf, String rg,
			Endereco endereco) {
		this.nome = nome;
		this.idade = idade;
		this.sexo = sexo;		
		this.cpf = cpf;
		this.rg = rg;
		this.endereco = endereco;
	}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getSexo() {
		return sexo;
	}

	public void setSexo(String sexo) {
		this.sexo = sexo;
	}

	public Object getCpf() {
		return cpf;
	}

	public void setCpf(Object cpf) {
		this.cpf = cpf;
	}

	public String getRg() {
		return rg;
	}

	public void setRg(String rg) {
		this.rg = rg;
	}

	public Endereco getEndereco() {
		return endereco;
	}

	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}

	public Pessoa (String nome, int idade){
		this.nome = nome;
		this.idade = idade;
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
