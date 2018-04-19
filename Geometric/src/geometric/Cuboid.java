package geometric;

public class Cuboid extends Prism {

	private double a;
	private double b;
	@Override
	public double getBaseArea() {
		// TODO Auto-generated method stub
		return a*b;
	}
	@Override
	public String toString() {
		return "Cuboid [a=" + a + ", b=" + b + ", getHeight()=" + getHeight() + "]";
	}
	public Cuboid(int height, double a, double b) {
		super(height);
		this.a = a;
		this.b = b;
	}

}
