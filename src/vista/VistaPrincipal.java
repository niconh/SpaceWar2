package vista;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

import controlador.ControladorTurno;
import modelo.Jugador;
import modelo.Universo;

public class VistaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	
	private Universo universo;
	private VistaUniverso vista;
	private ControladorTurno controlador;

	private JButton botonJugador, botonAvanzarTurno;
	
	JLabel turno;
	
	public VistaPrincipal(){
	
		universo = new Universo();
		vista = new VistaUniverso(universo);
		controlador = new ControladorTurno(50,universo);
		universo.registrarObservador(vista);
		
		
		this.setTitle("Space War");
		this.setSize(400,400);
		this.setLocation(10, 10);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
    	GridLayout layout = new GridLayout(10,0);
    	this.getContentPane().setLayout(layout);
    	
    	JLabel copete = new JLabel();
    	copete.setText(" Elegir jugador para ver sus planetas");
    	this.add(copete);
    	
		
		for(final Jugador j: this.universo.getJugadores()){
			botonJugador = new JButton();
			botonJugador.setText(j.getNombre());
			botonJugador.addActionListener(				
					new ActionListener(){
						public void actionPerformed(ActionEvent e){
							JFrame f = new VistaPlaneta(j.getPlanetas(), j.getNombre());
							f.setVisible(true);
						}
					}
				);
			
	    	this.add(botonJugador);
			
		}
		
		botonAvanzarTurno = new JButton();
		botonAvanzarTurno.setText("Avanzar turno");
		botonAvanzarTurno.addActionListener(				
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						controlador.ejecutar();
						turno.setText(" Turno actual: " + controlador.getTurnoActual());
						if(universo.isJuegoFinalizado()){
							turno.setText(" Turno actual: " + controlador.getTurnoActual() + " ** Juego finalizado **");
						}
					}
				}
			);
		
    	turno = new JLabel();
    	turno.setText(" Turno actual: " + controlador.getTurnoActual());
    	this.add(turno);
		
    	this.add(botonAvanzarTurno);
		
		
		
		
	}
	
	
}
