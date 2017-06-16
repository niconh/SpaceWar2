package modelo;

import java.util.*;

public class Universo extends ElementoDeJuego {
	
	private boolean juegoFinalizado;
	
	public boolean isJuegoFinalizado() {
		return juegoFinalizado;
	}
	
	public void setJuegoFinalizado(boolean juegoFinalizado) {
		this.juegoFinalizado = juegoFinalizado;
	}

	private List<Jugador> jugadores = new ArrayList<Jugador>();
	
	public List<Jugador> getJugadores(){
		return this.jugadores;
	}
	
	private List<Planeta> planetas = new ArrayList<Planeta>();
	

	public List<Planeta> getPlanetas(){
		return this.planetas;
	}
	
	public void avanzarTurno(){
		super.avanzarTurno();
		//Avanzo el turno de todos los elementos del juego
		for(Planeta p : this.planetas){
			p.avanzarTurno();
		}
		
		for(Jugador j : this.jugadores){
			j.avanzarTurno();
		}
		
		this.actualizarObservadores();
	}
		
	public Universo(){
		
		this.juegoFinalizado = false;
		
		Jugador player1 = new Jugador("Nico");
		Jugador player2 = new Jugador("Nacho");
		
		jugadores.add(player1);
		jugadores.add(player2);
		
		Planeta tierra = new Terrestre("Tierra");
		Planeta marte = new Lava("Marte");
		Planeta venus = new Lava("Venus");
		Planeta pluton = new Congelado("Pluton");
		Planeta neptuno = new Congelado("Neptuno");
		Planeta melmak = new Congelado("Melmak");
		Planeta krypton = new Lava("Krypton");
		
		player1.agregarPlaneta(tierra);	
		player1.agregarPlaneta(krypton);
		
		player2.agregarPlaneta(venus);
		player2.agregarPlaneta(melmak);
		
		this.planetas.add(marte);
		this.planetas.add(pluton);
		this.planetas.add(neptuno);

	}

}
