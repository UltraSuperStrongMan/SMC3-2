import java.util.*;
public class TestExam {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("500������ �ڿ����� �Է��ϼ���.");
		Scanner SC = new Scanner(System.in);
		int number = SC.nextInt();
		for(int i=0;i<=number;i++) {
			if(i%3==0) {
				if(i%2==1) {
					System.out.println(i);
					sum += i;
				}
			}
		}
		System.out.println("1~"+number+"���� 3�� ����̸鼭 Ȧ���� ���� ���� "+sum+"�Դϴ�.");
		SC.close();
	}

}
