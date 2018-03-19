

public class Switch extends Field{

	private SwitchableHole switchableHole;
	
	public SwitchableHole getSwitchable(){

		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "",
                param2Name = "";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
        
		return switchableHole;
	}
	
	public boolean wantsToMoveHere(Direction d, Movable m){
		
		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "Direction",
                param2Name = "Movable";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
        
		return true;
	}
	
	public boolean someoneMovesHere(Direction d, Crate movableWhoWantsToMoveHere, Worker movableAlreadyHere){

		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "Direction",
                param2Name = "Crate Worker";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
		
		return true;
	}
	
	public boolean someoneMovesHere(Direction d, Worker movableWhoWantsToMoveHere, Crate movableAlreadyHere){

		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "Direction",
                param2Name = "Worker Crate";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
        
		return true;
	}
}






















