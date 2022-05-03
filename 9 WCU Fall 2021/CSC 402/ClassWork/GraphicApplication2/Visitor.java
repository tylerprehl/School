import java.awt.Color;
import java.awt.Graphics;

public class Visitor
{
   private static Visitor instance = null;
   
   private Visitor() {}
   
   public static Visitor getInstance() {
      if (instance == null)
         instance = new Visitor();
      return instance;
   }
   
   public void draw(Line l) {
		Graphics g = l.panel.getGraphics();
		g.setColor(l.c);
		g.drawLine(l.x1, l.y1, l.x2, l.y2);
	}
   
   public void draw(Circle cir) {
		Graphics g = cir.panel.getGraphics();
		g.setColor(cir.c);
		g.fillOval(cir.x, cir.y, cir.width, cir.height);
	}
   
   public void draw(Square s) {
		Graphics g = s.panel.getGraphics();
		g.setColor(s.c);
		g.fillRect(s.x, s.y, s.width, s.height);
	}   
}