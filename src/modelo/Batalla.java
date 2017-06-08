package modelo;

public class Batalla extends Nave {


	private int potenciaDeAtaque;
		
	public Batalla(int posX, int posY) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.potenciaDeAtaque = 3;
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

	
	public String toString() {

		return "  Soy una nave de batalla que transita el espacio en "
				+ this.posX + " " + this.posY + ".";
	}

	public int getPotenciaDeAtaque() {
		return potenciaDeAtaque;
	}
 

}

