package kr.brain.api;

public class APIExample {

	public static void main(String[] args) {
			
    // �� ���ڿ��� ��(�� ��ü) / ��ü�� ��(�����ϴ� ��ü)
		Overriding over = new Overriding();
//5���� 
		Class over2 = Overriding.class;
		Class over3 = over.getClass();
//		(Overriding) over2 = Class.forName("kr.brain.api.Overriding");
		// Class �������� = Ŭ���� �̸�.class
		
		
		
		// String
		String s1 = new String("�����Ͻ� �м���");
		String s2 = new String("�����Ͻ� �м���");
//		String s1 = "�����Ͻ� �м���";
//		String s2 = "�����Ͻ� �м���";
		System.out.println(s1.hashCode()); // ����
		System.out.println(s2.hashCode()); 
		/* new�� ����� ���ο� ��ü�� �������. �����ϴٰ� �ص�
		 * new String�� ���� ������ ��ü�� ������(��ũ�� �༭)
		 */
		if(s1 == s2)// �� ���������� �����ϴ� ��ü�� ������?
			System.out.println("true");
		else
			System.out.println("false");
		
		// Object
		over.testEquals(s1, s2);
		Object o1 = new Object();
		Object o2 = new Object();
		over.testEquals(o1, o2);
		System.out.println(o1.hashCode()); // �ٸ�
		System.out.println(o2.hashCode()); // �ٸ� ��ü ������
		System.out.println(o1.toString()); // �ٸ�
		System.out.println(o2.toString()); // �ٸ� ��ü ������
		if(o1 == o2)// �� ���������� �����ϴ� ��ü�� ������?
			System.out.println("true");
		else
			System.out.println("false");
		
		
		// Integer
		Integer i1 = new Integer(100);
		Integer i2 = new Integer(100);
//		Integer i1 = Integer.valueOf(100);
//		Integer i2 = Integer.valueOf(100);
//		Integer i1 = 100;
//		Integer i2 = 100;
		System.out.println(i1.hashCode());
		System.out.println(i2.hashCode()); 
		if(i1 == i2)// �� ���������� �����ϴ� ��ü�� ������?
			System.out.println("true");
		else
			System.out.println("false");
		
		
		
//		// shift ������ ��Ʈ���� ����
//		// 128�� ��Ʈ�������� 1000 0000 �������� �����б�
//		//                    0001 0000 10������ 16 
//		// 1�� ���������� �� ������ 2�� ������ ȿ��
//		System.out.println(Integer.toBinaryString(128));
//		System.out.println(128 >> 3);
//		System.out.println(128 << 3);
		
	}

}