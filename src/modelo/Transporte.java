package modelo;

public class Transporte extends Nave {
	
	
	private int capacidadMaxDePersonas;
		
	public Transporte(double posX, double posY) {
		super();
		this.ubicacion = new Punto(posX,posY);
		this.destino = new Punto(posX,posY);
		this.capacidadMaxDePersonas = 100;
		this.puntosDeVida = 30;
	}

	public void avanzarTurno() {
		super.avanzarTurno();

	}
	

	public String getTipo(){
		return "Transporte";
	}

	public String toString() {

		return "\n  Soy una nave de transporte que transita el espacio en "
				+ this.ubicacion.toString() + " con " + this.getPuntosDeVida() + " puntos de vida.";
	}

	public int getCapacidadMaxDePersonas() {
		return capacidadMaxDePersonas;
	}

	@Override
	public int getPotenciaDeAtaque() {
		// TODO Auto-generated method stub
		return 0;
	}

}
