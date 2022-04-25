public class TriangleExam {
	public static void main(String args[]) {
		
		 int width;
		 int length;
		 Triangle T1 = new Triangle(10.2, 17.3);
		 System.out.println("밑변이 "+ T1.width + "이고, 높이가 " + T1.length + "인 삼각형의 넓이는 " + T1.Area() + "이다.");
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
		System.out.println("밑변이 "+ width + "이고, 높이가 " + length + "인 삼각형의 넓이는 " + Area + "이다.");
	}
	public double Area() {   
		return width*length/2;
	}
}