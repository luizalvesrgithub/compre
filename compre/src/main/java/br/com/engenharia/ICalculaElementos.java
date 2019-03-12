package br.com.engenharia;

public interface ICalculaElementos {
	
	public float calculaBloco(String tipo, Dimensao d, Float carga);
	
	public float calculaEstaca(String tipo, Dimensao d, Float carga);
	
	public float calculaLaje(Laje l, String tipo, Dimensao d, Float carga);
	
	public float calculaLaje(String tipo, Dimensao d, Float carga);
	
	public float calculaPilar(String tipo, Dimensao d, Float carga);
	
	public float calculaSapata(String tipo, Dimensao d, Float carga);
	
	public float calculaViga(String tipo, Dimensao d, Float carga);
}
