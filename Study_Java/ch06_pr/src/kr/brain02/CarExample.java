package kr.brain02;

public class CarExample {

	String programName = "CarExample";
	
	public static void main(String[] args) {

//		String str = "현대자동차";
//		System.out.println(str.charAt(3));
		
		Car car = new Car();
//		car.MODEL = "택시";
		
		car.setGas("60L");
		System.out.println("현재 가스 : " + car.getGas() + "\n===============");
		//▶gas는 private라 접근을 못하는데 setGas를 이용해 접근할 수 있음
		
		car.run(200);
		System.out.println("현재 가스 : " + car.getGas() + "\n===============");
		
		car.setGas("20L");
		System.out.println("현재 가스 : " + car.getGas() + "\n===============");
		
		car.setGas("50L");
		System.out.println("현재 가스 : " + car.getGas() + "\n===============");
		
		
		
	}

}
