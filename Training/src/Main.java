import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        char[][] board = new char[3][3];
        for (int row = 0; row < board.length ; row++) {
            for (int col =0; col < board[row].length; col++) {
                board[row][col] = ' ';
            }
        }
        boolean gameOver = false;
        char Player = 'X';
        Scanner in = new Scanner(System.in);

        while(!gameOver){

            printBoard(board);
            System.out.println("Player" + Player+"enter :");
            int row = in.nextInt();
            int col = in.nextInt();
            //System.out.println(row + col);

            if(board[row][col] == ' '){
                board[row][col] = Player;
                gameOver = haveWon(board,Player);
                if (gameOver){
                    System.out.println("Player"+Player+" was won");
                }
                else {
                    if(Player == 'X'){
                        Player = 'O';
                    }
                    else {
                        Player = 'X';
                    }
                }
            }

            else {
                System.out.println(board[row][col]);
                System.out.println("Invalid Move. Try again!");
            }
        }

        printBoard(board);
    }

    public static boolean haveWon(char[][]board,char Player){

        //check row
            for (int row = 0; row < board.length; row++) {
                 if(board[row][0]==Player && board[row][1]==Player && board[row][2]==Player){
                     return true;
                 }
            }
        //check col
            for (int col = 0; col < board.length; col++) {
                if (board[0][col] == Player && board[1][col] == Player && board[2][col] == Player) {
                    return true;
                }
            }
        //check diagonal
            if(board[0][0]== Player && board[1][1] == Player && board[2][2] ==Player){
                   return true;
              }

            if(board[0][2]== Player && board[1][1] == Player && board[2][0] ==Player){
                  return true;
             }

        return false;
        }

    public static void printBoard(char[][]board){
        for (int row = 0; row < board.length ; row++) {
            for (int col = 0; col < board[row].length; col++) {
                System.out.print(board[row][col] + " | ");
            }
            System.out.println();
        }
    }
}