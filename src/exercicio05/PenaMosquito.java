package exercicio05;

public class PenaMosquito implements Escrever {
	
	private String ehFeitoDe;
	private String escreveCom;
	
	public void setEhFeitoDe(String ehFeitoDe) {
		this.ehFeitoDe = ehFeitoDe;
	}
	
	public String getEhFeitoDe() {
		return ehFeitoDe;
	}
	
	public void setEscreveCom(String escreveCom) {
		this.escreveCom = escreveCom;
	}
	
	public String getEscreveCom() {
		return escreveCom;
	}
	
	@Override
	public String escrever() {
		System.out.println("Escrevendo com Nanquim");
		return escreveCom;
	}
	
}
