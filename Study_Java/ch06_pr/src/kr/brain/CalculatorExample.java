package kr.brain;

import kr.brain02.Gugudan;
import kr.brain02.GugudanExample;
import kr.brain02.SubGugudan;

public class CalculatorExample {
	private int operand1;
	private int operand2;
	private String operator;
	
	public static void main(String[] args) {
		// �⺻ ������(�Ű������� ����)�� ȣ���Ͽ� ��ü ����
		/* �� �� Calculator�� Class�̸�
		 * �ڿ� �ִ� �� �ż���
		 */
		Gugudan.printOne(2);
//		Gugudan.printFrom(2); //�����޼ҵ尡 �ƴ϶� ������
		// ��ü�� ���µ� printone�� �޸𸮿� ����
		
		NewCalculator calculator = new NewCalculator();
		//		 ��������(stack)	   ��ü(heap) ����
		System.out.println( calculator.calc() );
		
		calculator = new NewCalculator(23, "*", 40);
		System.out.println("1111 : " + calculator.calc() );
		
	//�������������������������	
		ModCalculator modRef = new ModCalculator();
		modRef = new ModCalculator();
		System.out.println("2222 : " + modRef.calc());
	//�������������������������	
		/* ModCalculator�� NewCalculator�� ��ӹ޾���
		 * ModCalculator class�� ���������� �����ڸ� �̿��Ͽ� ��ü�� �����Ͽ� ��������
		 * 
		 */
		
		// �̰��� �����~!
		// 23, "*", 40�� �����ϸ� ������ ��
		/* ��? �� �����ڴ� �ƹ� �����ڵ� �������� �ʴ� ���
		 * �����Ϸ��� �⺻ �����ڸ� ��������
		 * 
		 * �����ڰ� �ϳ� �̻� �����ϴ� ���
		 * �����Ϸ��� �⺻ �����ڸ� �������� ����
		 */
		
//		SubGugudan test = new SubGugudan();
//		System.out.println(test.printfrom(2));
//		
		
	}
	
	
}
