import java.util.*;

public class Sum {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.print("���� ���� : ");
		int a = SC.nextInt();
		System.out.print("������ ���� : ");
		int b = SC.nextInt(), sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "���� " + b + "������ ���� " + sum);
		SC.close();
	}

}
