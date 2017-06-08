package vista;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class VistaAccionesPlaneta extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	protected JLabel accion = null;
	private JButton botonTorretas,
					botonNaveBatalla,
					botonNaveDestructor,
					botonNaveDeTransporte,
					botonAumentandoProduccion,
					botonAvanzarTurno;
	
	protected boolean avanzarTurno;
	
	protected boolean produciendoTorretas;
	protected boolean produciendoNaveDeBatalla;
	protected boolean produciendoNaveDestructor;
	protected boolean produciendoNaveDeTransporte;
	protected boolean aumentandoLaProduccion;
	
	public VistaAccionesPlaneta(String nombreJugador, String nombrePlaneta){
        this.setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        this.setTitle("Jugador: "+ nombreJugador + " - Planeta: " + nombrePlaneta);
    	this.setSize(350,500);
    	this.setLocation(0, 0);
    
    	GridLayout layout = new GridLayout(10,0);
    	this.getContentPane().setLayout(layout);
    	
    	JLabel label = new JLabel();
    	label.setText("Jugador: " + nombreJugador + " ¿Qué accion toma sobre el planeta "+ nombrePlaneta +"?");
    	this.add(label);
    	
    	botonTorretas = new JButton();
    	botonTorretas.setText("Producir Torretas");
    	botonTorretas.addActionListener(this);
    	this.add(botonTorretas);
    	
    	botonNaveBatalla = new JButton();
    	botonNaveBatalla.setText("Producir Nave de Batalla");
    	botonNaveBatalla.addActionListener(this);
    	this.add(botonNaveBatalla);
    	
    	botonNaveDestructor = new JButton();
    	botonNaveDestructor.setText("Producir Nave Destructor");
    	botonNaveDestructor.addActionListener(this);
    	this.add(botonNaveDestructor);
    	
    	botonNaveDeTransporte = new JButton();
    	botonNaveDeTransporte.setText("Producir Nave de Transporte");
    	botonNaveDeTransporte.addActionListener(this);
    	this.add(botonNaveDeTransporte);
    	
    	botonAumentandoProduccion = new JButton();
    	botonAumentandoProduccion.setText("Aumentar la produccion del planeta");
    	botonAumentandoProduccion.addActionListener(this);
    	this.add(botonAumentandoProduccion);
    	
    	
    	
    	accion = new JLabel();
    	this.add(accion);
    	
    	this.avanzarTurno=false;
    	botonAvanzarTurno = new JButton();
    	botonAvanzarTurno.setText("Avanzar Turno");
    	botonAvanzarTurno.addActionListener(this);
    	this.add(botonAvanzarTurno);
    	
	}
	
	public void actionPerformed(ActionEvent e){
		
	
		if(e.getSource()==botonTorretas){
			accion.setText("Se van a producir Torretas");
			this.produciendoTorretas = true;
			this.produciendoNaveDeBatalla = false;
			this.produciendoNaveDestructor  = false;
			this.produciendoNaveDeTransporte = false;
			this.aumentandoLaProduccion = false;
		}
		
		if(e.getSource()==botonNaveBatalla){
			accion.setText("Se van a producir Naves de Batalla");
			this.produciendoTorretas = false;
			this.produciendoNaveDeBatalla = true;
			this.produciendoNaveDestructor  = false;
			this.produciendoNaveDeTransporte = false;
			this.aumentandoLaProduccion = false;
		}
		
		if(e.getSource()==botonNaveDestructor){
			accion.setText("Se van a producir Naves Destructoras");
			this.produciendoTorretas = false;
			this.produciendoNaveDeBatalla = false;
			this.produciendoNaveDestructor = true;
			this.produciendoNaveDeTransporte = false;
			this.aumentandoLaProduccion = false;
		}
		
		if(e.getSource()==botonNaveDeTransporte){
			accion.setText("Se van a producir Naves de Transporte");
			this.produciendoTorretas = false;
			this.produciendoNaveDeBatalla = false;
			this.produciendoNaveDestructor  = false;
			this.produciendoNaveDeTransporte = true;
			this.aumentandoLaProduccion = false;
		}
		
		if(e.getSource()==botonAumentandoProduccion){
			accion.setText("Se va a trabajar en aumentar la producción del planeta");
			this.produciendoTorretas = false;
			this.produciendoNaveDeBatalla = false;
			this.produciendoNaveDestructor  = false;
			this.produciendoNaveDeTransporte = false;
			this.aumentandoLaProduccion = true;
		}
		
		
		
		
		if(e.getSource()==botonAvanzarTurno){
			this.avanzarTurno=true;
		}
		
	}

	public boolean isProduciendoTorretas() {
		return produciendoTorretas;
	}

	public boolean isProduciendoNaveDeBatalla() {
		return produciendoNaveDeBatalla;
	}

	public boolean isProduciendoNaveDestructor() {
		return produciendoNaveDestructor;
	}

	public boolean isProduciendoNaveDeTransporte() {
		return produciendoNaveDeTransporte;
	}

	public boolean isAumentandoLaProduccion() {
		return aumentandoLaProduccion;
	}

	public boolean isAvanzarTurno() {
		return avanzarTurno;
	}
	
	
	

}
