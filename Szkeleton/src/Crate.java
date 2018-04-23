import java.io.FileWriter;
import java.io.IOException;

//Egy ládát reprezentál. Egy láda, ha lyukba esik, akkor képes meghalni.
//Ha éppen megtolják, akkor képes arra, hogy másik ládát toljon, illetve,
//ha egy munkást rátolnak, képes arra, hogy megölje az munkást.

public class Crate extends Movable {

	Warehouse warehouse;

	public Crate(Field f, Warehouse w) {
		field = f;
		f.setMovable(this);
		warehouse = w;
		warehouse.addCrate(this);
	}
	//Meghívja a Warehouse deleteCrate(c: Crate) függvényét önmagával,
	//illetve a Field-je Movable attribútumát null-ra állítja.
	public void die() {
		warehouse.deleteCrate(this);
	}
	
	public void setField(Field f) {
		field = f;
	}

	public Field getField() {
		return field;
	}
	//Kiiíró függvény
	public void printMovable(FileWriter output) throws IOException {
		output.write('C');
	}
	//Megvizsgálja, hogy láda-e
	public boolean isCrate() {
		return true;
	}
}
