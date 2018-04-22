import java.io.FileWriter;
import java.io.IOException;

public abstract class Movable {

	protected Field field;
	protected int forceRemaining;

	public boolean setForceRemaining(int f) {
		forceRemaining = f;
		return true;
	}

	public int getForceRemaining() {
		return forceRemaining;
	}

	public Field getField() {
		return field;
	}

	public void setField(Field f) {
		field = f;
	}

	public void printMovable(FileWriter output) throws IOException {
		;
	}

	public abstract void die();

	public abstract boolean isCrate();
}