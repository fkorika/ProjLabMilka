
public class Hole extends Field{
 
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
}
