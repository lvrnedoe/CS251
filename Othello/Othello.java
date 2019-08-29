// doesn't work import lab2.*;
//import Program2Othello.lab2.*;
//import Program2Othello.cs251.lab2.Oth;
package cs251.lab2;


class Othello implements OthelloInterface {
    String computerPlayer;

    public static void main(String[] args){
        Othello game = new Othello();
        if (args.length > 0){
            game.setComputerPlayer(args[0]);
        }
        OthelloGUI.showGUI(game);
    }
    public int getSize(){};

    public void initializeGame(){};

    public String getBoardString(){};

    Piece getCurrentTurn();
    public void setComputerPlayer(String opponent){
        //System.out.println(opponent);
    };
//Result handleClickAt(int row, int col);
}