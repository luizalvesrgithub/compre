package br.com.engenharia;

public class Dimensao {
	
	private float x;
	public float getX() {
		return x;
	}
	public void setX(float x) {
		this.x = x;
	}
	public float getY() {
		return y;
	}
	public void setY(float y) {
		this.y = y;
	}
	public float getZ() {
		return z;
	}
	public void setZ(float z) {
		this.z = z;
	}
	private float y;
	private float z;
	private float angulo;
	private float densidade;
	public float getDensidade() {
		return densidade;
	}
	public void setDensidade(float densidade) {
		this.densidade = densidade;
	}
	public float getAngulo() {
		return angulo;
	}
	public void setAngulo(float angulo) {
		this.angulo = angulo;
	}

}
