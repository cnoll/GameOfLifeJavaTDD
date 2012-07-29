package gol;

public class Cell {
	boolean alive;
	
	public Cell() {
		// TODO Auto-generated constructor stub
		this.alive = false;
	}
	public boolean isAlive() {
		// TODO Auto-generated method stub
		return this.alive;
	}

	public void giveBirth() {
		// TODO Auto-generated method stub
		this.alive = true;
	}
	public void kill() {
		// TODO Auto-generated method stub
		this.alive = false;
	}

}
