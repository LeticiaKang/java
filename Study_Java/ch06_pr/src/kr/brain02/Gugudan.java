package kr.brain02;

import java.util.*;

public class Gugudan {
	
	private int col = 9;
	private int row = 9;
	int dan = 2; // ������ ������ ����
	
	public Gugudan(int dan) {
		this.dan = dan;
	}// �Ű����� 1���� �����ڸ� �������. �̷��� �Ǹ� �⺻ �����ڰ� ���� ����.
	
	// ������ �ܸ� ���
	
	// static�� ��ü�� �����Ǳ� ������ ����ϱ� ������
	// col�� ������� ����, �ֳĸ� �����޼ҵ尡 ���� ����ǰŵ�
	// �����޼ҵ� ���¸�ü�� ǥ����
	public static void printOne(int dan) {
		for(int x = 1; x <= 9; x++) {
			// �ν��Ͻ� ���� : ��ü�� �����Ǹ� �޸𸮿� ����
			System.out.println(dan + "*" + x + "=" + dan*x);
		}
	}
	
	// 2~9���� ���
	public void printAll(int dan) { //������ dan�� ��������, �޼ҵ� �ȿ����� ��ȿ
		for (int y = 2; y <= row; y++) {
			System.out.printf("�� %d�� �Դϴ�!\n", y);
			printOne(y);
		}
	}
	// dan���� 9�ܱ��� ���
	public void printEnd(int dan) { //������ dan�� ��������, �޼ҵ� �ȿ����� ��ȿ
		for (int y = 2; y <= dan; y++) {
			System.out.printf("�� %d�� �Դϴ�!\n", y);
			printOne(y);
		}
	}
	
	// dan���� 9�ܱ��� ���
	public void printFrom(int dan) { //������ dan�� ��������, �޼ҵ� �ȿ����� ��ȿ
		for (int y = dan; y <= row; y++) {
			System.out.printf("�� %d�� �Դϴ�!\n", y);
			printOne(y);
		}
	}
	
	int st = 0;
	int ed = 0;
	public void printSTED(int st, int ed) {
		for (int y = st; y <= ed; y++) {
			System.out.printf("�� %d�� �Դϴ�!\n", y);
			printOne(y);
		}
	}
	
	
}