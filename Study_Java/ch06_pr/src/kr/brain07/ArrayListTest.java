package kr.brain07;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayListExt<String> ale = new ArrayListExt<String>();
		ArrayListExt<StringBuffer> ale000 = new ArrayListExt<StringBuffer>();
		// ArrayList�� �迭���·� �����͸� �����ϴµ�
		// String���¸� �����Ѵ�!
		// StringBuffer : ��ü�� �����ϴ¹���� �� �޶�
		
//		ale000.add(new String("����"));
		
//		Integer s = (Integer) 100; 
		// ����ȯ. ������ �̷��� �ؾ������� �߰��� ����� �Ʒ��� ����. �����Ϸ� ������ ���� ��� �̷��� �ؾ��ϴ� ��찡 ����.
		
		Integer s = 16; 
		// s�� implicit type conversion Integer Ŭ������ ���� 
		//����ڽ�(����Ÿ�� -> ����Ŭ������ ��ü(byte.short,long...)
		int j = 50;
		System.out.println(Integer.toBinaryString(s));
		//100�� �������� �ٲ���
		
		String name = new String("�̸�");
		ale.add(new String("����")); 
		ale.add("����");
		ale.add("�����͸�");
		ale.add("Ȱ����");
		ale.add("������");
		ale.add("����");
		ale.add("�м��� ����");
		
		// for�� : �ݺ����� ������ ���, ���� ������ ������ ���, 
//		for (int x = 0; x < ale.size(); x+=2) 
//			System.err.print(ale.get(x));
//		
//		System.out.println("");
//		// ale�� ������ ���ڿ��� �ִµ� ù��°���� ������ ������
//		// collection �� ���� ��ü�� �̷��� ����� �� ����
//		// for-each statement : collection ��ü�� ���� ����
//		for (String x: ale)  
//			System.out.print(x);
//		
//		ale.printHello();
//		ale.add();
//		ale.add("������");
//		for (String x: ale)  
//			System.out.print(x + " ");
		
		System.out.println(ale.lastIndexOf("����"));
		
	}
	
	
}