package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Jugador;
import modelo.Nave;
import modelo.Planeta;
import modelo.Punto;
import modelo.Universo;

public class VistaNavesParaAtacar extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	Universo universo;
	Nave nave;
	
	
	
	public VistaNavesParaAtacar(final Universo universo, final Nave nave, String nombreJugador){
		
		this.universo = universo;
		this.nave = nave;
		
		JButton botonNave;
		JLabel labelPlaneta;
		
		this.setTitle("Naves para acatar");
		this.setSize(300,300);
		this.setLocation(1010, 0);
		
		GridLayout layout = new GridLayout(10,0);
		this.getContentPane().setLayout(layout);
		
    	JLabel label = new JLabel();
    	label.setText(" Elegir nave para atacar");
    	this.add(label);
		
		for(Jugador j: universo.getJugadores()){
			
			if(!nombreJugador.equals(j.getNombre())){
			
				for(Planeta p: j.getPlanetas()){
				
					labelPlaneta = new JLabel();
					labelPlaneta.setText("Naves del planeta " + p.getNombre() + " y del jugador " + j.getNombre());
					this.add(labelPlaneta);
					
					for(final Nave n: p.getNaves()){
						if(!n.isExploto()){
							botonNave = new JButton();
							botonNave.setText("Nave " + n.getTipo());
							botonNave.addActionListener(				
									new ActionListener(){
										public void actionPerformed(ActionEvent e){
											nave.setDestino( n.getUbicacion() );
											n.recibirAtaque(nave);
										}
									}
							);
							this.add(botonNave);
						}
					}
				}	
			}
		}
	}
}

