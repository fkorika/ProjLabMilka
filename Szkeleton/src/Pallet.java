import java.io.FileWriter;
import java.io.IOException;

public class Pallet extends Field {

	private Warehouse warehouse;
	private Color color;

	public Warehouse getWarehouse() {
		return warehouse;
	}

	public void setWarehouse(Warehouse w) {
		warehouse = w;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color c) {
		color = c;
	}

	public Pallet(Color c, Warehouse w) {
		color = c;
		warehouse = w;
	}

	public boolean wantsToMoveHere(Direction d, Movable m) {
		if (super.wantsToMoveHere(d, m)) {
			warehouse.addPoint(color);
			return true;
		} else
			return false;
	}

	public boolean someoneMovesHere(Direction d, Crate movableWhoWantsToMoveHere, Crate movableAlreadyHere) {
		return false;
	}

	public boolean someoneMovesHere(Direction d, Crate movableWhoWantsToMoveHere, Worker movableAlreadyHere) {
		if (super.someoneMovesHere(d, movableWhoWantsToMoveHere, movableAlreadyHere)) {
			if (movable.isCrate())
				warehouse.addPoint(color);
			return true;
		} else
			return false;
	}

	public boolean someoneMovesHere(Direction d, Worker movableWhoWantsToMoveHere, Crate movableAlreadyHere) {
		return false;
	}

	public void printField(FileWriter output) throws IOException {
		output.write('P');
		output.write('/');
		if (color == Color.red)
			output.write('R');
		else
			output.write('B');
	}

}