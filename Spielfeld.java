package minesweeper;

import java.math.*;

public class Spielfeld {
	private Feld[][] feld;
	private final int TOTAL_MINES = 35;
	
	public Spielfeld() {
		feld = new Feld[10][10];
		for (int x = 0; x < 10; x++) {
			for (int y = 0; y < 10; y++) {
				feld[x][y] = new Feld(x, y);
			}
		}
	}
	
	public void buryMines() {
		int x;
		int y;
		for (int i = 0; i < TOTAL_MINES; i++) {
			x = (int) Math.random() * 10;
			y = (int) Math.random() * 10;
			
			if (feld[x][y].getMine() == false) {
				feld[x][y].setMine();
			} else {
				i--;
			}
		}
	}
	
	public void calcuteNumberOfMines(final int x, final int y) {
		int count = 0;
		
		if (feld[x][y].getMine() == false) {
			for (int i = x-1; i < x+2; i++) {
				for (int j = y-1; j < y+2; j++) {
					if (feld[i][j].getMine() == true) {
						count++;
					}
				}
			}
		}
		
		
		feld[x][y].setNumberOfMines(count);
	}
}
