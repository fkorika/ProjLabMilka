import java.io.FileWriter;
import java.io.IOException;

public class Crate extends Movable {

	Warehouse warehouse;

	public Crate(Field f, Warehouse w) {
		field = f;
		f.setMovable(this);
		warehouse = w;
		warehouse.addCrate(this);
	}

	public void die() {
		warehouse.deleteCrate(this);
	}

	public void setField(Field f) {
		field = f;
	}

	public Field getField() {
		return field;
	}

	public void printMovable(FileWriter output) throws IOException {
		output.write('C');
	}

	public boolean isCrate() {
		return true;
	}
}