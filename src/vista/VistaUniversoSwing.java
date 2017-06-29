package vista;

import javax.swing.JFrame;
import javax.swing.JTextArea;

import modelo.Jugador;
import modelo.Nave;
import modelo.Planeta;
import modelo.Universo;
import observer.IObservador;

public class VistaUniversoSwing extends JFrame implements IObservador {

	private static final long serialVersionUID = 1L;
	
	JTextArea universoVista;
	
	private Universo universo;
	
	public VistaUniversoSwing(Universo universo){
				
		this.setTitle("Universo");
		this.setSize(600,400);
		this.setLocation(10, 300);
		
		this.universo = universo;
		this.universo.registrarObservador(this);
		
    	//GridLayout layout = new GridLayout(2,0);
    	//this.getContentPane().setLayout(layout);
    	
    	universoVista = new JTextArea();
    	universoVista.setEditable(false);
    	universoVista.setText(" En el universo hay " + Planeta.getCantidadPlanetas() + " planetas\n\n Planetas sin conquitar:");
    	
    	for(Planeta p: universo.getPlanetas()){
    		universoVista.setText(universoVista.getText() + p.toString());
    	}
    	

		for (Jugador j: this.universo.getJugadores()){
			universoVista.setText(universoVista.getText() + j.toString());
			for(Planeta p: j.getPlanetas()){
				universoVista.setText(universoVista.getText() + p.toString());				
				int batalla=0;
				int destructor=0;
				int transporte=0;
				for(Nave n: p.getNaves()){
					if(n.getTipo().equals("Batalla"))
						batalla++;
					if(n.getTipo().equals("Destructor"))
						destructor++;
					if(n.getTipo().equals("Transporte"))
						transporte++;						
				}	
				String naves = new String(", " + batalla + " naves de batalla, " + 
									      + destructor + " naves destrcutoras y " + 
										  + transporte + " naves de transporte.");
				universoVista.setText(universoVista.getText() + naves);
			}
		}
    	
    	this.add(universoVista);
    	    	
	}

	public void Actualizar() {
		
		universoVista.setText(" En el universo hay " + Planeta.getCantidadPlanetas() + " planetas\n\n Planetas sin conquitar:");
    	
    	for(Planeta p: universo.getPlanetas()){
    		universoVista.setText(universoVista.getText() + p.toString());
    	}
    	

		for (Jugador j: this.universo.getJugadores()){
			universoVista.setText(universoVista.getText() + j.toString());
			for(Planeta p: j.getPlanetas()){
				universoVista.setText(universoVista.getText() + p.toString());				
				int batalla=0;
				int destructor=0;
				int transporte=0;
				for(Nave n: p.getNaves()){
					if(n.getTipo().equals("Batalla"))
						batalla++;
					if(n.getTipo().equals("Destructor"))
						destructor++;
					if(n.getTipo().equals("Transporte"))
						transporte++;						
				}	
				String naves = new String(", " + batalla + " naves de batalla, " + 
									      + destructor + " naves destrcutoras y " + 
										  + transporte + " naves de transporte.");
				universoVista.setText(universoVista.getText() + naves);
			}
		}
		
	}
	

}
