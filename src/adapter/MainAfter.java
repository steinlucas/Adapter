package adapter;

import java.util.ArrayList;
import java.util.List;

public class MainAfter {
	
	public static void main(String[] args) {
		// Shape represents the used interface (type).
		List<Shape> shapes = new ArrayList<Shape>();
		
		// (create) LineAdapterClass adapts the Line class for the defined Interface in Shape.
		shapes.add(new LineAdapterClass());
		// (create) RectangleAdapterClass adapts the Rectangle class for the defined Interface in Shape.
		shapes.add(new RectangleAdapterClass());
		
		int x1 = 10, y1 = 20;
		int x2 = 30, y2 = 60;

		for (Shape shape : shapes) {
			shape.draw(x1, y1, x2, y2);
		}
	}
}
