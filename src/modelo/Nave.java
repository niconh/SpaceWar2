package modelo;

public class Nave extends ElementoDeJuego {
	
	protected int dirX;
	protected int dirY;
	
	public Nave() {
		super();
		this.dirX = 0;
		this.dirY = 0;
	}
	
	public void setDireccion(int dirX, int dirY) {
		this.dirX = dirX;
		this.dirY = dirY;
	}
	
	
	
	

}
