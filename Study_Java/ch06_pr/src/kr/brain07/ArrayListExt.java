package kr.brain07;


// 현재 같은 패키지 안에 있거나 java.lang패키지 안에 있는 거 말고는 import가 필요함 
// 원래는 String도 써야 하지만 java.lang에 있어서 안써도 되는거야
import java.util.ArrayList;


// JCF : Java Collection Framework
// 이해하기 위해 상속, ,추상클래스, 인터페이스, 제너릭(Generics)을 알아야 가능
public class ArrayListExt<T> extends ArrayList<T>{
	
	public void printHello() { 
		System.out.println("클래스, 객체, 상속은 어렵다");
	}
	
	public boolean add() {
		System.out.println("재정의 결과 : 자바프로그래밍");
		return true;
	}
	
	public int lastIndexOf(Object o) {
		System.out.println("재정의 전 : " + super.lastIndexOf(o));
		System.out.print("재정의 후 : ");
		return 100;
	}
	
	
	
}
