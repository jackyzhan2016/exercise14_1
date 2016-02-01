// ���� GeometricObject Ϊ�����ಢʵ�� Comparable �ӿ�
public abstract class GeometricObject implements Comparable<Object> {
	private String color = "white";
	private boolean filled;
	private java.util.Date dateCreated;
	
	protected GeometricObject(){
		dateCreated = new java.util.Date();
	}
	
	protected GeometricObject(String color,boolean filled){
		dateCreated = new java.util.Date();
		this.color = color;
		this.filled = filled;
	}

	public String getColor(){
		return color;
	}

	public void setColor(String color){
		this.color = color;
	}

	public boolean ifFilled(){
		return filled;
	}

	public void setFilled(boolean filled){
		this.filled = filled;
	}

	public java.util.Date getDateCreated(){
		return dateCreated;
	}

	public String toString(){
		return "created on " + dateCreated + "\ncolor: " + color + " and filled: " + filled;
	}
	
	// ʵ���� Comparable �ӿڵ� compareTo ����
	@Override
	public int compareTo(Object o) {
		// TODO Auto-generated method stub
		double area = ((GeometricObject) o).getArea();
		double thisArea = getArea();
		if (thisArea > area) {
			return 1;
		} else if (thisArea < area) {
			return -1;
		}
		return 0;
	}
	
	// ��̬�������Ƚ����� GeometricObject ����Ĵ��ߣ���������
	public static GeometricObject max(GeometricObject g1, GeometricObject g2) {
		/*
		int result = g1.compareTo(g2);
		if (result > 0) {
			return g1;
		} else {
			return g2;
		}
		*/
		return g1.compareTo(g2) > 0 ? g1 : g2;
	}
	
	// ���󷽷�������ʵ���������
	abstract public double getArea();
}
