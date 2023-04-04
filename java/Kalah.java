package kalah.java;
/**
 * Hauptprogramm für KalahMuster.
 * @since 29.3.2021
 * @author oliverbittel
 */
public class Kalah {
	
	private static final String ANSI_BLUE = "\u001B[34m";

	/**
	 *
	 * @param args wird nicht verwendet.
	 */
	public static void main(String[] args) {
		//testExample();
		//testHAGame();
		//testHHGame();
		testMiniMaxAndAlphaBetaWithGivenBoard();
	}
	
	/**
	 * Beispiel von https://de.wikipedia.org/wiki/Kalaha
	 */
	public static void testExample() { 
		KalahBoard kalahBd = new KalahBoard(new int[]{5,3,2,1,2,0,0,4,3,0,1,2,2,0}, 'B');
		kalahBd.print();
		
		System.out.println("B spielt Mulde 11");
		kalahBd.move(11);
		kalahBd.print();
		
		System.out.println("B darf nochmals ziehen und spielt Mulde 7");
		kalahBd.move(7);
		kalahBd.print();
	}
	
	/**
	 * Mensch gegen Mensch
	 */
	public static void testHHGame() {
		KalahBoard kalahBd = new KalahBoard();
		kalahBd.print();

		while (!kalahBd.isFinished()) {
			int action = kalahBd.readAction();
			kalahBd.move(action);
			kalahBd.print();
		}

		System.out.println("\n" + ANSI_BLUE + "GAME OVER");
	}

	/**
	 * Mensch gegen AI
	 */

	 public static void testHAGame() {
		KalahBoard kalahBd = new KalahBoard();
		kalahBd.print();

		while (!kalahBd.isFinished()) {
			if(kalahBd.curPlayer == 'A'){
				System.out.println("Bester Move MinMax: " + kalahBd.maxAction('A',5));
				System.out.println("Bester Move Alpha-Beta: " + kalahBd.alphaBetaSearch('A',5));
			}
			if(kalahBd.curPlayer == 'B'){
				System.out.println("Bester Move MinMax: " + kalahBd.maxAction('B', 5));
				System.out.println("Bester Move Alpha-Beta: " + kalahBd.alphaBetaSearch('B',5));

			}
			int action = kalahBd.readAction();
			kalahBd.move(action);
			kalahBd.print();
		}

		System.out.println("\n" + ANSI_BLUE + "GAME OVER");
		
	 }



	public static void testMiniMaxAndAlphaBetaWithGivenBoard() {
		KalahBoard kalahBd = new KalahBoard(new int[]{2, 0, 4, 3, 2, 0, 0, 1, 0, 1, 3, 2, 1, 0}, 'A');
		// A ist am Zug und kann aufgrund von Bonuszügen 8-aml hintereinander ziehen!
		// A muss deutlich gewinnen!
		kalahBd.print();

		while (!kalahBd.isFinished()) {
			int action;
			if (kalahBd.getCurPlayer() == 'A') {
				System.out.println("Best Move alphaBeta: " + kalahBd.alphaBetaSearch('A',5));
				System.out.println("This turn took "+KalahBoard.alphaBetaCount + " alpha/beta turns");
				System.out.println("Best Move MinMax: " + kalahBd.maxAction('A',5));
				System.out.println("This turn took "+KalahBoard.minMaxCount + " Min/Max turns");
			}
			action = kalahBd.readAction();
			kalahBd.move(action);
			kalahBd.print();

		}

		System.out.println("\n" + ANSI_BLUE + "GAME OVER");
	}
}
