package kr.brain.api;

import java.text.SimpleDateFormat;
import java.util.*;

public class CarExample {
	public static void main(String[] args)/*throws classNotException*/{
		//Exception유형의 예외가 발생하면 호출한 메소드로 전달해라

//=================================================================//
		Class clazz = Car.class;

//=================================================================//
		Date date = new Date();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일");
		System.out.println(sdf.format(date));  // 오늘의 날짜를 가져옴
		
		
//		Class 참조변수 = 다른클래스명.class;
		System.out.println(clazz.getPackageName() + "." + clazz.getSimpleName());
		// getPackaeName 패키지 이름 그 자체를 가져옴
		// getSimpleName : class이름 그 자체를 가져옴
		// getName : 패키지.클래스 전체를 가져옴
		
		try {
			Class clazz1 = Class.forName("kr.brain.api.Car");
			System.out.println(clazz1.getPackageName());
		}
		catch (Exception classNotException) {
			// TODO: handle exception
		}{
			System.out.println("오류");			
		}
	
//=================================================================//
		// Calendar는 추상클래스 입니당
		Calendar rightNow = Calendar.getInstance();
		System.out.println(rightNow.DAY_OF_MONTH);
		System.out.println(rightNow.get(Calendar.YEAR));
		//Calendar객체에 rightNow라는 참조변수를 이용하여 get이라는 메소드를 이용해 연도값을 가져오세요.
		
//===== ENUM =====================================================//
		int dow = rightNow.get(Calendar.DAY_OF_WEEK);
		Week today = null;
		for(Week w : Week.values())
			System.out.println(w);
		//순차적으로 가져옴 
		
		// 주간 위치를 인덱스로 나타냄
		// 일요일:0 → 목요일:5
		switch (dow) {
		case 1: today = Week.SUNDAY; break;
		case 2: today = Week.MONDAY; break;
		case 3: today = Week.TUESDAY; break;
		case 4: today = Week.WEDNESDAY; break;
		case 5: today = Week.THURSDAY; break;
		case 6: today = Week.FRIDAY; break;
		case 7: today = Week.SATURDAY; break;
		}
		
		System.out.println(dow + "는 " + today);
		
		
		
		
	}
}