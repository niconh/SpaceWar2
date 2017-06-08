package modelo;

import java.util.*;

public class Universo extends ElementoDeJuego {
	
	private List<Jugador> jugadores = new ArrayList<Jugador>();
	
	public List<Jugador> getJugadores(){
		return this.jugadores;
	}
	
	private List<ElementoDeJuego> elementos = new ArrayList<ElementoDeJuego>();
	
	public List<ElementoDeJuego> getElementos(){
		return this.elementos;
	}
	

	
	public void avanzarTurno(){
		super.avanzarTurno();
		//Avanzo el turno de todos los elementos del juego
		for(ElementoDeJuego e : this.elementos){
			e.avanzarTurno();
		}
		
		for(Jugador j : this.jugadores){
			j.avanzarTurno();
		}
		
		this.actualizarObservadores();
	}
		
	public Universo(){
		
		Jugador player1 = new Jugador("Nico");
		Jugador player2 = new Jugador("Nacho");
		
		jugadores.add(player1);
		jugadores.add(player2);
		
		Planeta tierra = new Terrestre("Tierra");
		Planeta marte = new Lava("Marte");
		Planeta venus = new Lava("Venus");
		Planeta pluton = new Congelado("Pluton");
		Planeta neptuno = new Congelado("Neptuno");
		
		player1.agregarPlaneta(tierra);	
		player2.agregarPlaneta(venus);
		
		this.elementos.add(marte);
		this.elementos.add(pluton);
		this.elementos.add(neptuno);

	}

}
