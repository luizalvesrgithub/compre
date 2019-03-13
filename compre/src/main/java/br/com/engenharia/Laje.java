package br.com.engenharia;

//https://www.youtube.com/watch?v=EIM9Z_NJJ7A em 25minutos
//public class VisaoGuiaDeEncaminhamento extends
//VisaoSiscorPostagemExterna<ControladorGuiaDeEncaminhamento> implements
//IGuiaDeEncaminhamento, IValidacaoObjetoPostal {
public class Laje {
	
	private static final float revestimento = 1.0f; // kN/m2
	private static final float pesopiso = 1.85f; // kN/m2
	private static final float sobrecarga = 1.5f; // kN/m2
	private static final float cargaespecifica = 177.5f; // kN/m2
	private static final double yf = 1.41;
	
	public static float getCargaespecifica() {
		return cargaespecifica;
	}
	
	public static float getPesopiso() {
		return pesopiso;
	}
	
	public static float getRevestimento() {
		return revestimento;
	}
	
	public static float getSobrecarga() {
		return sobrecarga;
	}
	
	private String tipo;
	private float x;
	private float y;
	private float h;
	private float heps;
	
	private float hcoberConcreto; // Altura da mesa
	
	private float xSuperiorDoEps;
	
	private float xInferiorDoEps;
	
	private float xDaVigota;
	
	private float areaDeInfluencia;
	
	private double cargaIncidente; // carga total * área de influência
	
	private double mCortante; // kN.m
	
	private double mFletor; // kN.m
	
	private double md; // Momento fletor de projeto
	
	private TabelaDoTipoK tabelatipok;
	
	private double bxparakc;
	
	private double ksparakc;
	
	private double areaDeAco;
	
	/**
	 * @param bw
	 * @param hutil
	 *            Cálculo da linha neutra é determinar a relação de x(profundidade
	 *            da linha neutra) por d(altura útil) ou seja bx = x/d; logo, x = bx
	 *            * d onde x é a profundidade da linha neutra ou o percentual
	 *            comprimido da viga ou ainda o deslocamento do eixo x. Se x estiver
	 *            situado na mesa, a viga será calculada como uma seção retangular;
	 *            caso contrário, como viga T
	 */
	public void calculaLinhaNeutra(double bw, double hutil) {
		
		// bw = 12 - (1.5 + 1.5) = 9cm para vigota treliçada largura da viga
		// d = hutil = 12 - 1.5 = 10.5cm para vigota treliçada o 1.5 refere-se à
		// cobertura
		// do aço
		// kc = (bw * d^2)/(yf*Mk) onde d é a altura útil
		// yf é o coeficiente de ponderação do concreto
		
		float cargatotal = revestimento + pesopiso + sobrecarga + cargaespecifica;
		getCalculoMomentosCortanteFletor(cargatotal, getX());
		setMd(yf * (mFletor * 100)); // yf * Mk
		double kc = (bw * hutil * hutil) / getMd();
		// kc recupera betax e para o concreto de 30MPa
		// ks para o ferro CA-25 a CA-60 30Mp C30
		double bx = getBetaxTabelaTipoK(kc, "C30", "CA50"); // valores serão recuperados da visão
		double ks = getKsTabelaTipoK(bx, "C30", "CA50"); // Valores serão recuperados da visão
		
		// Calcular a profundidade da linha neutra = d * bx onde d é a hutil
		
		double lx = hutil * bx; // Para verificar se a altura da linha neutra está na mesa
		if (lx < getHcoberConcreto())
			setAreaDeAco(ks * this.getMd() / hutil);
		else
			System.out.println("Aumente a altura da viga. Esta altura direcionará o cálculo para o domínio 3.");
		
	}
	
	public double getAreaDeAco() {
		return areaDeAco;
	}
	
	public float getAreaDeInfluencia() {
		return areaDeInfluencia;
	}
	
	private double getBetaxTabelaTipoK(double kc, String tipoconcreto, String tipoaco) {
		
		return getTabelatipok().getBx(kc, tipoconcreto, tipoaco);
	}
	
	public double getBxparakc() {
		return bxparakc;
	}
	
	public void getCalculoMomentosCortanteFletor(Float carga, float vaoviga) {
		// 181,85
		setCargaIncidente(carga * this.getAreaDeInfluencia());
		setmCortante((getCargaIncidente() * vaoviga) / 2); // kN.m
		setmFletor((getCargaIncidente() * Math.pow(vaoviga, 2)) / 8); // kN.m
	}
	
	public double getCargaIncidente() {
		return cargaIncidente;
	}
	
	public float getH() {
		return h;
	}
	
	public float getHcoberConcreto() {
		return hcoberConcreto;
	}
	
	public float getHeps() {
		return heps;
	}
	
	public double getKsparakc() {
		return ksparakc;
	}
	
	private double getKsTabelaTipoK(double betax, String string, String tipoaco) {
		return getTabelatipok().getKs(betax, string, tipoaco);
	}
	
	public double getmCortante() {
		return mCortante;
	}
	
	public double getMd() {
		return md;
	}
	
	public double getmFletor() {
		return mFletor;
	}
	
	public TabelaDoTipoK getTabelatipok() {
		return tabelatipok;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public float getX() {
		return x;
	}
	
	public float getxDaVigota() {
		return xDaVigota;
	}
	
	public float getxInferiorDoEps() {
		return xInferiorDoEps;
	}
	
	public float getxSuperiorDoEps() {
		return xSuperiorDoEps;
	}
	
	public float getY() {
		return y;
	}
	
	public void setAreaDeAco(double areaDeAco) {
		this.areaDeAco = areaDeAco;
	}
	
	public void setAreaDeInfluencia(float areaDeInfluencia) {
		this.areaDeInfluencia = areaDeInfluencia;
	}
	
	public void setBxparakc(double bxparakc) {
		this.bxparakc = bxparakc;
	}
	
	public void setCargaIncidente(double cargaIncidente) {
		this.cargaIncidente = cargaIncidente;
	}
	
	public void setH(float h) {
		this.h = h;
	}
	
	public void setHcoberConcreto(float hcoberConcreto) {
		this.hcoberConcreto = hcoberConcreto;
	}
	
	public void setHeps(float heps) {
		this.heps = heps;
	}
	
	public void setKsparakc(double ksparakc) {
		this.ksparakc = ksparakc;
	}
	
	public void setmCortante(double mCortante) {
		this.mCortante = mCortante;
	}
	
	public void setMd(double md) {
		this.md = md;
	}
	
	public void setmFletor(double mFletor) {
		this.mFletor = mFletor;
	}
	
	public void setTabelatipok(TabelaDoTipoK tabelatipok) {
		this.tabelatipok = tabelatipok;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
	
	public void setX(float x) {
		this.x = x;
	}
	
	public void setxDaVigota(float xDaVigota) {
		this.xDaVigota = xDaVigota;
	}
	
	public void setxInferiorDoEps(float xInferiorDoEps) {
		this.xInferiorDoEps = xInferiorDoEps;
	}
	
	public void setxSuperiorDoEps(float xSuperiorDoEps) {
		this.xSuperiorDoEps = xSuperiorDoEps;
	}
	
	public void setY(float y) {
		this.y = y;
	}
}