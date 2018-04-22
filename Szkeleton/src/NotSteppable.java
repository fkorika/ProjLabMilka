import java.io.FileWriter;
import java.io.IOException;

public class NotSteppable extends Field {

	public boolean wantsToMoveHere(Direction d, Movable m) {
		return false;
	}

	public void printField(FileWriter output) throws IOException {
		output.write('N');
	}

}