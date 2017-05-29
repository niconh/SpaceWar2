package modelo;

public class Congelado extends Planeta{

	private int poblacion_maxima = 9999;
	
	public Congelado(String nombre) {
		super(nombre,1,7,7);
	}

	public void avanzarTurno(){
		super.avanzarTurno();
		//En el planeta la poblacion crece linealmente
		if(this.poblacion < poblacion_maxima){
			this.poblacion = this.turnoActualElemento * 2;
		}
	}

	public String toString() {
		// TODO Auto-generated method stub
		return "El planeta " + this.nombre + " esta en gran parte congelado"
				+ " y tiene una poblacion de " + this.poblacion + " habitantes.\n"
				+ "  Posee " + this.cantidadTorretas + " de torreta/s de defensa.";
		
	}
}
