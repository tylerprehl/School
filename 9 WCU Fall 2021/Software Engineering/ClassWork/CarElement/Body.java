//package beforevisitor;

public class Body implements CarElement {
	public int year = 1990;
	public String role = "protect passengers";
	public String color = "green";
	
	public void accept(Visitor v) {
      v.visit(this);
	}
}