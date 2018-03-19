

public class Worker extends Movable {

	private boolean alive;
	private boolean beingPushed;
	private Warehouse warehouse;
	
	public boolean isBeingPushed(){
		
		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "",
                param2Name = "";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
        
		return true;
	}
	
	public void setBeingPushed(boolean b){

		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "boolean",
                param2Name = "";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
		
	}
	
	public void move(Direction d){

		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "Direction",
                param2Name = "";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
		
	}
	
	public void die(){

		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "",
                param2Name = "";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
		
	}
	
	public void setField(Field f){

		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "Field",
                param2Name = "";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
        
	}
	
	public Field getField(){

		Field f = new Field();
		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "",
                param2Name = "";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
        return f;
	}
}
