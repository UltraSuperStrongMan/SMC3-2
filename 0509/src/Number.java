import java.util.Scanner;

public class Number {
	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.print("10���� ���� ���� �� �ϳ��� ���纸����(1 ~ 50����) : ");
		int num = SC.nextInt();

		int[] arr = new int[10];
		for (int i = 0; i <= 9; i++) {
			arr[i] = (int) (Math.random() * 50 + 1);
			System.out.print(arr[i] + " ");
		}
		for (int i = 0; i <= 9; i++) {
			if (arr[i] == num) {
				System.out.println("\n��÷! ��ġ�ϴ� ���ڰ� �ֽ��ϴ�.");
				break;
			} 
			else if(i == 9){
				System.out.println("\n��! ������ȸ��~");
				break;
			}
		}
		SC.close();
	}
}