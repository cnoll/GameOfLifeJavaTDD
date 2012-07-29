package gol;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class CellTest {

	private Cell cell;
	
	@Before
	public void before(){
		this.cell = new Cell();
	}
	
	@Test
	public void testAStandardCellIsADeadCell() {
		assertFalse(this.cell.isAlive());
	}
	@Test
	public void testWhenCellIsGivenBirthItIsAlive() throws Exception {
		this.cell.giveBirth();
		assertTrue(this.cell.isAlive());
	}
	@Test
	public void testWhenCellIsKilledItIsNotAlive() throws Exception {
		this.cell.giveBirth();
		assertTrue(this.cell.isAlive());
		this.cell.kill();
		assertFalse(this.cell.isAlive());
	}
}
