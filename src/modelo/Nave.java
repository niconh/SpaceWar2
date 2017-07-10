package modelo;

public abstract class Nave extends ElementoDeJuego {
	
	protected Punto destino;
	
	public Nave() {
		super();
	}
	
	public abstract String getTipo();
	
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
		
		this.actualizarObservadores();
		
	}

	public void setDestino(Punto destino) {
		this.destino = destino;
	}

	


}
