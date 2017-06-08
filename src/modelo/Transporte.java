package modelo;

public class Transporte extends Nave {
	
	private int dirX;
	private int dirY;
	
	private int capacidadMaxDePersonas;
		
	public Transporte(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.capacidadMaxDePersonas = 100;
		this.dirX = 0;
		this.dirY = 0;
	}

	public void avanzarTurno() {
		super.avanzarTurno();
		this.posX = this.posX + this.dirX;
		this.posY = this.posY + this.dirY;
	}
	
	
	
	public int getPosX() {
		return posX;
	}

	public int getPosY() {
		return posY;
	}

	public int getDirX() {
		return dirX;
	}

	public int getDirY() {
		return dirY;
	}
	
	
	
	public void setDirX(int dirX) {
		this.dirX = dirX;
	}

	public void setDirY(int dirY) {
		this.dirY = dirY;
	}

	public String toString() {

		return "  Soy una nave de transporte que transita el espacio en "
				+ this.posX + " " + this.posY + ".";
	}

	public int getCapacidadMaxDePersonas() {
		return capacidadMaxDePersonas;
	}

}
