package poo.ad1.models;

public class Placa extends Produto{

	private Integer capacidadeEmGigabyte;

	
	public Placa(String descricao, Integer capacidadeEmGigabyte, Double preco) {
		super();
		this.capacidadeEmGigabyte = capacidadeEmGigabyte;
		CodigoSequencial.totalDeItens += 1;
		this.codigoSequencial = CodigoSequencial.totalDeItens;
	}

	public Integer getCapacidadeEmGigabyte() {
		return capacidadeEmGigabyte;
	}

	public void setCapacidadeEmGigabyte(Integer capacidadeEmGigabyte) {
		this.capacidadeEmGigabyte = capacidadeEmGigabyte;
	}


	public Integer getCodigoSequencial() {
		return codigoSequencial;
	}

	public void setCodigoSequencial(Integer codigoSequencial) {
		this.codigoSequencial = codigoSequencial;
	}

	@Override
	public String toString() {
		return "Placa [descricao=" + getDescricao() + ", capacidadeEmGigabyte=" + capacidadeEmGigabyte + ", preco=" + getPreco()
				+ "]";
	}
}