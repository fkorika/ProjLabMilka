import java.io.FileWriter;
import java.io.IOException;

public class Hole extends Field {

	public boolean wantsToMoveHere(Direction d, Movable m) {
		return true;
	}

	public void printField(FileWriter output) throws IOException {
		output.write('H');
	}

}