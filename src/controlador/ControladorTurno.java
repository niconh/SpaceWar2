package controlador;

import modelo.Universo;

public class ControladorTurno {
	
	private int cantidadTurnos;
	private int turnoActual;
	private Universo universo;

	public ControladorTurno(int cantidadTurnos, Universo universo) {
		super();
		this.cantidadTurnos = cantidadTurnos;
		this.turnoActual=1;
		this.universo = universo;
	}
	
	public void ejecutar(){
		
		if(turnoActual < cantidadTurnos){
			turnoActual++;
			universo.avanzarTurno();		
		}
		else{
			universo.setJuegoFinalizado(true);
		}
	}

	public int getTurnoActual() {
		return turnoActual;
	}



}
