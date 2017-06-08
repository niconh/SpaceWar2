package vista;

import observer.IObservador;
import modelo.*;

public class VistaUniverso implements IObservador {
	
	private Universo universo;
	
	public VistaUniverso(Universo universo){
		this.universo = universo;
	}

	public void Actualizar() {
		System.out.println("            Universo");
		System.out.println("*********************************");
		
		
		
		for(ElementoDeJuego e: this.universo.getElementos()){
			System.out.println(e.toString());
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
		
		System.out.println("*********************************");
		
	}

}
