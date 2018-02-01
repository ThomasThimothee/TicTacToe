/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe.impl;

import java.util.Scanner;
import tictactoe.TicTacToeBoard;
import tictactoe.TicTacToePlayer;

/**
 *
 * @author thomasthimothee
 */
public class HumanTicTacToePlayer implements TicTacToePlayer {

    private int id;

    @Override
    public void startNewGame(int playerID) {
        id = playerID;
        System.out.println("Player" + id + " is in the place");
    }

    @Override
    public int takeTurn(TicTacToeBoard board, int[] validPositions) {
        System.out.println("Player " + id + " Taking turn:");
        //Show board
        System.out.print(board.get(0));
        System.out.print(board.get(1));
        System.out.println(board.get(2));
        System.out.print(board.get(3));
        System.out.print(board.get(4));
        System.out.println(board.get(5));
        System.out.print(board.get(6));
        System.out.print(board.get(7));
        System.out.println(board.get(8));
        System.out.println("Enter your position: ");
        Scanner scanner = new Scanner(System.in);
        int position = Integer.parseInt(scanner.nextLine());
        return position;
    }

    @Override
    public void endGame(int result) {
        System.out.println(id + " Result: " + result);
    }

}
