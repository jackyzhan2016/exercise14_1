// 定义 GeometricObject 为抽象类并实现 Comparable 接口
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
	
	// 实现了 Comparable 接口的 compareTo 方法
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
	
	// 静态方法，比较两个 GeometricObject 对象的大者，并返回它
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
	
	// 抽象方法，子类实现这个方法
	abstract public double getArea();
}
