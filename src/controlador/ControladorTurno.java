package controlador;

import java.io.IOException;

import modelo.*;

public class ControladorTurno {
	
	private int cantidadTurnos;
	private Universo universo;
	
	
	public ControladorTurno(int cantidadTurnos, Universo universo) {
		super();
		this.cantidadTurnos = cantidadTurnos;
		this.universo = universo;
	}
	
	public void ejecutar(){
		for(int i=0; i<this.cantidadTurnos; i++){
			
			try {
				System.in.read();
			} catch (IOException e) {
				e.printStackTrace();
			}
			
			if(i==4) this.universo.getJugadores().get(0).getPlanetas().get(0).producirNaveDeBatalla();
			
			//if(i==4) this.universo.getJugadores().get(0).getPlanetas().get(0).producirNaveDestructor();
			
			if(i==0) this.universo.getJugadores().get(0).getPlanetas().get(0).producirTorretas();
			
			if(i==8) this.universo.getJugadores().get(0).getPlanetas().get(0).getNaves().get(0).setDireccion(1, 1);
			
			this.universo.avanzarTurno();
			
			
			
		}
	}
	
	

}
