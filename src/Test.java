
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 创建两个圆
		GeometricObject g1 = new Circle(3.5);
		GeometricObject g2 = new Circle(2.5);
		// 求两个圆中的较大者
		if (GeometricObject.max(g1, g2) == g1) {
			System.out.println("g1 大");
		} else {
			System.out.println("g2 大");
		}
		
		// 创建两个矩形
		GeometricObject g3 = new Rectangle(2, 4);
		GeometricObject g4 = new Rectangle(3, 3);
		// 求两个矩形中的较大者
		if (GeometricObject.max(g3, g4) == g3) {
			System.out.println("g3 大");
		} else {
			System.out.println("g4 大");
		}
	}

}
