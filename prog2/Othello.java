// doesn't work import lab2.*;
//import Program2Othello.lab2.*;
//import Program2Othello.cs251.lab2.Oth;
package cs251.lab2;


class Othello implements OthelloInterface {
   String computerPlayer;
	Piece r;
	Result s; 
	
	Othello(){};

    public static void main(String[] args){
        Othello game = new Othello();
        if (args.length > 0){
            game.setComputerPlayer(args[0]);
        }
        OthelloGUI.showGUI(game);
    }
    public int getSize(){
		//specifies the number of rows and colimns on the game board. (board is square, only need one number).
		return 1;
	};

    public void initializeGame(){};

    public String getBoardString(){
		return "Hello";
	};

    public Piece getCurrentTurn(){
		return r;
	};
    public void setComputerPlayer(String opponent){
        //System.out.println(opponent);
    };
    public Result handleClickAt(int row, int col){
		//this method is called by the GUI whenever a click occurs on the game board. It will update the state of the game board and the return value is a value that describes the current state of the game
		//after the newly entered click is applied.
		return s;
	};
}