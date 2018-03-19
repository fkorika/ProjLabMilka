public class Crate extends Movable {

	private Warehouse warehouse;

	public void die() {
		
		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "",
                param2Name = "";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
        
	//	warehouse.deleteCrate(this);
	}
	
	public void setField(Field f) {
		
		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "Field",
                param2Name = "";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
        
		field = f;
	}
}
