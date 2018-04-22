import java.io.FileWriter;
import java.io.IOException;

public class SwitchableHole extends Hole {

	private Switch _switch;
	private boolean state;
	private int number;

	public int getNumber() {
		return number;
	}

	public SwitchableHole(int n) {
		number = n;
		state = false;
	}

	public void setSwitch(Switch s) {
		_switch = s;
	}

	public Switch getSwitch() {
		return _switch;
	}

	public boolean getState() {
		return state;
	}

	public void setState(boolean b) {
		state = b;
	}

	public void activate() {
		state = true;
		if (isOccupied()) {
			movable.die();
			movable.setField(null);
			movable = null;
		}
	}

	public void deactivate() {
		state = false;
	}

	public boolean wantsToMoveHere(Direction d, Movable m) {
		if (state)
			return true;
		else
			return super.wantsToMoveHere(d, m);
	}

	public void printField(FileWriter output) throws IOException {
		output.write('K');
		output.write(number);
	}
}