import java.util.*;
public class TestExam {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("500이하의 자연수를 입력하세요.");
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
		System.out.println("1~"+number+"까지 3의 배수이면서 홀수인 수의 합은 "+sum+"입니다.");
		SC.close();
	}

}
