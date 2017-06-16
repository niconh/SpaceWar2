package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import modelo.Planeta;

public class VistaAccionesPlaneta extends JFrame {
	
	private static final long serialVersionUID = 1L;
	
	protected JLabel accion = null;

	private JButton botonTorretas,
					botonNaveBatalla,
					botonNaveDestructor,
					botonNaveDeTransporte,
					botonAumentandoProduccion;
	
	protected boolean produciendoTorretas,
	 				  produciendoNaveDeBatalla,
	 				  produciendoNaveDestructor,
	 				  produciendoNaveDeTransporte,
	 				  aumentandoLaProduccion;
	
	Planeta planeta;
	
	public VistaAccionesPlaneta(Planeta planet, String nombreJugador){
        this.setTitle("Planeta " + planet.getNombre() + " del jugador "+ nombreJugador);
    	this.setSize(400,400);
    	this.setLocation(810, 10);
    
    	GridLayout layout = new GridLayout(10,0);
    	this.getContentPane().setLayout(layout);
    	
    	this.planeta = planet;
    	
    	JLabel label = new JLabel();
    	label.setText(" " + nombreJugador + " ¿Qué acción desar tomar sobre el planeta "+ planet.getNombre() +"?");
    	this.add(label);
    	
    	botonTorretas = new JButton();
    	botonTorretas.setText("Producir Torretas");
    	botonTorretas.addActionListener(				
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						accion.setText("Se van a producir Torretas");
						planeta.producirTorretas();
					}
				}
			);
    	this.add(botonTorretas);
    	
    	botonNaveBatalla = new JButton();
    	botonNaveBatalla.setText("Producir Nave de Batalla");
    	botonNaveBatalla.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						accion.setText("Se van a producir Naves de Batalla");
						planeta.producirNaveDeBatalla();
					}
				}
			);
    	this.add(botonNaveBatalla);
    	
    	botonNaveDestructor = new JButton();
    	botonNaveDestructor.setText("Producir Nave Destructor");
    	botonNaveDestructor.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						accion.setText("Se van a producir Naves Destructor");
						planeta.producirNaveDestructor();
					}
				}
			);
    	this.add(botonNaveDestructor);
    	
    	botonNaveDeTransporte = new JButton();
    	botonNaveDeTransporte.setText("Producir Nave de Transporte");
    	botonNaveDeTransporte.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						accion.setText("Se van a producir Naves de Transporte");
						planeta.producirNaveDeTransporte();
					}
				}
			);
    	this.add(botonNaveDeTransporte);
    	
    	botonAumentandoProduccion = new JButton();
    	botonAumentandoProduccion.setText("Aumentar la producción del planeta");
    	botonAumentandoProduccion.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						accion.setText("Se va a trabajar en aumentar la producción del planeta");
						planeta.aumentarLaProduccion();
					}
				}
			);
    	this.add(botonAumentandoProduccion);
    	
    	
    	accion = new JLabel();
    	this.add(accion);
       	
	}
}
