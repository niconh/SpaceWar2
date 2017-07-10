package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import modelo.Nave;
import modelo.Planeta;
import modelo.Punto;
import modelo.Universo;

public class VistaAccionesPlaneta extends JFrame implements ActionListener {
	
	private static final long serialVersionUID = 1L;
	
	protected JLabel accion = null;

	private JButton botonTorretas,
					botonNaveBatalla,
					botonNaveDestructor,
					botonNaveDeTransporte,
					botonAumentandoProduccion,
					botonVerNaves,
					botonMoverFlota;
	
	private JTextField textboxX,textboxY;
	
	protected boolean produciendoTorretas,
	 				  produciendoNaveDeBatalla,
	 				  produciendoNaveDestructor,
	 				  produciendoNaveDeTransporte,
	 				  aumentandoLaProduccion;
	
	Planeta planeta;
	String nombreJug;
	Universo universo;
	
	public VistaAccionesPlaneta(Planeta planet, String nombreJugador, final Universo universo){
		
		this.universo = universo;
		
        this.setTitle("Planeta " + planet.getNombre() + " del jugador "+ nombreJugador);
    	this.setSize(400,300);
    	this.setLocation(610, 0);
    
    	GridLayout layout = new GridLayout(11,0);
    	this.getContentPane().setLayout(layout);
    	
    	this.planeta = planet;
    	this.nombreJug = nombreJugador;
    	
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
    	
    	botonVerNaves = new JButton();
    	botonVerNaves.setText("Ver naves");
    	botonVerNaves.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						JFrame f = new VistaNaves(planeta.getNaves(),nombreJug, universo);
						f.setVisible(true);
					}
				}
			);
    	this.add(botonVerNaves);
    	
    	botonMoverFlota = new JButton();
    	botonMoverFlota.setText("Mover flota de naves a");
    	botonMoverFlota.addActionListener(this);
    	this.add(botonMoverFlota);
    	
    	textboxX = new JTextField();
		textboxX.setText("X");
		textboxX.setBounds(5, 5, 200, 26);
		this.add(textboxX);
		
		textboxY = new JTextField();
		textboxY.setText("Y");
		textboxY.setBounds(5, 5, 200, 26);
		this.add(textboxY);
    	
    	accion = new JLabel();
    	this.add(accion);
       	
	}

	public void actionPerformed(ActionEvent e) {
		try{
			int x = Integer.parseInt(textboxX.getText());
			int y = Integer.parseInt(textboxY.getText());
			for(Nave n: this.planeta.getNaves()){
				n.setDestino(new Punto( x , y ));
			}
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(this, "Revisar coordenadas");
		}
		
	}
}
