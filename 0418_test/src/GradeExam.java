import java.util.*;

public class GradeExam {

	public static void main(String[] args) {
		Scanner SC = new Scanner(System.in);
		System.out.println("����, ����, ���� ������ 3���� ���� �Է�>>");
		Grade me = new Grade();
		me.math = SC.nextInt();
		me.science = SC.nextInt();
		me.english = SC.nextInt();
		System.out.println("����� "+me.average());
		SC.close();
		}

}

class Grade{
	int math;
	int science;
	int english;
	public int average() {
		return (math+science+english)/3;
	}
}
