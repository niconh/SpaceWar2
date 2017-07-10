package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Nave;
import modelo.Planeta;

public class VistaNaves extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	public VistaNaves(List<Nave> naves, final String nombreJugador){
		
		JButton botonNave;
		
		this.setTitle("Naves del jugador " + nombreJugador);
		this.setSize(300,300);
		this.setLocation(1010, 0);
		
		GridLayout layout = new GridLayout(10,0);
		this.getContentPane().setLayout(layout);
		
    	JLabel label = new JLabel();
    	label.setText(" Elegir nave para realizar una accion sobre ella");
    	this.add(label);
		
		for(final Nave n: naves){
			botonNave = new JButton();
			botonNave.setText("Nave " + n.getTipo());
			botonNave.addActionListener(				
					new ActionListener(){
						public void actionPerformed(ActionEvent e){
							JFrame f = new VistaAccionesNave(n,nombreJugador);
							f.setVisible(true);
						}
					}
				);
			
	    	this.add(botonNave);
		}
		
		
		
	}

}
