package kr.brain.api;

public class Overriding {
	public void testEquals(Object o1, Object o2) {
		if(o1 instanceof String && o2 instanceof String) {
			// Object���� �񱳴� ���� ��ü��?
			if(((String) o1).equals((String) o2)) {
				System.out.println("�� ���ڿ��� ���� ����.");
			}
			else
				System.out.println("�� ���ڿ��� ���� �ٸ���.");
		}
		else {
			// ���� �ƴ� "���� ��ü����" Ȯ���Ѵ�.
			if(o1.equals(o2)) {
				System.out.println("�����ϴ� ��ü�� ����.");
			}
			else
				System.out.println("�����ϴ� ��ü�� �ٸ���.");
		}
		
		// �� Object�� ��ӹ��� Integer�� equals�� "������(Overriding)"�ϰ� ����.
		// 
	}

}