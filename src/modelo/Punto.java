package modelo;

import java.text.DecimalFormat;

public class Punto {
	
	private double x;
	private double y;
	
	public Punto(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double calcularDistancia(Punto a){	
		return Math.sqrt(Math.pow((this.x - a.x), 2) + Math.pow((this.y - a.y), 2));
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}
	
	

	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("#.00");
		return "(" + df.format(this.x) + ", " + df.format(this.y) + ")";
	}

}
