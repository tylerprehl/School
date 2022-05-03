//package beforevisitor;

public class Triangle implements Shape {
	public void draw(Visitor v) {
      Visitor.draw(this);
   }
}
