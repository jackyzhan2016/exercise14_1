
public class Rectangle extends GeometricObject {
	protected double width;
	protected double height;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height= height;
	}
	
	// 实现父类的抽象方法
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
}