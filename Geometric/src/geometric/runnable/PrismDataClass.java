package geometric.runnable;

import geometric.Cylinder;
import geometric.Prism;

public class PrismDataClass {
	
	Prism [] prism;

	public PrismDataClass(int numberOfCuboids) {
		super();
	prism= new Prism[numberOfCuboids];
	}


	public void setPrism(Prism prism, int index) {
		this.prism[index] = prism;
	}
	
	public int getNumberOfPrisms() {
		return prism.length;
	}
	
	public Prism getPrism(int index) {
		return prism[index];
	}
	
	public int getNumberOfNonNulls() {
		int counter= 0;
		for (Prism cuboid2 : prism) {
			if (cuboid2!=null) {
				counter++;
			}
		}
		return counter;
	}
	
	public double getAvgVolume() {
		double volume=0;
		for (Prism cuboid2 : prism) {
			if (cuboid2!=null) {
				volume+=cuboid2.getVolume();
			}
			
		}
		return volume/=prism.length;
	}
	
	public int getNumberOfCylinders() {
		int counter=0;
		for (Prism prism2 : prism) {
			if (prism2 instanceof Cylinder) {
				counter++;
			}
		}
		
		return counter;
	}
	

	
	
	
	

	
}
