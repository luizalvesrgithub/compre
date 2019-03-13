package br.com.engenharia;

import java.io.IOException;

public class CalculaElementos implements ICalculaElementos {
	
	public static void main(String[] args) throws IOException {
		CalculaElementos ce = new CalculaElementos();
		
		Dimensao d = new Dimensao();
		d.setX(1.65f);
		d.setY(20.0f);
		d.setZ(10.0f);
		ce.setLaje(new Laje());
		ce.calculaLaje(ce.laje, "1", d, 177.5f);
		System.out.println("Area de aço = " + ce.getLaje().getAreaDeAco());
	}
	
	private Laje laje;
	private Viga viga;
	private Pilar pilar;
	private Bloco bloco;
	private Estaca estaca;
	
	private Sapata sapata;
	
	@Override
	public float calculaBloco(String tipo, Dimensao d, Float carga) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public float calculaEstaca(String tipo, Dimensao d, Float carga) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public float calculaLaje(Laje l, String tipo, Dimensao d, Float carga) {
		
		l.setX(1.65f);
		l.setY(2.0f);
		l.setH(30.0f);
		l.setHcoberConcreto(5.0f);
		l.setHeps(8.0f);
		l.setAreaDeInfluencia(0.42f);
		l.setxInferiorDoEps(30.0f);
		l.setxSuperiorDoEps(33.0f);
		l.setxDaVigota(12.0f);
		l.setTabelatipok(new TabelaDoTipoK());
		
		l.calculaLinhaNeutra(l.getxDaVigota() - 3, l.getH() - 1.5f);
		
		System.out.println("Área de aço = " + l.getAreaDeAco());
		this.setLaje(laje);
		return 0;
	}
	
	@Override
	public float calculaPilar(String tipo, Dimensao d, Float carga) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public float calculaSapata(String tipo, Dimensao d, Float carga) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public float calculaViga(String tipo, Dimensao d, Float carga) {
		// TODO Auto-generated method stub
		return 0;
	}
	
	public Bloco getBloco() {
		return bloco;
	}
	
	public Estaca getEstaca() {
		return estaca;
	}
	
	public Laje getLaje() {
		return laje;
	}
	
	public Pilar getPilar() {
		return pilar;
	}
	
	public Sapata getSpata() {
		return sapata;
	}
	
	public Viga getViga() {
		return viga;
	}
	
	public void setBloco(Bloco bloco) {
		this.bloco = bloco;
	}
	
	public void setEstaca(Estaca estaca) {
		this.estaca = estaca;
	}
	
	public void setLaje(Laje laje) {
		this.laje = laje;
	}
	
	public void setPilar(Pilar pilar) {
		this.pilar = pilar;
	}
	
	public void setSpata(Sapata spata) {
		this.sapata = spata;
	}
	
	public void setViga(Viga viga) {
		this.viga = viga;
	}
	
}
