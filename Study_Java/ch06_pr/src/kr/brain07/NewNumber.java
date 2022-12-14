package kr.brain07;

//import java.lang.Number;

public class NewNumber extends Number{

	// ▶초기화 코드
	private int value;
	
	public NewNumber(int i) {
		value = i;
	}
	
	// ▶ Overriding
	public short shortValue() {
		return (short) (value*2);
	}
	
	// ▶ Overriding
	public byte byteValue() {
		System.out.println("원래 결과 : " + super.byteValue());
		// ■ super.추상메소드() : Parent클래스에서 해당 메소드를 가져옴
		System.out.print("재정의 결과 : ");
		return (byte) (value * 2);
	}
	
	@Override // 오버라이드 하겠다 컴파일에게 알려주는 정보
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
	//추상 클래스를 상속 받음
	// 클래스와 다른점은 아직 구현되지 않은 미완성품에 대해 부분을 사용자에게 맡겨둠
	// 추상메소드 : abstract 예약어와 메소드 선언만을 갖는 메소드
	// 향후 상속받는 클래스에서 구현해야 함을 명시하는 역할
	// 클래스는 모든 메소드가 구현된 상태
	
	
}
