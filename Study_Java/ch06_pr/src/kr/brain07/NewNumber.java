package kr.brain07;

//import java.lang.Number;

public class NewNumber extends Number{

	// ���ʱ�ȭ �ڵ�
	private int value;
	
	public NewNumber(int i) {
		value = i;
	}
	
	// �� Overriding
	public short shortValue() {
		return (short) (value*2);
	}
	
	// �� Overriding
	public byte byteValue() {
		System.out.println("���� ��� : " + super.byteValue());
		// �� super.�߻�޼ҵ�() : ParentŬ�������� �ش� �޼ҵ带 ������
		System.out.print("������ ��� : ");
		return (byte) (value * 2);
	}
	
	@Override // �������̵� �ϰڴ� �����Ͽ��� �˷��ִ� ����
	public int intValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public long longValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public float floatValue() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public double doubleValue() {
		// TODO Auto-generated method stub
		return 0;
	}
	//�߻� Ŭ������ ��� ����
	// Ŭ������ �ٸ����� ���� �������� ���� �̿ϼ�ǰ�� ���� �κ��� ����ڿ��� �ðܵ�
	// �߻�޼ҵ� : abstract ������ �޼ҵ� ������ ���� �޼ҵ�
	// ���� ��ӹ޴� Ŭ�������� �����ؾ� ���� �����ϴ� ����
	// Ŭ������ ��� �޼ҵ尡 ������ ����
	
	
}