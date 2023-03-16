package poo.ad1.models;

public class Computador extends CodigoSequencial {

	private String nome;
	private Gabinete gabinete;
	private Monitor monitor;
	private Teclado teclado;
	
	public Computador(String nome) {
		super();
		this.nome = nome;
		CodigoSequencial.totalDeItens += 1;
		this.codigoSequencial = CodigoSequencial.totalDeItens;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Gabinete getGabinete() {
		return gabinete;
	}

	public void setGabinete(Gabinete gabinete) {
		this.gabinete = gabinete;
	}

	public Monitor getMonitor() {
		return monitor;
	}

	public void setMonitor(Monitor monitor) {
		this.monitor = monitor;
	}

	public Teclado getTeclado() {
		return teclado;
	}

	public void setTeclado(Teclado teclado) {
		this.teclado = teclado;
	}

	public void inclui(Gabinete gabinete) {
		setGabinete(gabinete);
	}
	
	public void inclui(Monitor monitor) {
		setMonitor(monitor);
	}
	
	public void inclui(Teclado teclado) {
		setTeclado(teclado);
	}
	
	@Override
	public String toString() {
		return "Computador => " 	+ nome 		+ "\n"
				+ "gabinete => " 	+ gabinete 	+ "\n"
				+ "monitor => " 	+ monitor 	+ "\n"
				+ "teclado => "		+ teclado	+ "\n";
	}
	
}
