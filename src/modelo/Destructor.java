package modelo;

public class Destructor extends Nave {
	
	
	public Destructor(double posX, double posY) {
		super();
		this.ubicacion = new Punto(posX,posY);
		this.destino = new Punto(posX,posY);
		this.potenciaDeAtaque = 8;
		this.puntosDeVida = 20;
	}

	public void avanzarTurno() {
		super.avanzarTurno();
	}
	
	
	public String getTipo(){
		return "Destructor";
	}
	
	public String toString() {

		return "\n  Soy una nave destructor que transita el espacio en "
				+ this.ubicacion.toString();
	}

}
