import cs251.lab2.*;

public interface OthelloInterface{
    int getSize();
	void initializeGame();
	String getBoardString();
	Piece getCurrentTurn();
	void setComputerPlayer(String opponent);
	Result handleClickAt(int row, int col);
}