package com.otaciso.ednaldo.elieverton.jose.projeto.lp;

public class Endereco {

	private String rua;
	private int numero;
	private String bairro;
	private String cidade;
	private String estado;

	public Endereco(String rua, int numero, String bairro, String cidade,
			String estado) throws Exception {
		if (rua == null || rua.equals("")) {
			throw new Exception("Nome da rua Invalido");
		}

		if (numero < 0) {
			throw new Exception("Nome da Rua Invalido");
		}

		if (bairro == null || bairro.equals("")) {
			throw new Exception("Nome do bairro Invalido");
		}

		if (cidade == null || cidade.equals("")) {
			throw new Exception("Nome da Cidade Invalido");
		}

		if (estado == null || estado.equals("")) {
			throw new Exception("Nome do Estado Invalido!");
		}

		this.rua = rua;
		this.numero = numero;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;

	}

	public String getRua() {
		return rua;
	}

	public void setRua(String rua) {
		this.rua = rua;
	}

	public int getNumero() {
		return numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public String getBairro() {
		return bairro;
	}

	public void setBairro(String bairro) {
		this.bairro = bairro;
	}

	public String getCidade() {
		return cidade;
	}

	public void setCidade(String cidade) {
		this.cidade = cidade;
	}

	public String getEstado() {
		return estado;
	}

	public void setEstado(String estado) {
		this.estado = estado;
	}
	
	public String toString(){
		return "Rua ;" + getRua() + "\nNumero ;" + getNumero() +
				"\nBairro ;" + getBairro()+ "\nCidade ;" + getCidade() +
				"\nEstado ;" + getEstado();
	}
}
