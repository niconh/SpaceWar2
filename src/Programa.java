import controlador.*;
import vista.*;
import modelo.*;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Universo universo = new Universo();
		
		VistaUniverso vista = new VistaUniverso(universo);
		
		ControladorTurno controlador = new ControladorTurno(50, universo);
		
		universo.registrarObservador(vista);
		
		controlador.ejecutar();
		
	
	}

}
