package kr.brain.api;

public class APIExample {

	public static void main(String[] args) {
			
    // ● 문자열의 비교(값 자체) / 객체의 비교(참조하는 객체)
		Overriding over = new Overriding();
//5교시 
		Class over2 = Overriding.class;
		Class over3 = over.getClass();
//		(Overriding) over2 = Class.forName("kr.brain.api.Overriding");
		// Class 참조변수 = 클래스 이름.class
		
		
		
		// String
		String s1 = new String("비지니스 분석가");
		String s2 = new String("비지니스 분석가");
//		String s1 = "비지니스 분석가";
//		String s2 = "비지니스 분석가";
		System.out.println(s1.hashCode()); // 같음
		System.out.println(s2.hashCode()); 
		/* new로 만들면 새로운 객체가 만들어짐. 동일하다고 해도
		 * new String을 빼면 동일한 객체를 공유함(링크를 줘서)
		 */
		if(s1 == s2)// 두 참조변수가 참조하는 객체는 같은가?
			System.out.println("true");
		else
			System.out.println("false");
		
		// Object
		over.testEquals(s1, s2);
		Object o1 = new Object();
		Object o2 = new Object();
		over.testEquals(o1, o2);
		System.out.println(o1.hashCode()); // 다름
		System.out.println(o2.hashCode()); // 다른 객체 참조함
		System.out.println(o1.toString()); // 다름
		System.out.println(o2.toString()); // 다른 객체 참조함
		if(o1 == o2)// 두 참조변수가 참조하는 객체는 같은가?
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
		if(i1 == i2)// 두 참조변수가 참조하는 객체는 같은가?
			System.out.println("true");
		else
			System.out.println("false");
		
		
		
//		// shift 연산은 비트단위 연산
//		// 128을 비트패턴으로 1000 0000 왼쪽으로 세번밀기
//		//                    0001 0000 10진수로 16 
//		// 1번 오른쪽으로 밀 때마다 2로 나누는 효과
//		System.out.println(Integer.toBinaryString(128));
//		System.out.println(128 >> 3);
//		System.out.println(128 << 3);
		
	}

}
