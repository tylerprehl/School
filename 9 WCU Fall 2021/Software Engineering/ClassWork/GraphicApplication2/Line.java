//package beforevisitor;

import java.awt.Color;
import java.awt.Graphics;

public class Line implements Shape {
	DrawingPanel panel = null;
	Color c = Color.GREEN;
	int x1 = 50;
	int y1 = 150;
	int x2 = 200;
	int y2 = 50;
	
	public Line(DrawingPanel panel) {
		this.panel = panel;
	}
	
	public void draw(Visitor v) {
		v.draw(this);
	}
}
