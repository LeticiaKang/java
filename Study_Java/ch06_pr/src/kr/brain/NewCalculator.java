package kr.brain;

public class NewCalculator {

	// 10 + 20 ; 10, 20�� �ǿ�����, +�� ������
	public int operand1;
	public int operand2;
	public String operator;
	
	// Constructor : ��ü �ʱ�ȭ
	public NewCalculator() { //�⺻(dedfault) ������
		this(10, "+", 20);
		// NewCalculator�� ȣ���ϸ� �Ʒ��� �ִ� �����ڸ� �ҷ��ͼ� ����
		
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
		// result : ��������
		int result = 0;
		
		// operand1 .... : �ν��Ͻ�����
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