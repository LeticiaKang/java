package kr.brain;

public class NewCalculator {

	// 10 + 20 ; 10, 20은 피연산자, +는 연산자
	public int operand1;
	public int operand2;
	public String operator;
	
	// Constructor : 객체 초기화
	public NewCalculator() { //기본(dedfault) 생성자
		this(10, "+", 20);
		// NewCalculator를 호출하면 아래에 있는 생성자를 불러와서 적용
		
//		this.operand1 = 10;		
//		this.operand2 = 20;		
//		this.operator = "+";		
	}
	
	public NewCalculator(int o1, String op, int o2) {
		this.operand1 = o1;
		this.operand2 = o2;
		this.operator = op;
	}
	
	// custom method
	public int calc() {
		// result : 지역변수
		int result = 0;
		
		// operand1 .... : 인스턴스변수
		if (operator.equals("+"))
			result = operand1 + operand2;
		
		else if (operator.equals("-"))
			result = operand1 - operand2;
		
		else if (operator.equals("*"))
			result = operand1 * operand2;
		
		else if (operator.equals("/"))
			result = operand1 / operand2;
		
		return result;
		
		
	}
}
