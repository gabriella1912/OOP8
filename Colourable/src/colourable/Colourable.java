package colourable;

import java.awt.Color;

public interface Colourable {

	Color color= Color.red;
	
	
	public Color getColor();
	public void setColor(Color color);
	public static void setDefaultColor(Colourable colourable) {
		colourable.setColor(Color.red);
	}
	
}


