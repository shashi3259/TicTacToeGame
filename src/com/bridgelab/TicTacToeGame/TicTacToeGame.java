package com.bridgelab.TicTacToeGame;

import java.util.Scanner;

public class TicTacToeGame {
	static Scanner sc = new Scanner(System.in);
	static char[] board = new char[10];
	static void createABoard() {
		
		System.out.println("Welcome to Tic Tac Toe Game");
		for(int i=1; i<10; i++) {
			board[i]= 'X';
		}
	}
	static void playerInput() {
		System.out.println("X or x is the input from Player");
		System.out.println("O or o is the input from Computer");
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Input for player");
		char Player = sc.next().charAt(0);
		System.out.println("Enter the Input for Computer");
		char Computer = sc.next().charAt(0);
		if(Player == 'X' || Player == 'x' ) {
		} 
		else {
			System.out.println("Wrong Input from player");
		}
		if(Computer=='O' || Computer == 'o') {
		}
		else {
			System.out.println("Wrong Input from computer");
		}
	}
	
	static void showBoard()  {
//		System.out.println(board[1] + "__|"+ board[2] +"__|__" + board[3]);
//		System.out.println(board[4] + "__|"+ board[5] +"__|__" + board[6]);
//		System.out.println(board[7] + "__|"+ board[8] +"__|__" + board[9]);
//		System.out.println("   |"+"   |");
//		board[1]='X';
//		board[2]='O';
//		board[3]='X';
//		board[4]='O';
//		board[5]='X';
//		board[6]='O';
//		board[7]='X';
//		board[8]='O';
//		board[9]='X';
		
		System.out.println(board[1] + "|"+ board[2] +"|" + board[3]);
		System.out.println("-----");
		System.out.println(board[4] + "|"+ board[5] +"|" + board[6]);
		System.out.println("-----");
		System.out.println(board[7] + "|"+ board[8] +"|" + board[9]);
	}
	
	static void desiredLocation() {
		System.out.println("Where you want to play ?");
		String playerInput = sc.nextLine();
		
		switch(playerInput) {
		case "1":
			board[1]='X';
			break;
		case "2":
			board[2]='X';
			break;
		case "3":
			board[3]='X';
			break;
		case "4":
			board[4]='X';
			break;
		case "5":
			board[5]='X';
			break;
		case "6":
			board[6]='X';
			break;
		case "7":
			board[7]='X';
			break;
		case "8":
			board[8]='X';
			break;
		case "9":
			board[9]='X';
			break;
		}
		
	}
	
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		createABoard();
	playerInput();
		showBoard();
		desiredLocation();

	}

}
