package br.com.engenharia;

public class ElementoEstrutural extends ConstantesEngenharia {
	
	private String tipo; // Viga, laje, sapata, bloco, pilar, grelha, capa, etc.
	private String id;
	private Integer projeto;
	private String descricaoElemento; // V1, V2, P1, P2...
	private String tipoMaterialEstrutural; // Concreto Armado, Ferro, Madeira, Alvenaria estrutural
	
	public String getDescricaoElemento() {
		return descricaoElemento;
	}
	
	public String getId() {
		return id;
	}
	
	public Integer getProjeto() {
		return projeto;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public String getTipoMaterialEstrutural() {
		return tipoMaterialEstrutural;
	}
	
	public void setDescricaoElemento(String descricaoElemento) {
		this.descricaoElemento = descricaoElemento;
	}
	
	public void setId(String id) {
		this.id = id;
	}
	
	public void setProjeto(Integer projeto) {
		this.projeto = projeto;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setTipoMaterialEstrutural(String tipoMaterialEstrutural) {
		this.tipoMaterialEstrutural = tipoMaterialEstrutural;
	}
	
}
