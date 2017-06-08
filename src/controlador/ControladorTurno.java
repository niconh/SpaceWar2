package controlador;

import java.io.IOException;

import javax.swing.JFrame;

import modelo.*;


import vista.*;

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
			
			for(Jugador j: this.universo.getJugadores()){
				
				for(Planeta p: j.getPlanetas()){
					
					VistaAccionesPlaneta vistaAccionesPlaneta = new VistaAccionesPlaneta(j.getNombre(),p.getNombre());
			        		
			        vistaAccionesPlaneta.setVisible(true);
			        
			        //p.pararProduccion();
			        
			        
			        try{
			        	while(!vistaAccionesPlaneta.isAvanzarTurno()){
			        		Thread.sleep(100);
			        	}
			        }catch (Exception e){
			        	
			        }
			        
					
		
					 if(vistaAccionesPlaneta.isProduciendoTorretas())
						 p.producirTorretas();					 
					 if(vistaAccionesPlaneta.isProduciendoNaveDeBatalla())
						 p.producirNaveDeBatalla();
					 if(vistaAccionesPlaneta.isProduciendoNaveDestructor())
						 p.producirNaveDestructor();
					 if(vistaAccionesPlaneta.isProduciendoNaveDeTransporte())
						 p.producirNaveDeTransporte();
					 if(vistaAccionesPlaneta.isAumentandoLaProduccion())
						 p.aumentarLaProduccion();
					 
					 vistaAccionesPlaneta.dispose();
					
				}
			}
			
					
//			try {
//				System.in.read();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
			
			this.universo.avanzarTurno();
			
			
			
		}
	}
	
	

}
