//import java.awt.BorderLayout;
import java.awt.Container;
//import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
//import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JOptionPane;
//import javax.swing.JOptionPane;

public class TicTacToeGUI extends JFrame {


	private static final long serialVersionUID = 1L;
	private Container pane;
	private String jugadorActual;
	//private JLabel nomJugadorActual;
	private JButton [][] taulell;
	private boolean	tenimGuanyador;
	private JMenuBar menuBar;
	private JMenu menu;
	private JMenuItem acaba;
	private JMenuItem novaPartida;
	
	/**
	 * Constructor: Interfície Gràfica del tres en ratlla
	 * @param cap
	 * @return void
	 */
	public TicTacToeGUI() {
		//  TicTacToeGUI Constructor
		super();
		pane = getContentPane();
		
		//JLabel emptyLabel = new JLabel("");
		//emptyLabel.setPreferredSize(new Dimension(175, 100));
		//pane.add(emptyLabel, BorderLayout.CENTER);

		// pane = getContentPane();
		pane.setLayout(new GridLayout(3,3));
		setTitle("Tica Tac Toe");
		setSize(500,500);
		setResizable(false);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setVisible(true);
		jugadorActual  = "x";
		// nomJugadorActual = new JLabel("El jugador actual és " + jugadorActual);
		taulell = new JButton[3][3];
		tenimGuanyador = false;
		initialitzaTaulell();
		initialitzaBarraMenu();
	}  // FINAL public TicTacToeGUI()
	
	/**
	 * Mètode: initialitza la barra de menus del tres en ratlla
	 * @param cap
	 * @return void
	 */
	private void initialitzaBarraMenu() {
		menuBar = new JMenuBar();
		menu = new JMenu("Fitxer");
		
		novaPartida = new JMenuItem("Nova partida");
		novaPartida.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				buidaTaulell();
			}
		});
		acaba = new JMenuItem("Acaba");
		acaba.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});

		menu.add(novaPartida);
		menu.add(acaba);
		menuBar.add(menu);
		setJMenuBar(menuBar);
	}  // FINAL private void initialitzaBarraMenu() {
	
	/**
	 * Mètode: buida el contingut del taulell.
	 * @param cap
	 * @return void
	 */	
	private void buidaTaulell() {
		jugadorActual  = "x";
		tenimGuanyador = false;
		for (int i = 0; i < 3; i++){
			for (int j = 0; j < 3; j++){
				taulell[i][j].setText("");
			}
		}
	}
	
	/**
	 * Mètode: initialitza el taulell.
	 * @param cap
	 * @return void
	 */		
	private void initialitzaTaulell() {
		// pane.add(nomJugadorActual);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++){
				final JButton boto = new JButton();
				boto.setFont(new Font(Font.SANS_SERIF,Font.BOLD,100));
				taulell[i][j] = boto;
				boto.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						if (((JButton)e.getSource()).getText().equals("") && 
						tenimGuanyador == false) {
							boto.setText(jugadorActual);
							tenimGuanyador();
							bescanviaJugador();
						}
				}
			});
			pane.add(boto);
			}
		}
	}

	/**
	 * Mètode: Bescanvia el Jugador.
	 * @param cap
	 * @return void
	 */	
	private void bescanviaJugador() {
		if (jugadorActual.equals("x"))
			jugadorActual = "o";
		else
			jugadorActual = "x";
	}
	

	private void tenimGuanyador(){	
		if        (taulell[0][0].getText().equals(jugadorActual) &&
				   taulell[1][0].getText().equals(jugadorActual) &&
				   taulell[2][0].getText().equals(jugadorActual)
					) {// 0,0 + 1,0 + 2,0
					JOptionPane.showMessageDialog(null, "El jugador "+jugadorActual+" ha guanyat!");
					tenimGuanyador = true;
		} else if (taulell[0][1].getText().equals(jugadorActual) &&
				   taulell[1][1].getText().equals(jugadorActual) &&
				   taulell[2][1].getText().equals(jugadorActual)
					) {// 0,1 + 1,1 + 2,1
					JOptionPane.showMessageDialog(null, "El jugador "+jugadorActual+" ha guanyat!");
					tenimGuanyador = true;
		} else if (taulell[0][2].getText().equals(jugadorActual) &&
				   taulell[1][2].getText().equals(jugadorActual) &&
				   taulell[2][2].getText().equals(jugadorActual)
					) {// 0,2 + 1,2 + 2,2
					JOptionPane.showMessageDialog(null, "El jugador "+jugadorActual+" ha guanyat!");
					tenimGuanyador = true;
		} else if (taulell[0][0].getText().equals(jugadorActual) &&
				   taulell[0][1].getText().equals(jugadorActual) &&
				   taulell[0][2].getText().equals(jugadorActual)
					) {// 0,0 + 0,1 + 0,2
					JOptionPane.showMessageDialog(null, "El jugador "+jugadorActual+" ha guanyat!");
					tenimGuanyador = true;
		} else if (taulell[1][0].getText().equals(jugadorActual) &&
			       taulell[1][1].getText().equals(jugadorActual) &&
			       taulell[1][2].getText().equals(jugadorActual)
					) {// 1,0 + 1,1 + 1,2
					JOptionPane.showMessageDialog(null, "El jugador "+jugadorActual+" ha guanyat!");
					tenimGuanyador = true;
		} else if (taulell[2][0].getText().equals(jugadorActual) &&
			       taulell[2][1].getText().equals(jugadorActual) &&
			       taulell[2][2].getText().equals(jugadorActual)
					) {// 2,0 + 2,1 + 2,2
					JOptionPane.showMessageDialog(null, "El jugador "+jugadorActual+" ha guanyat!");
					tenimGuanyador = true;
		} else if (taulell[0][0].getText().equals(jugadorActual) &&
				   taulell[1][1].getText().equals(jugadorActual) &&
				   taulell[2][2].getText().equals(jugadorActual)
					) {// 0,0 + 1,1 + 2,2
					JOptionPane.showMessageDialog(null, "El jugador "+jugadorActual+" ha guanyat!");
					tenimGuanyador = true;
		} else if (taulell[0][2].getText().equals(jugadorActual) &&
				   taulell[1][1].getText().equals(jugadorActual) &&
				   taulell[2][0].getText().equals(jugadorActual)
					) {// 0,2 + 1,1 + 2,0
					JOptionPane.showMessageDialog(null, "El jugador "+jugadorActual+" ha guanyat!");
					tenimGuanyador = true;
		}
	} 	// FINAL private void tenimGuanyador()
	
}   // FINAL public class TicTacToeGUI extends JFrame
