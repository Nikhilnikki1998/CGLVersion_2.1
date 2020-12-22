import org.junit.Test;
import org.junit.jupiter.api.Assertions;
public class testJunitBoard {
	@Test
	public void boardtestone() {
		Board board1=new Board(10);
		Board board2=new Board(10);
		board1.createBoard();
		board2.createBoard();
		board2=board1.generateNextGeneration(board2);
//		board1=board1;
//		Assertions.assertEquals("false", cell.toString());
		Assertions.assertEquals("..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........\n"
				+ "..........",board1.printBoard());
	}
//	@Test
//	public void boardtesttwo() {
//		Board board1=new Board(10);
//		Board board2=new Board(10);
//		board1.createBoard();
//		board2.createBoard();
//		board1.cell[1][3].setStatus(true);
//		board1.cell[1][4].setStatus(true);
//		board1.cell[2][4].setStatus(true);
//		board1.cell[5][3].setStatus(true);
//		board1.cell[5][4].setStatus(true);
//		board1.cell[6][2].setStatus(true);
//		board1.cell[6][3].setStatus(true);
//		board1.cell[7][5].setStatus(true);
//		board1.cell[8][4].setStatus(true);
//		board2=board1.Nextgen(board2);



}
