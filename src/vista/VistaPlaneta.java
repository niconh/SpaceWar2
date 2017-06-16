package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Planeta;

public class VistaPlaneta extends JFrame {

	private static final long serialVersionUID = 1L;

	JButton botonPlaneta;
	
	public VistaPlaneta(List<Planeta> planetas, final String nombreJugador){
		
		this.setTitle("Planetas del jugador " +nombreJugador);
		this.setSize(400,400);
		this.setLocation(410, 10);
		
		GridLayout layout = new GridLayout(10,0);
		this.getContentPane().setLayout(layout);
		
    	JLabel label = new JLabel();
    	label.setText(" Elegir planeta para realizar un proceso");
    	this.add(label);
		
		for(final Planeta p: planetas){
			botonPlaneta = new JButton();
			botonPlaneta.setText(p.getNombre());
			botonPlaneta.addActionListener(				
					new ActionListener(){
						public void actionPerformed(ActionEvent e){
							JFrame f = new VistaAccionesPlaneta(p,nombreJugador);
							f.setVisible(true);
						}
					}
				);
			
	    	this.add(botonPlaneta);
		}
		
		
		
	}

}
