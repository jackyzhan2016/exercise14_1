
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ��������Բ
		GeometricObject g1 = new Circle(3.5);
		GeometricObject g2 = new Circle(2.5);
		// ������Բ�еĽϴ���
		if (GeometricObject.max(g1, g2) == g1) {
			System.out.println("g1 ��");
		} else {
			System.out.println("g2 ��");
		}
		
		// ������������
		GeometricObject g3 = new Rectangle(2, 4);
		GeometricObject g4 = new Rectangle(3, 3);
		// �����������еĽϴ���
		if (GeometricObject.max(g3, g4) == g3) {
			System.out.println("g3 ��");
		} else {
			System.out.println("g4 ��");
		}
	}

}
