import javax.swing.SwingUtilities;
/*
 * Tic Tac Toe GUI Project Part 2 (Java Swing)
 * https://www.youtube.com/watch?v=xJ72uh4zLGk
*/

public class Main {

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			public void run() {
				new TicTacToeGUI();
			} // FINAL public void run()
		}); // FINAL SwingUtilities.invokeLater(new Runnable()
	}  // FINAL public static void main
	
}  // FINAL class Main
