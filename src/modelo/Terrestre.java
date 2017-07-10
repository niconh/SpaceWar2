package modelo;

public class Terrestre extends Planeta {
	
	private int poblacion_maxima = 9999999;
	 
	public Terrestre(String nombre) {
		super(nombre,1,3,3);
	}

	public void avanzarTurno(){
		super.avanzarTurno();
		//En el planeta la poblacion crece linealmente
		if(this.poblacion < poblacion_maxima){
			this.poblacion = this.turnoActualElemento * this.turnoActualElemento;
		}
		
		if(this.produciendoTorretas){
			if(this.turnoActualElemento % (this.cantidadDeTurnosParaProducir) == 0){
				this.cantidadTorretas++;
			}
		}
		
		if(this.produciendoNaveDeBatalla){
			if(this.turnoActualElemento % (this.cantidadDeTurnosParaProducir) == 0){
				this.naves.add(new Batalla(this.ubicacion.getX(),this.ubicacion.getY()));
			}	
		}
		
		if(this.produciendoNaveDestructor){
			if(this.turnoActualElemento % (this.cantidadDeTurnosParaProducir) == 0){
				this.naves.add(new Destructor(this.ubicacion.getX(),this.ubicacion.getY()));
			}
		}
		
		if(this.produciendoNaveDeTransporte){
			if(this.turnoActualElemento % (this.cantidadDeTurnosParaProducir) == 0){
				this.naves.add(new Transporte(this.ubicacion.getX(),this.ubicacion.getY()));
			}
		}
		
		if(this.aumentandoLaProduccion){
			if(this.turnoActualElemento % (this.cantidadDeTurnosParaProducir) == 0){
				if(this.cantidadDeTurnosParaProducir > 1)
					this.cantidadDeTurnosParaProducir--;
			}
		}
	}

	
	public String toString() {

		return "\n El planeta " + this.nombre
				+ " tiene una población de " + this.poblacion + " habitantes.\n"
				+ "  Posee " + this.cantidadTorretas + " de torretas de defensa";
	}

}
