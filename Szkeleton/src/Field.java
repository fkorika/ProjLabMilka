import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class Field {

	protected Movable movable;
	protected HashMap<Direction, Field> neighbors;
	protected Surface surface;

	public Field() {
		neighbors = new HashMap<Direction, Field>();
	}

	public void setSurface(Surface s) {
		surface = s;
	}

	public Surface getSurface() {
		return surface;
	}

	public Movable getMovable() {
		return movable;
	}

	public void setMovable(Movable m) {
		movable = m;
	}

	public void setNeighbors(Direction d, Field f) {
		neighbors.put(d, f);
	}

	public Field getNeighbors(Direction d) {
		return neighbors.get(d);
	}

	public void wantsToMoveFrom(Direction d) {
		Field neighborInDirection = getNeighbors(d);
		if (neighborInDirection.wantsToMoveHere(d, movable)) {
			setMovable(null);
		}
	}

	public boolean wantsToMoveHere(Direction d, Movable m) {
		if (!isOccupied()) {
			setMovable(m);
			m.setField(this);
			return true;
		} else {
			if (m.isCrate()) {
				if (movable.isCrate()) {
					if (someoneMovesHere(d, (Crate) m, (Crate) movable)) {
						m.setField(this);
						setMovable(m);
						return true;
					} else
						return false;
				} else {
					if (someoneMovesHere(d, (Crate) m, (Worker) movable)) {
						m.setField(this);
						setMovable(m);
						return true;
					} else
						return false;
				}
			} else {
				if (movable.isCrate()) {
					if (someoneMovesHere(d, (Worker) m, (Crate) movable)) {
						m.setField(this);
						setMovable(m);
						return true;
					} else
						return false;
				} else {
					if (someoneMovesHere(d, (Worker) m, (Worker) movable)) {
						m.setField(this);
						setMovable(m);
						return true;
					} else
						return false;
				}
			}
		}
	}

	public boolean isOccupied() {
		if (movable == null)
			return false;
		else
			return true;
	}

	public boolean someoneMovesHere(Direction d, Crate movableWhoWantsToMoveHere, Crate movableAlreadyHere) {
		if (movableWhoWantsToMoveHere.getForceRemaining() == 0)
			return false;
		else {
			if (!movableAlreadyHere.setForceRemaining(
					movableWhoWantsToMoveHere.getForceRemaining() - surface.getExtraForceNeeded() - 1))
				return false;
			else {
				Field neighborInDirection = getNeighbors(d);
				if (neighborInDirection.wantsToMoveHere(d, movable)) {
					movableWhoWantsToMoveHere.setField(this);
					setMovable(movableWhoWantsToMoveHere);
					return true;
				} else
					return false;
			}
		}
	}

	public boolean someoneMovesHere(Direction d, Crate movableWhoWantsToMoveHere, Worker movableAlreadyHere) {
		if (movableWhoWantsToMoveHere.getForceRemaining() == 0)
			return false;
		else {
			if (!movableAlreadyHere.setForceRemaining(
					movableWhoWantsToMoveHere.getForceRemaining() - surface.getExtraForceNeeded() - 1))
				return false;
			else {
				movableAlreadyHere.setbeingPushed(true);
				Field neighborInDirection = getNeighbors(d);
				if (neighborInDirection.wantsToMoveHere(d, movable)) {
					movableWhoWantsToMoveHere.setField(this);
					setMovable(movableWhoWantsToMoveHere);
					return true;
				} else {
					movable.die();
					movableWhoWantsToMoveHere.setField(this);
					setMovable(movableWhoWantsToMoveHere);
					return true;
				}
			}
		}
	}

	public boolean someoneMovesHere(Direction d, Worker movableWhoWantsToMoveHere, Crate movableAlreadyHere) {
		if (movableWhoWantsToMoveHere.isBeingPushed())
			return false;
		else {
			if (!movableAlreadyHere
					.setForceRemaining(movableWhoWantsToMoveHere.getStrength() - surface.getExtraForceNeeded() - 1))
				return false;
			else {
				Field neighborInDirection = getNeighbors(d);
				if (neighborInDirection.wantsToMoveHere(d, movable)) {
					movableWhoWantsToMoveHere.setField(this);
					setMovable(movableWhoWantsToMoveHere);
					return true;
				} else {
					return false;
				}
			}
		}
	}

	public boolean someoneMovesHere(Direction d, Worker movableWhoWantsToMoveHere, Worker movableAlreadyHere) {
		return false;
	}

	public void printField(FileWriter output) throws IOException {
		output.write('F');
	}

	public void printSurface(FileWriter output) throws IOException {
		surface.printSurface(output);
	}

	public void printMovable(FileWriter output) throws IOException {
		if (movable == null)
			output.write('X');
		else
			movable.printMovable(output);
	}

}