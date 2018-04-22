import java.io.FileWriter;
import java.io.IOException;

public class Switch extends Field {

	private SwitchableHole switchableHole;
	private int number;

	public int getNumber() {
		return number;
	}

	public Switch(int n) {
		number = n;
	}

	public SwitchableHole getSwitchable() {
		return switchableHole;
	}

	public void setSwitchableHole(SwitchableHole sw) {
		switchableHole = sw;
	}

	public boolean wantsToMoveHere(Direction d, Movable m) {
		if (super.wantsToMoveHere(d, m)) {
			if (movable.isCrate())
				switchableHole.activate();
			else
				switchableHole.deactivate();
			return true;
		} else
			return false;
	}

	public boolean someoneMovesHere(Direction d, Crate movableWhoWantsToMoveHere, Worker movableAlreadyHere) {
		if (super.someoneMovesHere(d, movableWhoWantsToMoveHere, movableAlreadyHere)) {
			switchableHole.activate();
			return true;
		} else
			return false;
	}

	public boolean someoneMovesHere(Direction d, Worker movableWhoWantsToMoveHere, Crate movableAlreadyHere) {
		if (super.someoneMovesHere(d, movableWhoWantsToMoveHere, movableAlreadyHere)) {
			switchableHole.deactivate();
			return true;
		} else
			return false;
	}

	public void printField(FileWriter output) throws IOException {
		output.write('S');
		output.write(number);
	}

}