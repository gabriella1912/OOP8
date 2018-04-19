package geometric.runnable;

import geometric.*;

public class Main {

	public static void main(String[] args) {
		

		Prism cylinder= new Cylinder(3, 3.14);
		System.out.println(cylinder);
		Prism cuboid= new Cuboid(3, 2, 4);
		System.out.println(cuboid);

		if (cylinder.hasBiggerVolumeThan(cuboid)) {
			System.out.println("Cylinder is bigger");
		}
		else System.out.println("Cuboid is bigger");
	}

}
