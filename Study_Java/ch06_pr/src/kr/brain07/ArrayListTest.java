package kr.brain07;

public class ArrayListTest {
	
	public static void main(String[] args) {
		
		ArrayListExt<String> ale = new ArrayListExt<String>();
		ArrayListExt<StringBuffer> ale000 = new ArrayListExt<StringBuffer>();
		// ArrayList는 배열형태로 데이터를 저장하는데
		// String형태만 저장한다!
		// StringBuffer : 객체를 생성하는방식이 좀 달라
		
//		ale000.add(new String("고객"));
		
//		Integer s = (Integer) 100; 
		// 형변환. 원래는 이렇게 해야하지만 추가된 기능이 아래와 같음. 컴파일러 버전이 낮을 경우 이렇게 해야하는 경우가 있음.
		
		Integer s = 16; 
		// s는 implicit type conversion Integer 클래스형 변수 
		//오토박싱(원시타임 -> 래퍼클래스의 객체(byte.short,long...)
		int j = 50;
		System.out.println(Integer.toBinaryString(s));
		//100을 이진수로 바꿔줌
		
		String name = new String("이름");
		ale.add(new String("고객")); 
		ale.add("경험");
		ale.add("데이터를");
		ale.add("활용한");
		ale.add("데이터");
		ale.add("경험");
		ale.add("분석가 과정");
		
		// for문 : 반복수가 정해진 경우, 순차 접근이 가능한 경우, 
//		for (int x = 0; x < ale.size(); x+=2) 
//			System.err.print(ale.get(x));
//		
//		System.out.println("");
//		// ale에 저장한 문자열이 있는데 첫번째부터 끝까지 가져옴
//		// collection 즉 집합 객체만 이렇게 사용할 수 있음
//		// for-each statement : collection 객체의 순차 접근
//		for (String x: ale)  
//			System.out.print(x);
//		
//		ale.printHello();
//		ale.add();
//		ale.add("가나다");
//		for (String x: ale)  
//			System.out.print(x + " ");
		
		System.out.println(ale.lastIndexOf("경험"));
		
	}
	
	
}
