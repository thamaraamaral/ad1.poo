package poo.ad1.models;

public class Teclado extends Produto{

	public Teclado(String descricao, Double preco) {
		super(descricao, preco);
		CodigoSequencial.totalDeItens += 1;
		this.codigoSequencial = CodigoSequencial.totalDeItens;
	}

	@Override
	public String toString() {
		return "Teclado [nome = " + getDescricao() + ", preco: R$" + getPreco() + "]";
	}

}