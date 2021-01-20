package boardgame;

public class Position {
	private int row;
	private int column;
	public Position(int row, int column) {
		this.row = row;
		this.column = column;
	}

	
	public int getRow() {
		return row;
	}


	public void setRow(int row) {
		this.row = row;
	}


	public int getColumn() {
		return column;
	}
	
	public void setValues(int row, int columns) {
		this.row = row;
		this.column = columns;
	}


	public void setColumn(int column) {
		this.column = column;
	}


	@Override
	public String toString() {
		return row + ", " + column;
	}
}
