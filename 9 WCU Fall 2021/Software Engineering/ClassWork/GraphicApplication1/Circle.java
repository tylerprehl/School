//package beforevisitor;

public class Circle implements Shape {	
	
   public void draw(Visitor v) {
      Visitor.draw(this);
   }
    
}
