import java.awt.EventQueue;

import javax.swing.JFrame;

import vista.VistaPrincipal;

public class Programa {

	public static void main(String[] args) {
		
		EventQueue.invokeLater(
				new Runnable(){
					public void run(){
						JFrame f = new VistaPrincipal();
						f.setVisible(true);
					}
				}
			);
	}

}
