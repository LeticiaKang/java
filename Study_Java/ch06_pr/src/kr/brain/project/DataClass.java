package kr.brain.project;
import java.util.*;
public class DataClass implements Gender{
	
	public static void main(String[] args) {
	
//		Scanner sc = new Scanner(System.in);
//		System.out.println("����� ���� �����ϰ� ��Ű���?");
//		System.out.println("������? (���� : 1, ���� 2)");
//		answer= sc.nextLine();
//}
		String ansr;
		
		DataClass person = new DataClass();
		System.out.println(person.QueGen("1"));
		
		
	}
	
	
		String answer;
		int score = 0;
		
		@Override
		public int QueGen(String answer) {
		//	Scanner sc = new Scanner(System.in);
		//	System.out.println("������? (���� : 1, ���� 2)");
		//	answer = sc.nextLine();
			
			if(answer == "1") {
				score = score + 10;
			}
			else if(answer == "2") {
				score  = score + 20;
			}
			return score;
			
		}

		
		
/*	
	@Override
	public void CalculScore(int queNum) {
		if (queNum == 1) {
			// ����
		}
		else if(queNum == 2) {
			// ����
		}
		else if(queNum == 3) {
			// ����
		}
		else if(queNum == 4) {
			// ����
		}
		else if(queNum == 5) {
			// ����
		}
*/		
		
		
		
//
}