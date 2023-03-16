package poo.ad1.models;

public class Produto extends CodigoSequencial{

	private String descricao;
	private Double preco;
		
	public Produto() {
		
	}
	
	public Produto(String descricao, Double preco) {
		this.descricao = descricao;
		this.preco = preco;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Integer getCodigoSequencial() {
		return codigoSequencial;
	}

	public void setCodigoSequencial(Integer codigoSequencial) {
		this.codigoSequencial = codigoSequencial;
	}

	@Override
	public String toString() {
		return "Produto [descricao=" + descricao + ", preco=" + preco + "]";
	}		
}