import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.print("10개의 랜덤 숫자 중 하나를 맞춰보세요(1 ~ 50까지) : ");
		int num = SC.nextInt();

		int[] arr = new int[10];
		for (int i = 0; i <= 9; i++) {
			arr[i] = (int) (Math.random() * 50 + 1);
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i <= 9; i++) {
			if (arr[i] == num) {
				System.out.println("\n당첨! 일치하는 숫자가 있습니다.");
				break;
			} 
			else if(i == 9){
				System.out.println("\n꽝! 다음기회에~");
				break;
			}
		}
		SC.close();
	}
}