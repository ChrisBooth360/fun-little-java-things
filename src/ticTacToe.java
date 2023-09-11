import java.util.*;

public class ticTacToe {

    static String[] board;
    static String turnPlayer;
    static int turn;

    public static String checkWinner(String[] board, int turn) {

        for (int i = 0; i < 8; i++) {

            String line = null;

            switch (i) {
                case 0:
                    line = board[0] + board[1] + board[2];
                    break;
                case 1:
                    line = board[3] + board[4] + board[5];
                    break;
                case 2:
                    line = board[6] + board[7] + board[8];
                    break;
                case 3:
                    line = board[0] + board[3] + board[6];
                    break;
                case 4:
                    line = board[1] + board[4] + board[7];
                    break;
                case 5:
                    line = board[2] + board[5] + board[8];
                    break;
                case 6:
                    line = board[0] + board[4] + board[8];
                    break;
                case 7:
                    line = board[2] + board[4] + board[6];
                    break;
            }

            if (line.equals("XXX")) {
                return "X";
            } else if (line.equals("OOO")) {
                return "O";
            }

        }
        if (turn == 9) {
            return "draw";
        }

        return null;

    }

    public static void printBoard(String[] currentBoard) {

        System.out.println("--------------");
        System.out.println("| " + currentBoard[0] + " | " + currentBoard[1] + " | " + currentBoard[2] + " |");
        System.out.println("--------------");
        System.out.println("| " + currentBoard[3] + " | " + currentBoard[4] + " | " + currentBoard[5] + " |");
        System.out.println("--------------");
        System.out.println("| " + currentBoard[6] + " | " + currentBoard[7] + " | " + currentBoard[8] + " |");
        System.out.println("--------------");

    }

    public static String currentPlayer(String turn) {

        if (turn == "X") {
            return "O";
        } else {
            return "X";
        }

    }

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        board = new String[9];
        turnPlayer = "O";
        turn = 0;
        String winner = null;

        for (int i = 0; i < 9; i++) {
            board[i] = String.valueOf(i + 1);
        }

        System.out.println("Let's play some Tic Tac Toe!");
        printBoard(board);
        System.out.println("Os goes first. Input your choice:");

        while (winner == null) {
            turn += 1;
            int inputNum;

            try {
                inputNum = input.nextInt();
                if (inputNum < 0 && inputNum > 9) {
                    System.out.println("Invalid input. Please try again");
                    continue;
                }
            } catch (InputMismatchException e) {
                System.out.println("Invalid input. Please try again");
                continue;
            }

            if (board[inputNum - 1].equals(String.valueOf(inputNum))) {
                board[inputNum - 1] = turnPlayer;
                turnPlayer = currentPlayer(turnPlayer);

                printBoard(board);
                winner = checkWinner(board, turn);
            } else {
                System.out.println("Slot already taken. Try again:");
            }

        }
        if (winner.equalsIgnoreCase("draw")) {
            System.out.println("Looks like it was a draw! Better luck next time!");
        } else {
            System.out.println(winner + " is the winner!");
        }

        input.close();

    }

}
