
public class Rectangle extends GeometricObject {
	protected double width;
	protected double height;
	
	Rectangle(double width, double height) {
		this.width = width;
		this.height= height;
	}
	
	// ʵ�ָ���ĳ��󷽷�
	@Override
	public double getArea() {
		// TODO Auto-generated method stub
		return width * height;
	}
	
}