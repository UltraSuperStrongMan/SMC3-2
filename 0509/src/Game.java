import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		String User1, PC2 = "";
		int User2 = 0, PC1;
		Scanner SC = new Scanner(System.in);
		System.out.println("���� ���� ��!");
		User1 = SC.next();
		switch(User1) {
			case "����" :
				User2 = 0;
				break;
			case "����" :
				User2 = 1;
				break;
			case "��":
				User2 = 2;
				break;
		}
		PC1 = (int) (Math.random() * 2);
		switch(PC1) {
			case 0 :
				PC2 = "����";
				break;
			case 1 :
				PC2 = "����";
				break;
			case 2 :
				PC2 = "��";
				break;
		}
		System.out.println(PC2);
		if(User2 == PC1) {
			System.out.println("����");
		}
		else if(User2 == 0 && PC1 == 1){
			System.out.println("����");
		}
		else if(User2 == 0 && PC1 == 2){
			System.out.println("�̰��");
		}
		else if(User2 == 1 && PC1 == 2){
			System.out.println("����");
		}
		else if(User2 == 1 && PC1 == 0){
			System.out.println("�̰��");
		}
		else if(User2 == 2 && PC1 == 0){
			System.out.println("����");
		}
		else if(User2 == 2 && PC1 == 1){
			System.out.println("�̰��");
		}
		SC.close();
	}
}