package point;

import java.awt.Color;

import colourable.Colourable;

public class ColouredPoint extends Point implements Colourable {
 
	Color color;

	public ColouredPoint(int x, int y, Color color) {
		super(x, y);
		this.color = color;
	}
	
	public ColouredPoint(Color color) {
		super(0, 0);
		this.color = color;
	}

	@Override
	public String toString() {
		return "ColouredPoint [color=" + color + ", toString()=" + super.toString() + "]";
	}

	@Override
	public Color getColor() {
		// TODO Auto-generated method stub
		return color;
	}

	@Override
	public void setColor(Color color) {
		this.color=color;
		
	}
	

}
