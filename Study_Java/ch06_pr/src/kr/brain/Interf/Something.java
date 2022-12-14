package kr.brain.Interf;

public class Something {
	// 자바스크립트, C는 필드 따로 메소드 따로
	
	// ▼▼CLASS의 주요 특징▼▼
	// 캡슐화를 보여줌(encapsulation)
	// → 자료추상화(data abstraction)
	//    : 자료를 처리하기 위한 최소한의 정보만을 사용할 수 있도록 함
	//      세세한 부분을 몰라도 사용할 수  있게끔 하는 것(추상적으로 알려줌)
	// → 정보은닉(Information hiding)
	//    : private는 선언부만 노출 등 접근제한자만 가지고 정보노출 조절 가능
	
	// OOP의 주요 특징 : 캡슐화, 상속성, 다형성
	
	// 자료구조(Data Structure : 재료)
	private String title;
	private String content;
	private String writer;
	private String regDate;
	
	//자료구조를 활용하는 메소드 : 가공 & 연산
	public void printAllFields() {
		 System.out.println(title);
		 System.out.println(content);
		 System.out.println(writer);
	}
	
}
