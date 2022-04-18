import java.util.*;

public class Sum {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		int a = SC.nextInt();
		int b = SC.nextInt();
		int sum = 0;
		for (int i = a; i <= b; i++) {
			sum += i;
		}
		System.out.println(a + "부터 " + b + "까지의 합은 " + sum);
		SC.close();
	}

}  