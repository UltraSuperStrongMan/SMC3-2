import java.util.*;
public class SuperArray {

	public static void main(String[] args) {
		int arr[] = new int[5];
		int count = 0;
		int count2 = 0;
		Scanner SC = new Scanner(System.in);
		for(int i=0; i<5; i++) {
			System.out.println(i + "번 입력 : ");
			arr[i] = SC.nextInt();
		}	
		for (int i=0; i<arr.length; i++) {
			if (arr[i] > count) {
				count = arr[i];
				count2 = i;
			}
			} 
		System.out.println("가장 큰 수는 " + count2 + "번째 숫자인 " + count + " 입니다.");
	}
}
