package kr.brain02;

import java.util.*;

public class Gugudan {
	
	private int col = 9;
	private int row = 9;
	int dan = 2; // 구구단 번위의 시작
	
	public Gugudan(int dan) {
		this.dan = dan;
	}// 매개변수 1개인 생성자를 만들었어. 이렇게 되면 기본 생성자가 없는 거임.
	
	// 지정한 단만 출력
	
	// static은 객체가 생성되기 전부터 사용하기 때문에
	// col을 사용하지 못해, 왜냐면 정적메소드가 먼저 실행되거든
	// 정적메소드 이태릭체로 표현됨
	public static void printOne(int dan) {
		for(int x = 1; x <= 9; x++) {
			// 인스턴스 변수 : 객체가 생성되면 메모리에 적재
			System.out.println(dan + "*" + x + "=" + dan*x);
		}
	}
	
	// 2~9단을 출력
	public void printAll(int dan) { //여기의 dan은 지역변수, 메소드 안에서만 유효
		for (int y = 2; y <= row; y++) {
			System.out.printf("★ %d단 입니다!\n", y);
			printOne(y);
		}
	}
	// dan부터 9단까지 출력
	public void printEnd(int dan) { //여기의 dan은 지역변수, 메소드 안에서만 유효
		for (int y = 2; y <= dan; y++) {
			System.out.printf("★ %d단 입니다!\n", y);
			printOne(y);
		}
	}
	
	// dan부터 9단까지 출력
	public void printFrom(int dan) { //여기의 dan은 지역변수, 메소드 안에서만 유효
		for (int y = dan; y <= row; y++) {
			System.out.printf("★ %d단 입니다!\n", y);
			printOne(y);
		}
	}
	
	int st = 0;
	int ed = 0;
	public void printSTED(int st, int ed) {
		for (int y = st; y <= ed; y++) {
			System.out.printf("★ %d단 입니다!\n", y);
			printOne(y);
		}
	}
	
	
}
