package poo.ad1.models;

public class Processador extends Produto {

	public Processador(String descricao, Double preco) {
		super(descricao, preco);
		CodigoSequencial.totalDeItens += 1;
		this.codigoSequencial = CodigoSequencial.totalDeItens;
	}

	@Override
	public String toString() {
		return "Processador [nome =" + getDescricao() + ", preco = R$ " + getPreco() + "]";
	}
}