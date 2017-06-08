package modelo;

import java.util.ArrayList;
import java.util.List;

import observer.*;

public class Jugador extends Observado {

	private String nombre;
	
	private List<Planeta> planetas = new ArrayList<Planeta>();
	
	public void agregarPlaneta (Planeta planeta){
		planetas.add(planeta);
	}
	

		
	public List<Planeta> getPlanetas(){
		return this.planetas;
	}
	
	public void avanzarTurno(){
		for(Planeta p : this.planetas){
			p.avanzarTurno();
			for(ElementoDeJuego n: p.getNaves()){
				n.avanzarTurno();
			}
		}
	}
	

	public Jugador(String nombre) {
		super();
		this.setNombre(nombre);
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String toString() {

		return "\nEl jugador " + this.getNombre() + " es dueño de:";
	}
	
}
