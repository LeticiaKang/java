package kr.brain02;
//�� å ������ : 256
public class Car {
  
	//�� 2���� �ν��Ͻ� ��� �ʵ�, 4���� �������̽� �޼ҵ�
	public static final String MODEL = "�ҹ���";       //�� field
	private int gas;   //�� field
	
	// setter, getter Method
	//�� Method "setGet"
	void setGas(String gasString) {
		
		int gas;
		
		if (gasString.indexOf('L') == gasString.length()-1 ) {
			gasString = gasString.replace("L", "");
		}
		else if (gasString.indexOf('l') == gasString.length()-1){
				gasString = gasString.replace("l", "");
		}
		else {
			System.out.println("L �Ǵ� l�� �Է��ϼ���!!");
		}
			gas = Integer.parseInt(gasString);
		
			
			
		// ������ 0�� 60���� �����ϸ� ��ȯ , ������ 60�̻��̸� �����
		int leftGas = this.gas + gas;
		if (leftGas >= 0 & leftGas <= 60) {
			this.gas = leftGas;
			System.out.printf("������ %dL�����մϴ�!\n", gas);
		}
		else if(leftGas > 60) {
			System.out.printf("�ִ� ���� 60L�Դϴ�. %dL�� �����մϴ�!\n", (60-this.gas));
			this.gas = 60;
		}
	}
	
	
	
	//��Method "getGas"
	int getGas() {
		return gas;
	}
	
	
	
	//�� Method "isLeftGas"	
	boolean isLeftGas() {
		boolean isLeft = true;
		
		if (gas == 0) {
			System.out.print("��������\n");
			isLeft = false;
		}else if(gas > 0 & gas < 5) {
			System.out.println("���� ����!! ���� �ٶ�!! �ܷ� : " + gas + "L");
		}
		else 
			System.out.print("��������\n");
		return isLeft;
	}

	
	
	
	//�� Method "run"
	void run(int run) {
		
		// 20km���� 1L�� ���� = km�� 0.05L����
		
		while(true) {
			if (gas > 10) {
//				gas = (int) (gas - 0.05 * run);
				System.out.println(run + "Km�� �޸��ϴ�. gas �ܷ� (" + gas + ")");
				gas -= 1;
			}else {
				System.out.println("����ϴ�. gas �ܷ� (" + gas + ")");
				break;
			}
		}
	}
}