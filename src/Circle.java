
public class Circle extends GeometricObject {
	protected double radius;
	
	Circle(double radius) {
		this.radius = radius;
	}
	
	// ʵ�ָ���ĳ��󷽷�
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return Math.PI * radius * radius;
	}
	
}