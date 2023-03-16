package poo.ad1.models;

public class CodigoSequencial {

	protected Integer codigoSequencial = 0;
	protected static Integer totalDeItens = 0;
	
	public Integer getCodigoSequencial() {
		return codigoSequencial;
	}
	public void setCodigoSequencial(Integer codigoSequencial) {
		this.codigoSequencial = codigoSequencial;
	}
	public static Integer getTotalDeItens() {
		return totalDeItens;
	}
	public static void setTotalDeItens(Integer totalDeItens) {
		CodigoSequencial.totalDeItens = totalDeItens;
	}
		
}