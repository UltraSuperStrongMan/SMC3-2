import java.util.*;

public class scan {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		int a = SC.nextInt();
		int sum = 0;
		for (int i = 0; i <= a; i++) {
			if (i % 4 == 0) {
				sum += i;
			}
		}
		System.out.println("1~" + a + "���� 4�� ����� ���� " + sum + "�Դϴ�.");
		SC.close();
	}

}
 