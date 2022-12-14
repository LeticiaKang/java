package kr.brain02;
//▶ 책 페이지 : 256
public class Car {
  
	//▶ 2개의 인스턴스 멤버 필드, 4개의 인터페이스 메소드
	public static final String MODEL = "소방차";       //▶ field
	private int gas;   //▶ field
	
	// setter, getter Method
	//▶ Method "setGet"
	void setGas(String gasString) {
		
		int gas;
		
		if (gasString.indexOf('L') == gasString.length()-1 ) {
			gasString = gasString.replace("L", "");
		}
		else if (gasString.indexOf('l') == gasString.length()-1){
				gasString = gasString.replace("l", "");
		}
		else {
			System.out.println("L 또는 l로 입력하세요!!");
		}
			gas = Integer.parseInt(gasString);
		
			
			
		// 가스를 0과 60사이 주입하면 반환 , 가스를 60이상이면 경고문
		int leftGas = this.gas + gas;
		if (leftGas >= 0 & leftGas <= 60) {
			this.gas = leftGas;
			System.out.printf("가스를 %dL주유합니다!\n", gas);
		}
		else if(leftGas > 60) {
			System.out.printf("최대 양은 60L입니다. %dL만 주유합니다!\n", (60-this.gas));
			this.gas = 60;
		}
	}
	
	
	
	//▶Method "getGas"
	int getGas() {
		return gas;
	}
	
	
	
	//▶ Method "isLeftGas"	
	boolean isLeftGas() {
		boolean isLeft = true;
		
		if (gas == 0) {
			System.out.print("가스없음\n");
			isLeft = false;
		}else if(gas > 0 & gas < 5) {
			System.out.println("가스 부족!! 주유 바람!! 잔량 : " + gas + "L");
		}
		else 
			System.out.print("가스있음\n");
		return isLeft;
	}

	
	
	
	//▶ Method "run"
	void run(int run) {
		
		// 20km마다 1L씩 감소 = km당 0.05L감소
		
		while(true) {
			if (gas > 10) {
//				gas = (int) (gas - 0.05 * run);
				System.out.println(run + "Km를 달립니다. gas 잔량 (" + gas + ")");
				gas -= 1;
			}else {
				System.out.println("멈춥니다. gas 잔량 (" + gas + ")");
				break;
			}
		}
	}
}
