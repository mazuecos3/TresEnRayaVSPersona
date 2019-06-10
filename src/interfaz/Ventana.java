package interfaz;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

import dominio.LogicaTresEnRaya;
import dominio.MyBoton;

import javax.swing.JButton;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JSeparator;
import javax.swing.border.LineBorder;

// TODO: Auto-generated Javadoc
/**
 * La clase Ventana.
 */
public class Ventana {

	
	/** El frame. */
	private JFrame frame;
	
	/** La matriz. */
	static int matriz[][] = new int[3][3];
	
	/** El juego. */
	LogicaTresEnRaya juego = new LogicaTresEnRaya(0, 0, 0, 0, 0, 0, 0);

	/** El panel. */
	private JPanel panel = new JPanel();
	
	/** El panel Nombre jugadores. */
	private JPanel NombreJugadores;
	
	/** El Jugador 1. */
	private JPanel Jugador1 = new JPanel();
	
	/** El  Jugador 2. */
	private JPanel Jugador2 = new JPanel();
	
	/** Los puntos J 1. */
	private JLabel puntosJ1 = new JLabel();
	
	/** Los puntos J 2. */
	private JLabel puntosJ2 = new JLabel();
	
	/** Los lbl X. */
	private JLabel lblX = new JLabel();
	
	/** Los lbl O. */
	private JLabel lblO = new JLabel();
	
	/** Las perdidas X. */
	private JLabel perdidasX = new JLabel();
	
	/** Las perdidas O. */
	private JLabel perdidasO = new JLabel();
	
	/** Las empatadas X. */
	private JLabel empatadasX = new JLabel();
	
	/** Las empatadas O. */
	private JLabel empatadasO = new JLabel();
	
	/** Las Jugadores. */
	private JPanel Jugadores = new JPanel();

	/** El boton 1. */
	static MyBoton boton1 = new MyBoton("");
	
	/** El boton 2. */
	static MyBoton boton2 = new MyBoton("");
	
	/** El boton 3. */
	static MyBoton boton3 = new MyBoton("");
	
	/** El boton 4. */
	static MyBoton boton4 = new MyBoton("");
	
	/** El boton 5. */
	static MyBoton boton5 = new MyBoton("");
	
	/** El boton 6. */
	static MyBoton boton6 = new MyBoton("");
	
	/** El boton 7. */
	static MyBoton boton7 = new MyBoton("");
	
	/** El boton 8. */
	static MyBoton boton8 = new MyBoton("");
	
	/** El boton 9. */
	static MyBoton boton9 = new MyBoton("");

	/** El panel partida. */
	JPanel panelPartida = new JPanel();
	
	/** El textfiendl j1. */
	private static JTextField J1;
	
	/** El textfiendl j2. */
	private static JTextField J2;

	/**
	 * Launch the application.
	 *
	 * @param args the arguments
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ventana window = new Ventana();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ventana() {
		initialize();
		llenarMatriz();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 600, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		frame.setResizable(false);
		frame.setTitle("Tres en Raya 2.0");
		frame.setVisible(true);
		frame.getContentPane().setLayout(null);
	


		
		
		BufferedImage imagen = null;
		try {

			imagen = ImageIO.read(getClass().getResourceAsStream("/imagenes/fondo1.jpg"));
		} catch (Exception e) {
			
		}
		Image dimg = imagen.getScaledInstance(600, 500, Image.SCALE_SMOOTH);
		ImageIcon imageIcon = new ImageIcon(dimg);

		JLabel labelFondo = new JLabel(imageIcon);
		frame.setContentPane(labelFondo);


		panelPartida = new JPanel();
		panelPartida.setBackground(new Color(0,0,0,0));
		panelPartida.setBounds(250, 120, 312, 316);
		frame.getContentPane().add(panelPartida);
		panelPartida.setLayout(null);
		panelPartida.setVisible(false);

		
		
		BufferedImage tablero = null;
		try {

			tablero = ImageIO.read(getClass().getResourceAsStream("/imagenes/tablero.png"));
		} catch (Exception e) {
			
		}
		ImageIcon imageTablero = new ImageIcon(tablero);
		
		JLabel fondoPartida = new JLabel("");
		fondoPartida.setHorizontalAlignment(SwingConstants.CENTER);
		fondoPartida.setIcon(imageTablero);
		fondoPartida.setBounds(0, 0, 312, 310);
		panelPartida.add(fondoPartida);



		boton1 = new MyBoton("");
	
		boton1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				ejecutarMain(boton1, 0, 0);
			}
		});
		boton1.setBounds(10, 11, 85, 85);
		panelPartida.add(boton1);

		boton2 = new MyBoton("");
		boton2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ejecutarMain(boton2, 0, 1);
			}
		});
		boton2.setBounds(113, 11, 85, 85);
		panelPartida.add(boton2);

		boton3 = new MyBoton("");
		boton3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ejecutarMain(boton3, 0, 2);
			}
		});
		boton3.setBounds(217, 11, 85, 85);
		panelPartida.add(boton3);

		boton4 = new MyBoton("");
		boton4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ejecutarMain(boton4, 1, 0);
			}
		});
		boton4.setBounds(10, 113, 85, 85);
		panelPartida.add(boton4);

		boton5 = new MyBoton("");
		boton5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ejecutarMain(boton5, 1, 1);
			}
		});
		boton5.setBounds(113, 113, 85, 85);
		panelPartida.add(boton5);

		boton6 = new MyBoton("");
		boton6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ejecutarMain(boton6, 1, 2);
			}
		});
		boton6.setBounds(217, 113, 85, 85);
		panelPartida.add(boton6);

		boton7 = new MyBoton("");
		boton7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ejecutarMain(boton7, 2, 0);
			}
		});
		boton7.setBounds(10, 214, 85, 85);
		panelPartida.add(boton7);

		boton8 = new MyBoton("");
		boton8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ejecutarMain(boton8, 2, 1);
			}
		});
		boton8.setBounds(113, 214, 85, 85);
		panelPartida.add(boton8);

		boton9 = new MyBoton("");
		boton9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				ejecutarMain(boton9, 2, 2);
			}
		});
		boton9.setBounds(217, 214, 85, 85);
		panelPartida.add(boton9);

	    Jugadores = new JPanel();
	
		Jugadores.setBounds(20, 108, 223, 342);
		Jugadores.setBackground(new Color(0,0,0,0));
		frame.getContentPane().add(Jugadores);
		Jugadores.setLayout(null);
		Jugadores.setVisible(false);

		Jugador1 = new JPanel();
		Jugador1.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		Jugador1.setBounds(10, 11, 213, 150);
		Jugadores.add(Jugador1);
		Jugador1.setLayout(null);

		lblX = new JLabel("");
		lblX.setForeground(Color.RED);
		lblX.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblX.setBounds(10, 11, 193, 25);
		Jugador1.add(lblX);

		puntosJ1 = new JLabel("0");
		puntosJ1.setForeground(Color.RED);
		puntosJ1.setFont(new Font("Tahoma", Font.BOLD, 20));
		puntosJ1.setBounds(112, 47, 18, 25);
		Jugador1.add(puntosJ1);
		
		 perdidasX = new JLabel("0");
		perdidasX.setForeground(Color.RED);
		perdidasX.setFont(new Font("Tahoma", Font.BOLD, 20));
		perdidasX.setBounds(112, 77, 18, 25);
		Jugador1.add(perdidasX);
		
		 empatadasX = new JLabel("0");
		empatadasX.setForeground(Color.RED);
		empatadasX.setFont(new Font("Tahoma", Font.BOLD, 20));
		empatadasX.setBounds(112, 109, 18, 25);
		Jugador1.add(empatadasX);
		
		JLabel lblGanadas = new JLabel("Ganadas");
		lblGanadas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblGanadas.setHorizontalAlignment(SwingConstants.CENTER);
		lblGanadas.setBounds(0, 47, 102, 19);
		Jugador1.add(lblGanadas);
		
		JLabel label_4 = new JLabel("Perdidas");
		label_4.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_4.setHorizontalAlignment(SwingConstants.CENTER);
		label_4.setBounds(0, 79, 102, 19);
		Jugador1.add(label_4);
		
		JLabel label_5 = new JLabel("Empatadas");
		label_5.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_5.setHorizontalAlignment(SwingConstants.CENTER);
		label_5.setBounds(0, 115, 102, 19);
		Jugador1.add(label_5);
		
		JLabel lblX_1 = new JLabel("X");
		lblX_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblX_1.setForeground(Color.GRAY);
		lblX_1.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblX_1.setBounds(133, 47, 80, 87);
		Jugador1.add(lblX_1);

		Jugador2 = new JPanel();
		Jugador2.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		Jugador2.setBounds(10, 172, 213, 148);
		Jugadores.add(Jugador2);
		Jugador2.setLayout(null);

		lblO = new JLabel("");
		lblO.setForeground(Color.BLUE);
		lblO.setFont(new Font("Tahoma", Font.BOLD, 22));
		lblO.setBounds(10, 11, 193, 25);
		Jugador2.add(lblO);

		puntosJ2 = new JLabel("0");
		puntosJ2.setBounds(109, 41, 18, 25);
		Jugador2.add(puntosJ2);
		puntosJ2.setForeground(Color.BLUE);
		puntosJ2.setFont(new Font("Tahoma", Font.BOLD, 20));
		
		 empatadasO = new JLabel("0");
		empatadasO.setForeground(Color.BLUE);
		empatadasO.setFont(new Font("Tahoma", Font.BOLD, 20));
		empatadasO.setBounds(109, 106, 18, 25);
		Jugador2.add(empatadasO);
		
		 perdidasO = new JLabel("0");
		perdidasO.setForeground(Color.BLUE);
		perdidasO.setFont(new Font("Tahoma", Font.BOLD, 20));
		perdidasO.setBounds(109, 70, 18, 25);
		Jugador2.add(perdidasO);
		
		JLabel label_6 = new JLabel("Ganadas");
		label_6.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_6.setHorizontalAlignment(SwingConstants.CENTER);
		label_6.setBounds(0, 47, 99, 19);
		Jugador2.add(label_6);
		
		JLabel label_7 = new JLabel("Perdidas");
		label_7.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_7.setHorizontalAlignment(SwingConstants.CENTER);
		label_7.setBounds(0, 83, 99, 19);
		Jugador2.add(label_7);
		
		JLabel label_8 = new JLabel("Empatadas");
		label_8.setFont(new Font("Tahoma", Font.BOLD, 12));
		label_8.setHorizontalAlignment(SwingConstants.CENTER);
		label_8.setBounds(0, 112, 99, 19);
		Jugador2.add(label_8);
		
		JLabel lblO_1 = new JLabel("O");
		lblO_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblO_1.setForeground(Color.GRAY);
		lblO_1.setFont(new Font("Tahoma", Font.PLAIN, 80));
		lblO_1.setBounds(130, 41, 83, 90);
		Jugador2.add(lblO_1);

		JPanel Cabecera = new JPanel();
		Cabecera.setBorder(new LineBorder(new Color(0, 0, 0), 3));
		Cabecera.setBounds(28, 11, 535, 98);
		Cabecera.setBackground(new Color(0,0,0,0));
		frame.getContentPane().add(Cabecera);
		Cabecera.setLayout(null);

		JLabel Titulo = new JLabel("TRES EN RAYA ");
		Titulo.setHorizontalAlignment(SwingConstants.CENTER);
		Titulo.setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 50));
		Titulo.setForeground(Color.BLACK);
		Titulo.setBounds(10, 11, 544, 76);
		Cabecera.add(Titulo);

		NombreJugadores = new JPanel();
		NombreJugadores.setBackground(new Color(0,0,0,0));
		NombreJugadores.setBounds(149, 120, 281, 272);
		frame.getContentPane().add(NombreJugadores);
		NombreJugadores.setLayout(null);

		J1 = new JTextField();
		J1.setBounds(10, 47, 261, 32);
		NombreJugadores.add(J1);
		J1.setColumns(10);

		J2 = new JTextField();
		J2.setColumns(10);
		J2.setBounds(10, 131, 261, 34);
		NombreJugadores.add(J2);

		JLabel lblEligeElNombre = new JLabel("Elige el nombre del jugador 1.");
		lblEligeElNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblEligeElNombre.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEligeElNombre.setForeground(Color.BLACK);
		lblEligeElNombre.setBounds(0, 11, 281, 41);
		NombreJugadores.add(lblEligeElNombre);

		JLabel lblEligeElNombre_1 = new JLabel("Elige el nombre del jugador 2.");
		lblEligeElNombre_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblEligeElNombre_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblEligeElNombre_1.setForeground(Color.BLACK);
		lblEligeElNombre_1.setBounds(0, 90, 281, 30);
		NombreJugadores.add(lblEligeElNombre_1);

		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				AsignarNombre();
				
				
			}
		});
		btnGuardar.setBounds(80, 195, 102, 45);
		NombreJugadores.add(btnGuardar);
		
		JMenuBar menuBar = new JMenuBar();
		frame.setJMenuBar(menuBar);
		
		JMenu menuArchivo = new JMenu("Archivo");
		menuBar.add(menuArchivo);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		menuArchivo.add(mntmSalir);
		
		JMenu menuJuego = new JMenu("Juego");
		menuBar.add(menuJuego);
		
		JMenuItem mntmNuevaPartida = new JMenuItem("Nueva Partida");
		mntmNuevaPartida.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			nuevaPartida();
			}
		});
		menuJuego.add(mntmNuevaPartida);
		
		JMenu acercaDe = new JMenu("Acerca de");
		menuBar.add(acercaDe);
		
		JMenuItem mntmAyuda = new JMenuItem("Ayuda");
		mntmAyuda.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ayuda();
			}
		});
		acercaDe.add(mntmAyuda);
		
		JSeparator separator = new JSeparator();
		acercaDe.add(separator);
		
		JMenuItem mntmReglas = new JMenuItem("Reglas");
		mntmReglas.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				reglas();
			}
		});
		acercaDe.add(mntmReglas);

		



	}



	//METODOS

	
	/**
	 * Llenar matriz.
	 */
	// RELLENAR CON NUMEROS DISTINTOS LA MATRIZ 
	public static void llenarMatriz() {

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				matriz[i][j] = (i+10)*(j+10);
				System.out.println(matriz[i][j]);
				
			}
		}
	}

	/**
	 * Turnar.
	 */
	public void turnar() {
		
		if (juego.getTurno()==0) {

			Jugador1.setBackground(Color.white);
			Jugador2.setBackground(Color.yellow);
		}

		if (juego.getTurno()==1) {

			Jugador1.setBackground(Color.yellow);
			Jugador2.setBackground(Color.white);
		}
	}

	/**
	 * Restart.
	 */
	public static void restart() {

		llenarMatriz();
		boton1.setText("");
		boton1.setEnabled(true);
		boton2.setText("");
		boton2.setEnabled(true);
		boton3.setText("");
		boton3.setEnabled(true);
		boton4.setText("");
		boton4.setEnabled(true);
		boton5.setText("");
		boton5.setEnabled(true);
		boton6.setText("");
		boton6.setEnabled(true);
		boton7.setText("");
		boton7.setEnabled(true);
		boton8.setText("");
		boton8.setEnabled(true);
		boton9.setText("");
		boton9.setEnabled(true);
	
		LogicaTresEnRaya.contadorEmpate = 0;

	}

	/**
	 * Ejecutar main.
	 *
	 * @param bt de bt
	 * @param i de i
	 * @param j de j
	 */
	public void ejecutarMain(JButton bt ,int i, int j ) {

		turnar();
		if (juego.ejecutar(bt, i, j, matriz, puntosJ1 , puntosJ2 , empatadasX, empatadasO, perdidasX , perdidasO ) == 1 ) {
			
			restart();
			
		}

	}

	/**
	 * Asignar nombre.
	 */
	public void AsignarNombre() {
		
		int max = 12;
		
		String nombreJugador1 = J1.getText();
		String nombreJugador2 = J2.getText();
		
		
		if (nombreJugador1.equals(nombreJugador2)) {
			JOptionPane.showMessageDialog(null, "El nombre del jugador 1 no puede ser igual que el del jugador 2");
			reiniciarTexto();
			
		} else if (nombreJugador1.length() > max || nombreJugador2.length() > max) {
			JOptionPane.showMessageDialog(null, "El nombre de los jugadores no puede ser mayor a 12 caracteres. ");
			
			reiniciarTexto();	
		}else {	
		if (nombreJugador1.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Por favor rellene el nombre del Jugador 1, Gracias.");
			reiniciarTexto();
		}
		else if (nombreJugador2.isEmpty()) {
			JOptionPane.showMessageDialog(null, "Por favor rellene el nombre del Jugador 2, Gracias.");
			reiniciarTexto();	
		}

		if (nombreJugador1.isEmpty() || nombreJugador2.isEmpty() ) {
		
			reiniciarTexto();
		} else {
			lblX.setText(J1.getText());
			lblO.setText(J2.getText());
			visivilidadPaneles();
	
		}
		}
		
		
		
	}

	
	
	/**
	 * Reiniciar texto.
	 */
	// REINICIAR LOS TEXTFIELDS DE LOS NOMBRES DE LOS JUGADORES
	public void reiniciarTexto() {
		J1.setText("");
		J2.setText("");


	}
	
	/**
	 * Visivilidad paneles.
	 */
	// HACE VISIBLES LOS PANELES OCULTOS
	public void visivilidadPaneles() {
		
		NombreJugadores.setVisible(false);
		Jugadores.setVisible(true);
		Jugador1.setBackground(Color.yellow);
		panelPartida.setVisible(true);
		
		
	}

	/**
	 * Ayuda.
	 */
	// MENU AYUDA
	private void ayuda() {

		String nl = System.getProperty("line.separator");
		Object msj = "Cualquier Bug o Error mandar mensaje " + nl + "al siguiente correo:" + nl + "Tres_EnRaya@gmail.com";	
		JOptionPane.showMessageDialog(null, msj,"AYUDA",JOptionPane.QUESTION_MESSAGE);

	}
	
	/**
	 * Reglas.
	 */
	// MENU REGLAS DEL JUEGO
	private void reglas() {

		String nl = System.getProperty("line.separator");
		Object msj = "Bienvenidos al juego del 3 en raya, las reglas de este juego son basicas." 
		+ nl + "Consiste en hacer una fila de 3 celdas con tu ficha antes que el rival"	;
		
		JOptionPane.showMessageDialog(null, msj,"AYUDA",JOptionPane.QUESTION_MESSAGE);

	}
	
	/**
	 * Nueva partida.
	 */
	// CON ESTE METODOO INICIAMOS OTRA VEZ LA VENTANA Y CERRAMOS LA ANTERIOR
	private void nuevaPartida() {
		Ventana segunda = new Ventana();
		frame.dispose();
	}
	
	/**
	 * Gets the j1.
	 *
	 * @return the j1
	 */
	// CREAMOS DOS METODOS STATICOS PARA ASIGNAR EL NOMBRE DE LA VICTORIA
	public static String getJ1() {
		return J1.getText();
		
	}
	
	/**
	 * Gets the j2.
	 *
	 * @return the j2
	 */
	public static String getJ2() {
		return J2.getText();
		
	}
}
