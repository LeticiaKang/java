package kr.brain02;

// Gugudan클래스가 package에 있는 경우 / import 되는 경우(다른 패키디에 있는 클래스를 불러옴)

public class SubGugudan extends Gugudan {
	// 구구단에 있는 모든 매소드를 가져와서 쓸 수 있다.
	
	
	public SubGugudan(int dan) {
		super(dan); 
		// default면 컴파일러가 추가
	}
		// this 현재 클래스의 생성자를 호출
		// super 부모클래스의 생성자를 호출
	
	public void printFrom(int dan, String direction) {
		// direction의 up, down에 따라서 
		// up dan : dan부터 9단까지 출력
		//down dan :  2단부터 dan까지 출력
		// **** 매소드를 중첩했다 ****
		
//		if (direction.equals("up")) {
//			gugudan1.printFrom(dan);
//		}else if(direction.equals("down")){
//			gugudan1.printEnd(dan);
//		}
	}
	
	
}
