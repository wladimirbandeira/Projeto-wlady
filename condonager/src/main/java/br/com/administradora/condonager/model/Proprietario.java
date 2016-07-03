package br.com.administradora.condonager.model;

import org.hibernate.validator.constraints.NotBlank;

public class Proprietario {

	@NotBlank(message = "SKU é obrigatório")
	private String sku;
	
	@NotBlank(message = "Nome é obrigatório")
	private String nome;

	public String getSku() {
		return sku;
	}

	public void setSku(String sku) {
		this.sku = sku;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
