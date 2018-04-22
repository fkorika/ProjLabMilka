import java.io.FileWriter;
import java.io.IOException;

public class Worker extends Movable {

	private int strength;
	private boolean alive;
	private boolean beingPushed;
	private boolean honeyDeployed;
	private boolean oilDeployed;
	private Warehouse warehouse;
	private Color color;

	public Worker(Field f, Color c, Warehouse w) {
		color = c;
		field = f;
		f.setMovable(this);
		warehouse = w;
		warehouse.addWorker(c, this);
		strength = 5;
		alive = true;
		beingPushed = false;
		honeyDeployed = false;
		oilDeployed = false;
	}

	public boolean isCrate() {
		return false;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int s) {
		strength = s;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color c) {
		color = c;
	}

	public boolean getAlive() {
		return alive;
	}

	public void setAlive(boolean b) {
		alive = b;
	}

	public boolean getbeingPushed() {
		return beingPushed;
	}

	public void setbeingPushed(boolean b) {
		beingPushed = b;
	}

	public boolean getHoneyDeployed() {
		return honeyDeployed;
	}

	public void setHoneyDeployed(boolean b) {
		honeyDeployed = b;
	}

	public boolean getOilDeployed() {
		return oilDeployed;
	}

	public void DeployOil() {
		if (alive) {
			field.setSurface(new Oil(field));
			oilDeployed = true;
		}

	}

	public void DeployHoney() {
		if (alive) {
			field.setSurface(new Honey(field));
			honeyDeployed = true;
		}
	}

	public boolean isBeingPushed() {
		return beingPushed;
	}

	public void move(Direction d) {
		if (alive)
			this.getField().wantsToMoveFrom(d);
	}

	public void die() {
		alive = false;
	}

	public void setField(Field f) {
		field = f;
	}

	public Field getField() {
		return field;
	}

	public void printMovable(FileWriter output) throws IOException {
		output.write('W');
		output.write('/');
		if (color == Color.red)
			output.write('R');
		else
			output.write('B');
	}
}