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
		System.out.println("1~" + a + "까지 4의 배수의 합은 " + sum + "입니다.");
		SC.close();
	}

}
 