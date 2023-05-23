//package beforevisitor;

public class Wheel implements CarElement {
	public int year = 1930;
	public String role = "support tires";
	public String color = "red";

	public void accept(Visitor v) {
      v.visit(this);
   }
}
