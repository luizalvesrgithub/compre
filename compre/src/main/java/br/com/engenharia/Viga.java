package br.com.engenharia;

public class Viga extends ElementoEstrutural implements ICalculaViga {
	
	private Dimensao secaoViga;
	private Dimensao entreApoios; // Comprimento da viga
	private String tipoApoio; // Engastamento
	private String classeConcreto;
	private String classeAco;
	
	@Override
	public double calculaAlturaLinhaNeutra() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double calculaAreaAco() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double calculaEsforcoCortante() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public double calculaMomentoFletor() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public String getClasseAco() {
		return classeAco;
	}
	
	public String getClasseConcreto() {
		return classeConcreto;
	}
	
	public Dimensao getEntreApoios() {
		return entreApoios;
	}
	
	public Dimensao getSecaoViga() {
		return secaoViga;
	}
	
	public String getTipoApoio() {
		return tipoApoio;
	}
	
	public void setClasseAco(String classeAco) {
		this.classeAco = classeAco;
	}
	
	public void setClasseConcreto(String classeConcreto) {
		this.classeConcreto = classeConcreto;
	}
	
	public void setEntreApoios(Dimensao entreApoios) {
		this.entreApoios = entreApoios;
	}
	
	public void setSecaoViga(Dimensao secaoViga) {
		this.secaoViga = secaoViga;
	}
	
	public void setTipoApoio(String tipoApoio) {
		this.tipoApoio = tipoApoio;
	}
	
}
