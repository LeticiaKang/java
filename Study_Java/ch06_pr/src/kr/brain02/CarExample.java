package kr.brain02;

public class CarExample {

	String programName = "CarExample";
	
	public static void main(String[] args) {

//		String str = "�����ڵ���";
//		System.out.println(str.charAt(3));
		
		Car car = new Car();
//		car.MODEL = "�ý�";
		
		car.setGas("60L");
		System.out.println("���� ���� : " + car.getGas() + "\n===============");
		//��gas�� private�� ������ ���ϴµ� setGas�� �̿��� ������ �� ����
		
		car.run(200);
		System.out.println("���� ���� : " + car.getGas() + "\n===============");
		
		car.setGas("20L");
		System.out.println("���� ���� : " + car.getGas() + "\n===============");
		
		car.setGas("50L");
		System.out.println("���� ���� : " + car.getGas() + "\n===============");
		
		
		
	}

}