package poo.ad1.models;

public class Memoria extends Placa {

	public Memoria(String descricao, Integer capacidadeEmGigabyte, Double preco) {
		super(descricao, capacidadeEmGigabyte, preco);
		CodigoSequencial.totalDeItens += 1;
		this.codigoSequencial = CodigoSequencial.totalDeItens;
	}

	@Override
	public String toString() {
		return "Memoria [nome = " + getDescricao() + ", capacidade em GB = " + getCapacidadeEmGigabyte()
				+ "GB, preço = R$ " + getPreco() + "]";
	}
		
}