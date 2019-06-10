package dominio;
import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

import interfaz.Ventana;


// TODO: Auto-generated Javadoc
/**
 * La clase  LogicaTresEnRaya.
 */
public class LogicaTresEnRaya {

	// ATRIBUTOS
	
	/** El turno. */
	
	private int turno;
	
	/** Partidas ganadas X. */
	private int ganadasX;
	
	/** Partidas  ganadas O. */
	private int ganadasO;
	
	/** Partidas  perdidas X. */
	private int perdidasX;
	
	/** Partidas  perdidas O. */
	private int perdidasO;
	
	/** Partidas  empatadas X. */
	private int empatadasX;
	
	/** Partidas  empatadas O. */
	private int empatadasO;
	
	/** Conatdor  empate. */
	public static int contadorEmpate = 0;




	/**
	 *
	 * CONSTRUCTOR 
	 *
	 * @param turno de turno
	 * @param ganadasX de ganadas X
	 * @param ganadasO de ganadas O
	 * @param perdidasX de perdidas X
	 * @param perdidasO de perdidas O
	 * @param empatadasX de empatadas X
	 * @param empatadasO de empatadas O
	 */
	// CONSTRUCTOR
	public LogicaTresEnRaya(int turno, int ganadasX, int ganadasO, int perdidasX,int perdidasO,int empatadasX,int empatadasO) {

		this.turno = turno;
		this.ganadasX = ganadasX;
		this.ganadasO = ganadasO;
		this.empatadasX = empatadasX;
		this.empatadasO = empatadasO;
		this.perdidasX = perdidasX;
		this.perdidasO = perdidasO;
	}


	// GETTERS AND SETTERS

	/**
	 *Coger el turno.
	 *
	 * @return el turno
	 */
	public int getTurno() {
		return turno;
	}



	/**
	 * Establecer el turno.
	 *
	 * @param turno el nuevo turno
	 */
	public void setTurno(int turno) {
		this.turno = turno;
	}



	/**
	 * Coger los puntos X.
	 *
	 * @return los puntos X
	 */
	public int getPuntosX() {
		return ganadasX;
	}



	/**
	 * Establecer los puntos X.
	 *
	 * @param puntosX los nuevos puntos X
	 */
	public void setPuntosX(int puntosX) {
		this.ganadasX = puntosX;
	}



	/**
	 * Coger los puntos O.
	 *
	 * @return los puntos O
	 */
	public int getPuntosO() {
		return ganadasO;
	}



	/**
	 * Establecer los puntos O.
	 *
	 * @param puntosO los nuevos puntos O
	 */
	public void setPuntosO(int puntosO) {
		this.ganadasO = puntosO;
	}

	/**
	 *Coger las perdidas X.
	 *
	 * @return las perdidas X
	 */
	public int getPerdidasX() {
		return perdidasX;
	}


	/**
	 * Establecer als perdidas X.
	 *
	 * @param perdidasX las nuevas perdidas X
	 */
	public void setPerdidasX(int perdidasX) {
		this.perdidasX = perdidasX;
	}


	/**
	 * Coger las perdidas O.
	 *
	 * @return las perdidas O
	 */
	public int getPerdidasO() {
		return perdidasO;
	}


	/**
	 * Establecer las perdidas O.
	 *
	 * @param perdidasO las nuevas perdidas O
	 */
	public void setPerdidasO(int perdidasO) {
		this.perdidasO = perdidasO;
	}


	/**
	 * Coger las empatadas X.
	 *
	 * @return las empatadas X
	 */
	public int getEmpatadasX() {
		return empatadasX;
	}


	/**
	 * Establecer las empatadas X.
	 *
	 * @param empatadasX las nuevas empatadas X
	 */
	public void setEmpatadasX(int empatadasX) {
		this.empatadasX = empatadasX;
	}


	/**
	 * Coger las  empatadas O.
	 *
	 * @return las empatadas O
	 */
	public int getEmpatadasO() {
		return empatadasO;
	}


	/**
	 * Establecer las empatadas O.
	 *
	 * @param empatadasO las nuevas empatadas O
	 */
	public void setEmpatadasO(int empatadasO) {
		this.empatadasO = empatadasO;
	}
	
	// METODOS


	/**
	 * Camibar turno.
	 */
	public void camibarTurno() {

		if( getTurno() == 0 ) {
			setTurno(1);
		} else {
			setTurno(0);
		}
	}

	/**
	 * Juego.
	 *
	 * @param matriz de matriz
	 * @return  int
	 */
	public int juego(int matriz[][]) {

		// COMPROBAR HORIZONTALES
		if (matriz[0][0] == matriz [0][1] && matriz[0][0] == matriz[0][2]) {
			return 1;
		}

		if (matriz[1][0] == matriz [1][1] && matriz[1][0] == matriz[1][2]) {
			return 1;
		}
		if (matriz[2][0] == matriz [2][1] && matriz[2][0] == matriz[2][2]) {
			return 1;
		}

		// COMPROBAR VERTICALES
		if (matriz[0][0] == matriz [1][0] && matriz[0][0] == matriz[2][0]) {
			return 1;
		}

		if (matriz[0][1] == matriz [1][1] && matriz[0][1] == matriz[2][1]) {
			return 1;
		}
		if (matriz[0][2] == matriz [1][2] && matriz[0][2] == matriz[2][2]) {
			return 1;
		}

		// COMPROBAR DIAGONALES


		if (matriz[0][0] == matriz [1][1] && matriz[0][0] == matriz[2][2]) {
			return 1;
		}
		if (matriz[2][0] == matriz [1][1] && matriz[2][0] == matriz[0][2]) {
			return 1;
		}

		return 0;
	}

	/**
	 * Ejecutar.
	 *
	 * @param bt de bt
	 * @param i de i
	 * @param j de j
	 * @param matriz dematriz
	 * @param gX de g X
	 * @param gO de g O
	 * @param eX de e X
	 * @param eO de e O
	 * @param pX de p X
	 * @param pO de p O
	 * @return de int
	 */
	// METODO EL CUAL LE PASAMOS  UN BOTON LA MATRIZ Y LABELS PARA QUE EN LA VENTANA SE ESTABLEZCAN 
	public int ejecutar(JButton bt,int i, int j, int matriz[][],JLabel gX, JLabel gO, JLabel eX, JLabel eO, JLabel pX,JLabel pO ) {

		matriz[i][j] = getTurno();

		String resultado = new String();
	
		// DEPENDIENDO DEL TURNO ESTABLECEMOS LAS FICHAS X Y O
		if (getTurno() == 0) {
			resultado = "X";
			
		} else {
			resultado = "O";
			
		}

		// CAMBIAMOS DE TURNO Y ESTABLECEMOS EN  EL BOTON LA FICHA X o LA O
		camibarTurno();
		bt.setText(resultado);
		bt.setEnabled(false);
		
	


		
		// SABER SI GANA EL JUGADOR 1 o EL 2 PARA MOSTRARLO EN EL JOPTIONPANE
		if (resultado.equals("X")) {
			resultado = Ventana.getJ1();
		} else if (resultado.equals("O")) {
			resultado = Ventana.getJ2();
		}
		
		if (juego(matriz) != 0) {
			JOptionPane.showMessageDialog(null, "Ha ganado el jugador: " +  resultado );
			if (getTurno() == 1) {
				
				//GANDAS ++
				setPuntosX(getPuntosX()+1);
				gX.setText(String.valueOf(getPuntosX()));
				
				
				//PERDIDAS ++
				setPerdidasO(getPerdidasO() + 1);
				pO.setText(String.valueOf(getPerdidasO()));
				
				
				contadorEmpate = 0;

			}
			if (getTurno() == 0) {
				
				//GANDAS ++
				setPuntosO(getPuntosO()+1);
				gO.setText(String.valueOf(getPuntosO()));		
				
				//PERDIDAS ++
				setPerdidasX(getPerdidasX() + 1);
				pX.setText(String.valueOf(getPerdidasX()));
				
				contadorEmpate = 0;
			}
			return 1;
		} 
				
		else {
			comprobarEmpate(eX, eO);
		
		}
		
		

		return 0;

	}


	/**
	 * Comprobar empate.
	 *
	 * @param eX de e X
	 * @param eO de e O
	 * @return de int
	 */
	public int comprobarEmpate(JLabel eX, JLabel eO) {
		contadorEmpate++;
		if (contadorEmpate == 9) {
			JOptionPane.showMessageDialog(null, "EMPATE!! ");
			setEmpatadasX(getEmpatadasX() + 1);
			setEmpatadasO(getEmpatadasO() + 1);
		
			eX.setText(String.valueOf(getEmpatadasX()));
			eO.setText(String.valueOf(getEmpatadasO()));
			
			Ventana.restart();
			return 1;
			
		} 
		return 0;
	}


}





