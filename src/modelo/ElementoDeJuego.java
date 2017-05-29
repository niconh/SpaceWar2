package modelo;

import observer.Observado;

public abstract class ElementoDeJuego extends Observado {
	
	protected int poblacion;
	protected String nombre;
	protected int posX = 0;
	protected int posY = 0;
	
	protected int puntosDeVida;

	
	
	protected int turnoActualElemento = 0;
	
	public void avanzarTurno(){
		this.turnoActualElemento++;
	}
	


}
