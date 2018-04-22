import java.io.FileWriter;
import java.io.IOException;

public class Oil extends Surface {

	public Oil(Field f) {
		super.extraForceNeeded = -1;
		super.field = f;
		f.setSurface(this);
	}

	public void printSurface(FileWriter output) throws IOException {
		output.write('O');
	}

}