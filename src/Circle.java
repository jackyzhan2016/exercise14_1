
public class Circle extends GeometricObject {
	protected double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	// 实现父类的抽象方法
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
}