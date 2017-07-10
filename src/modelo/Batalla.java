package modelo;

public class Batalla extends Nave {

	private int potenciaDeAtaque;
		
	public Batalla(double posX, double posY) {
		super();
		this.ubicacion = new Punto(posX,posY);
		this.destino = new Punto(posX,posY);
		this.potenciaDeAtaque = 3;
	}

	public void avanzarTurno() {
		super.avanzarTurno();
	}
	
	public String getTipo(){
		return "Batalla";
	}
	
	public String toString() {

		return "\n  Soy una nave de batalla que transita el espacio en "
				+ this.ubicacion.toString();
	}

	public int getPotenciaDeAtaque() {
		return potenciaDeAtaque;
	}
}

