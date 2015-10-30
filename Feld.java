package minesweeper;

public class Feld {
	private boolean mine;
	private int numberOfMines;
	private boolean clicked;
	private int xCoordinate;
	private int yCoordinate;
	
	public Feld(int x, int y) {
		this.mine = false;
		this.numberOfMines = 0;
		this.clicked = false;
		this.xCoordinate = x;
		this.yCoordinate = y;
	}
	
	public Feld(boolean mine, int numberOfMines, boolean clicked) {
		this.mine = mine;
		this.numberOfMines = numberOfMines;
		this.clicked = clicked;
	}
	
	public void setMine() {
		this.mine = true;
	}
	
	public boolean getMine() {
		return this.mine;
	}
	
	public void setNumberOfMines(final int numberOfMines) {
		this.numberOfMines = numberOfMines;
	}
	
	public int getNumberOfMines() {
		return this.numberOfMines;
	}
	
	public void setClicked() {
		this.clicked = true;
	}
	
	public boolean getClicked() {
		return this.clicked;
	}
	
	public void setCoordinates(final int x, final int y) {
		this.xCoordinate = x;
		this.yCoordinate = y;
	}
	
	public int getXCoordinates() {
		return this.xCoordinate;
	}
	
	public int getYCoordinates() {
		return this.yCoordinate;
	}
}
