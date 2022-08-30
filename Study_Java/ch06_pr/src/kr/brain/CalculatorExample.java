package kr.brain;

import kr.brain02.Gugudan;
import kr.brain02.GugudanExample;
import kr.brain02.SubGugudan;

public class CalculatorExample {
	private int operand1;
	private int operand2;
	private String operator;
	
	public static void main(String[] args) {
		// 기본 생성자(매개변수가 없는)를 호출하여 객체 생성
		/* 맨 앞 Calculator는 Class이름
		 * 뒤에 있는 건 매서드
		 */
		Gugudan.printOne(2);
//		Gugudan.printFrom(2); //정적메소드가 아니라 오류남
		// 객체는 없는데 printone만 메모리에 있음
		
		NewCalculator calculator = new NewCalculator();
		//		 참조변수(stack)	   객체(heap) 생성
		System.out.println( calculator.calc() );
		
		calculator = new NewCalculator(23, "*", 40);
		System.out.println("1111 : " + calculator.calc() );
		
	//■■■■■■■■■■■■■■■■■■■■■■■■	
		ModCalculator modRef = new ModCalculator();
		modRef = new ModCalculator();
		System.out.println("2222 : " + modRef.calc());
	//■■■■■■■■■■■■■■■■■■■■■■■■	
		/* ModCalculator는 NewCalculator를 상속받았음
		 * ModCalculator class의 참조변수에 생성자를 이용하여 객체를 생성하여 대입해줌
		 * 
		 */
		
		// 이것이 상속임~!
		// 23, "*", 40를 대입하면 오류가 남
		/* 왜? → 생성자는 아무 생성자도 정의하지 않는 경우
		 * 컴파일러가 기본 생성자를 정의해줌
		 * 
		 * 생성자가 하나 이상 존재하는 경우
		 * 컴파일러는 기본 생성자를 정의하지 않음
		 */
		
//		SubGugudan test = new SubGugudan();
//		System.out.println(test.printfrom(2));
//		
		
	}
	
	
}

