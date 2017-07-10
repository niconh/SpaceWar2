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
import modelo.Punto;
import observer.IObservador;

public class VistaAccionesNave extends JFrame implements ActionListener,IObservador {
	
	private static final long serialVersionUID = 1L;
	
	protected JLabel accion,labelNave = null;
	
	private JTextField textboxX,textboxY;

	private JButton botonMoverse,
					botonAtacar;
	
	
	Nave nav;
	
	public VistaAccionesNave(Nave nave, String nombreJugador){
        this.setTitle("Nave " + nave.getTipo() + " del jugador "+ nombreJugador);
    	this.setSize(600,300);
    	this.setLocation(1310, 0);
    
    	GridLayout layout = new GridLayout(10,0);
    	this.getContentPane().setLayout(layout);
    	
    	    	
    	this.nav = nave;
    	
    	nav.registrarObservador(this);
    	
    	JLabel label = new JLabel();
    	label.setText(" " + nombreJugador + " ¿Qué acción desar tomar sobre la nave de " + nav.getTipo() +"?");
    	this.add(label);
    	
    	labelNave = new JLabel();
    	labelNave.setText(nav.toString());
    	this.add(labelNave);
    	
    	botonMoverse = new JButton();
    	botonMoverse.setText("Moverse a");
    	botonMoverse.addActionListener(this);
    	this.add(botonMoverse);
    	
    	textboxX = new JTextField();
		textboxX.setText("X");
		textboxX.setBounds(5, 5, 200, 26);
		this.add(textboxX);
		
		textboxY = new JTextField();
		textboxY.setText("Y");
		textboxY.setBounds(5, 5, 200, 26);
		this.add(textboxY);
    	
    	botonAtacar = new JButton();
    	botonAtacar.setText("Atacar a ");
    	botonAtacar.addActionListener(
				new ActionListener(){
					public void actionPerformed(ActionEvent e){
						
					}
				}
			);
    	this.add(botonAtacar);
	}

	public void actionPerformed(ActionEvent e) {
		
		try{
			int x = Integer.parseInt(textboxX.getText());
			int y = Integer.parseInt(textboxY.getText());
			nav.setDestino(new Punto( x , y ));
		}
		catch(Exception ex){
			JOptionPane.showMessageDialog(this, "Revisar coordenadas");
		}
		
	}

	public void Actualizar() {
		labelNave.setText(nav.toString());
		
	}

}
