package modelo;

public class Lava extends Planeta {

	private int poblacion_maxima = 99999;
	
	public Lava(String nombre) {
		super(nombre,2,4,4);
	}

	public void avanzarTurno(){
		super.avanzarTurno();
		//En el planeta la poblacion crece linealmente
		if(this.poblacion < poblacion_maxima){
			this.poblacion = this.turnoActualElemento * 3;
		}
		
		if(this.produciendoTorretas){
			if(this.turnoActualElemento % (this.cantidadDeTurnosParaProducir) == 0){
				this.cantidadTorretas++;
			}
		}
		
		if(this.produciendoNaveDeBatalla){
			if(this.turnoActualElemento % (this.cantidadDeTurnosParaProducir) == 0){
				this.naves.add(new Batalla(this.posX,this.posY));
			}	
		}
		
		if(this.produciendoNaveDestructor){
			if(this.turnoActualElemento % (this.cantidadDeTurnosParaProducir) == 0){
				this.naves.add(new Destructor(this.posX,this.posY));
			}
		}
		
		if(this.produciendoNaveDeTransporte){
			if(this.turnoActualElemento % (this.cantidadDeTurnosParaProducir) == 0){
				this.naves.add(new Transporte(this.posX,this.posY));
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
		// TODO Auto-generated method stub
		return " El planeta " + this.nombre + " esta cubierto de rios de lava pero tiene"
				+ " una población de " + this.poblacion + " habitantes.\n"
				+ "  Posee " + this.cantidadTorretas + " de torretas de defensa.";
	}

	
}
