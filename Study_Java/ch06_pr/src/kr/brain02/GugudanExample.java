package kr.brain02;

public class GugudanExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Gugudan gugudan = new Gugudan(2);
//		gugudan.printOne(3);
		gugudan.printSTED(6, 7);
	
		/* 클래스를 정의하고, 클래스의 생성자를 호출하여 객체를 생성하고
		 * gugudan 참조변수에 할당
		 * 
		 * 참조변수도 참조하는 클래스와 같은 유형(상위클래스 형)
		 */
		System.out.println("■■■■■■■■■■■■■");
		SubGugudan subgugudan = new SubGugudan(2);
		System.out.println("■■■■■■ Down ■■■■■■■");
		subgugudan.printFrom(6, "down");
		System.out.println("■■■■■■■ UP ■■■■■■");
		subgugudan.printFrom(6, "up");
		
		
	}

}
