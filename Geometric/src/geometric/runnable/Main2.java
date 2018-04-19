package geometric.runnable;

import java.util.concurrent.CyclicBarrier;

import geometric.Cuboid;
import geometric.Cylinder;
import geometric.Prism;


public class Main2 {

	public static void main(String[] args) {
		PrismDataClass prismDataClass = new PrismDataClass(5);
		Prism cuboid= new Cuboid(4,2, 4);
		Prism cylinder1= new Cylinder(2, 6);
		Prism cylinder2= new Cylinder(4, 2);
		
		prismDataClass.setPrism(cuboid, 0);
		prismDataClass.setPrism(cylinder1, 2);
		prismDataClass.setPrism(cylinder2, 4);
		for (int i = 0; i < prismDataClass.getNumberOfPrisms(); i++) {
			System.out.println(prismDataClass.getPrism(i));
			
		}
		System.out.println(prismDataClass.getAvgVolume());
		System.out.println(prismDataClass.getNumberOfCylinders());
	}

}
