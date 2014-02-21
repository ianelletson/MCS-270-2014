package test.edu.gac.mcs270.hvidsten.tictactoe;
import edu.gac.mcs270.hvidsten.tictactoe.*;

import static org.junit.Assert.*;

import org.junit.Test;

public class TicTacModelTest {

	@Test
	public void testListHasWin() {
		TicTacController control = new TicTacController(3);
		TicTacModel model = new TicTacModel();
		control.setGameModel(model);
		
		char[] testList = {'x','x','x'};
		Position[] posList = makePositionList(testList);
		assertTrue(model.listHasWin(posList));
		
//		char[] testList2 = {'x','x','o'};
//		posList = makePositionList(testList2);
//		assertTrue(model.listHasWin(posList));
	}
	
	@Test
	public void testWinGameState() {
		TicTacController control = new TicTacController(3);
		TicTacModel model = new TicTacModel();
		control.setGameModel(model);
		
		char[] testList = {'x','o','-','x','x','x','o','-','x'};
		Position[][] board = makePositionBoard(testList);
		model.setBoard(board);
	}

	public Position[] makePositionList(char[] chars){
		Position[] posArray = new Position[chars.length];
		int i = 0;
		for (char c : chars) {
			posArray[i] = new Position(0,0);
			if (c == 'x') posArray[i].setToXPosition();
			else if (c=='o') posArray[i].setToOPosition();
			else {}
			i++;
		}
		return posArray;
	}
	
	public Position[][] makePositionBoard(char[] chars){
		Position[][] board = new Position[3][3];
		Position[] posList = makePositionList(chars);
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				board[i][j] = posList[i+j];
			}
		}
		return board;
	}
}
