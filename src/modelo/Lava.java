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
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "El planeta " + this.nombre + " es de lava"
				+ " con " + this.poblacion + " habitantes.\n"
				+ "  Posee " + this.cantidadTorretas + " de torreta/s de defensa.";
	}

	
}
