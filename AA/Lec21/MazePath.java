package Codes;

import java.util.Scanner;

public class MazePath {
	static boolean val = false;

	public static void printAns(int ansArr[][]) {
		for (int i = 0; i < ansArr.length; i++) {
			for (int j = 0; j < ansArr[0].length; j++) {
				System.out.print(ansArr[i][j] + " ");
			}
			System.out.println();
		}
	}

	public static void mazePath(char maze[][], int cr, int cc, int ansArr[][]) {
		if (cc < 0 || cr < 0 || cr >= maze.length || cc >= maze[0].length || maze[cr][cc] == 'X') {
			return;
		}
		if (cr == maze.length - 1 && cc == maze[0].length - 1) {
			ansArr[cr][cc] = 1;
			val = true;
			printAns(ansArr);
		}
		maze[cr][cc] = 'X';
		ansArr[cr][cc] = 1;
		mazePath(maze, cr - 1, cc, ansArr);// up
		mazePath(maze, cr, cc - 1, ansArr);// left
		mazePath(maze, cr + 1, cc, ansArr);// down
		mazePath(maze, cr, cc + 1, ansArr);// right
		maze[cr][cc] = '0';
		ansArr[cr][cc] = 0;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int row = sc.nextInt();
		int col = sc.nextInt();
		char maze[][] = new char[row][col];
		for (int i = 0; i < maze.length; i++) {
			String s = sc.next();
			for (int j = 0; j < s.length(); j++) {
				maze[i][j] = s.charAt(j);
			}
		}
		int ansArr[][] = new int[row][col];
		mazePath(maze, 0, 0, ansArr);
		if (!val) {
			System.out.println("No Path found");
		}
	}
}
