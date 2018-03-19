
public class Warehouse {

	private Worker worker;
	private Crate crates;
	private int points[]; //enum Color
	private Field fields[][];
	
	public void addPoint(Color c){
		
		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "Color",
                param2Name = "";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
        
	}
	public void deleteCrate(Crate c){
		
		String objectName = this.toString().substring(this.toString().lastIndexOf('.') + 1, this.toString().lastIndexOf('@')),
                methodName = new Object() {
                }.getClass().getEnclosingMethod().getName(),
                param1Name = "Crate",
                param2Name = "";

        System.out.println(objectName + " executing method: " + methodName + " with parameters: " +
                param1Name + " " + param2Name);
        
	}
}
