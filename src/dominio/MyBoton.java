package dominio;


import java.awt.Color;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JToolTip;

public class MyBoton extends JButton{

	public MyBoton(String nombre) {
		
		super(nombre);
	
		super.setBorderPainted(false);
		super.setFont(new Font("Tahoma", Font.PLAIN, 70));
		super.setBackground(Color.white);
		
	}
		
	
	
}
