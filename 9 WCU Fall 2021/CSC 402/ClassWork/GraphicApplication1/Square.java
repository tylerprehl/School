//package beforevisitor;

public class Square implements Shape {
	public void draw(Visitor v) {
      Visitor.draw(this);
   }
}
