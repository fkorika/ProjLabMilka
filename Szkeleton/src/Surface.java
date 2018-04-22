import java.io.FileWriter;
import java.io.IOException;

public class Surface {

	protected int extraForceNeeded;
	protected Field field;

	public Surface() {
		;
	}

	public Surface(Field f) {
		extraForceNeeded = 0;
		field = f;
		f.setSurface(this);
	}

	public Field getField() {
		return field;
	}

	public void setField(Field f) {
		field = f;
	}

	public int getExtraForceNeeded() {
		return extraForceNeeded;
	}

	public void setExtreaForceNeeded(int fr) {
		extraForceNeeded = fr;
	}

	public void printSurface(FileWriter output) throws IOException {
		output.write('X');
	}
}