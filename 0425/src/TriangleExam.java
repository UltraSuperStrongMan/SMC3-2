public class TriangleExam {
	public static void main(String args[]) {
		
		 int width;
		 int length;
		 Triangle T1 = new Triangle(10.2, 17.3);
		 System.out.println("�غ��� "+ T1.width + "�̰�, ���̰� " + T1.length + "�� �ﰢ���� ���̴� " + T1.Area() + "�̴�.");
		 T1.T2(2.4, 5.5);
	}
}

class Triangle{
	double width;
	double length;
	public Triangle(double width, double length){
		this.width = width;
		this.length = length;
	}
	public void T2(double width, double length){
		this.width = width;
		this.length = length;
		double Area = width*length/2;
		System.out.println("�غ��� "+ width + "�̰�, ���̰� " + length + "�� �ﰢ���� ���̴� " + Area + "�̴�.");
	}
	public double Area() {   
		return width*length/2;
	}
}