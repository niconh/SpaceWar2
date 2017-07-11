package modelo;

import java.util.*;

public abstract class Nave extends ElementoDeJuego {
	
	protected Punto destino;
	protected int potenciaDeAtaque;
	protected boolean exploto;
	protected List<Nave> navesQueMeAtacan = new ArrayList<Nave>();
	
	public Nave() {
		super();
		this.exploto = false;
	}
	
	public abstract String getTipo();
	
	public int getPotenciaDeAtaque() {
		return potenciaDeAtaque;
	}
	
	public void recibirAtaque(Nave nave){
		
		this.navesQueMeAtacan.add(nave);
		
	}
	
	public void avanzarTurno(){
		
		if(this.ubicacion.getX() != this.destino.getX() || this.ubicacion.getY() != this.destino.getY()){
		
			double vdx = this.destino.getX() - this.ubicacion.getX();
			double vdy = this.destino.getY() - this.ubicacion.getY();
		
			double norma = Math.sqrt( Math.pow(vdx, 2) + Math.pow(vdy, 2) ) ;
		
			double vux = (vdx / norma)*3;
			double vuy = (vdy / norma)*3;
		
			this.ubicacion.setX(this.ubicacion.getX()+vux);
			this.ubicacion.setY(this.ubicacion.getY()+vuy);
			
			if((this.ubicacion.getX() / this.destino.getX() >= 0.85 && this.ubicacion.getX()/ this.destino.getX() <= 1.15)
					|| (this.ubicacion.getY() / this.destino.getY() >= 0.85 && this.ubicacion.getY()/ this.destino.getY() <= 1.15)){
				this.ubicacion.setX(destino.getX());
				this.ubicacion.setY(destino.getY());
			}
		}
		
		for(Nave n: this.navesQueMeAtacan){ 
			if(n.ubicacion.getX() == this.ubicacion.getX() && n.ubicacion.getY() == this.ubicacion.getY() && !n.isExploto()){
				if(this.puntosDeVida - n.getPotenciaDeAtaque() > 0){
					this.puntosDeVida = this.puntosDeVida - n.getPotenciaDeAtaque();
				}
				else{
					this.exploto = true;
				}
			}	
		}
		
		
		this.actualizarObservadores();
		
	}

	public void setDestino(Punto destino) {
		this.destino = destino;
	}

	public boolean isExploto() {
		return exploto;
	}

	


}
