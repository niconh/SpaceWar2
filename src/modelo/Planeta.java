package modelo;

import java.util.*;

public abstract class Planeta extends ElementoDeJuego {

	
	
	protected int cantidadTorretas,
				  cantidadDeTurnosParaProducir;
	
	protected boolean produciendoTorretas,	
	                  produciendoNaveDeBatalla,
	                  produciendoNaveDestructor,
	                  produciendoNaveDeTransporte,
	                  aumentandoLaProduccion;
	
	protected List<Nave> naves = new ArrayList<Nave>();
	
	public void agregarNave(Nave nave){
		naves.add(nave);
	}
	
	public List<Nave> getNaves(){
		return this.naves;
	}
	
	//Jugamos con lo estatico
	private static int cantidadPlanetas = 0;
	
	public static int getCantidadPlanetas(){
		//Aca no existe el this
		return Planeta.cantidadPlanetas;		
	}

	
	public void avanzarTurno(){
		super.avanzarTurno();
	}
	
	
	public int getCantidadTorretas() {
		return cantidadTorretas;
	}

	public String getNombre() {
		return nombre;
	}

	public Planeta(String nombre, int cantidadDeTurnosParaProducir, int posY, int posX) {
		super();
		this.posX = posX;
		this.posY = posY;
		this.poblacion = 2;
		this.cantidadTorretas = 0;
		this.cantidadDeTurnosParaProducir = cantidadDeTurnosParaProducir;
		Planeta.cantidadPlanetas++;
		this.nombre = nombre;
		this.produciendoTorretas = false;
		this.produciendoNaveDeBatalla = false;
		this.produciendoNaveDestructor  = false;
		this.produciendoNaveDeTransporte = false;
		this.aumentandoLaProduccion = false;
	}

	public int getPoblacion(){
		return this.poblacion;
	}
	
	public void producirTorretas(){
		this.produciendoTorretas = true;
		this.produciendoNaveDeBatalla = false;
		this.produciendoNaveDestructor  = false;
		this.produciendoNaveDeTransporte = false;
		this.aumentandoLaProduccion = false;
	}
	
	public void producirNaveDeBatalla(){
		this.produciendoTorretas = false;
		this.produciendoNaveDeBatalla = true;
		this.produciendoNaveDestructor  = false;
		this.produciendoNaveDeTransporte = false;
		this.aumentandoLaProduccion = false;
	}
	
	public void producirNaveDestructor(){
		this.produciendoTorretas = false;
		this.produciendoNaveDeBatalla = false;
		this.produciendoNaveDestructor  = true;
		this.produciendoNaveDeTransporte = false;
		this.aumentandoLaProduccion = false;
	}
	
	public void producirNaveDeTransporte(){
		this.produciendoTorretas = false;
		this.produciendoNaveDeBatalla = false;
		this.produciendoNaveDestructor  = false;
		this.produciendoNaveDeTransporte = true;
		this.aumentandoLaProduccion = false;
	}
	
	public void aumentarLaProduccion(){
		this.produciendoTorretas = false;
		this.produciendoNaveDeBatalla = false;
		this.produciendoNaveDestructor  = false;
		this.produciendoNaveDeTransporte = false;
		this.aumentandoLaProduccion = true;
	}

	public void pararProduccion() {
		this.produciendoTorretas = false;
		this.produciendoNaveDeBatalla = false;
		this.produciendoNaveDestructor  = false;
		this.produciendoNaveDeTransporte = false;
		this.aumentandoLaProduccion = false;
		
	}



}
