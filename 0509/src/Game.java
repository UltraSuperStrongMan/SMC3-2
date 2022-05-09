import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		String User1, PC2 = "";
		int User2 = 0, PC1;
		Scanner SC = new Scanner(System.in);
		System.out.println("가위 바위 보!");
		User1 = SC.next();
		switch(User1) {
			case "가위" :
				User2 = 0;
				break;
			case "바위" :
				User2 = 1;
				break;
			case "보":
				User2 = 2;
				break;
		}
		PC1 = (int) (Math.random() * 2);
		switch(PC1) {
			case 0 :
				PC2 = "가위";
				break;
			case 1 :
				PC2 = "바위";
				break;
			case 2 :
				PC2 = "보";
				break;
		}
		System.out.println(PC2);
		if(User2 == PC1) {
			System.out.println("비겼다");
		}
		else if(User2 == 0 && PC1 == 1){
			System.out.println("졌다");
		}
		else if(User2 == 0 && PC1 == 2){
			System.out.println("이겼다");
		}
		else if(User2 == 1 && PC1 == 2){
			System.out.println("졌다");
		}
		else if(User2 == 1 && PC1 == 0){
			System.out.println("이겼다");
		}
		else if(User2 == 2 && PC1 == 0){
			System.out.println("졌다");
		}
		else if(User2 == 2 && PC1 == 1){
			System.out.println("이겼다");
		}
		SC.close();
	}
}