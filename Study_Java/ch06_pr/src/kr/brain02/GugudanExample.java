package kr.brain02;

public class GugudanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gugudan gugudan = new Gugudan(2);
//		gugudan.printOne(3);
		gugudan.printSTED(6, 7);
	
		/* Ŭ������ �����ϰ�, Ŭ������ �����ڸ� ȣ���Ͽ� ��ü�� �����ϰ�
		 * gugudan ���������� �Ҵ�
		 * 
		 * ���������� �����ϴ� Ŭ������ ���� ����(����Ŭ���� ��)
		 */
		System.out.println("��������������");
		SubGugudan subgugudan = new SubGugudan(2);
		System.out.println("������� Down ��������");
		subgugudan.printFrom(6, "down");
		System.out.println("�������� UP �������");
		subgugudan.printFrom(6, "up");
		
		
	}

}