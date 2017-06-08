package vista;

import observer.IObservador;
import modelo.*;

public class VistaUniverso implements IObservador {
	
	private Universo universo;
	
	public VistaUniverso(Universo universo){
		this.universo = universo;
	}

	public void Actualizar() {
		System.out.println("**************************************");
		System.out.println(" El universo tiene " + Planeta.getCantidadPlanetas() + " planetas.");
		System.out.println("**************************************");
	
		for(Planeta p: this.universo.getPlanetas()){
			System.out.println(p.toString());
		}
		
		for (Jugador j: this.universo.getJugadores()){
			System.out.println(j.toString());
			for(Planeta p: j.getPlanetas()){
				System.out.println(p.toString());
				for(Nave n: p.getNaves()){
					System.out.println(n.toString());
				}	
			}
		}
		
		
		
	}

}
