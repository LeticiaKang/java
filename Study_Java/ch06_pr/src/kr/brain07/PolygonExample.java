package kr.brain07;
import java.util.*;
public class PolygonExample {
	// 매개변수 배열을 사용하면 매개변수 개수를 가변적으로 사용할 수 있음
	public static void main(String[] args) {
		
		ArrayList<Polygon> arrPoly = new ArrayList<>();
		
		Polygon poly = new Triangle(50, 20);
//		Object poly = new Triangle(50, 20);  // 오류 안남 : object는 모든 클래스의 뿌리
		// Object는 모든 클래스에서 상속받아서 표현을 안할 뿐
		// 상속 받은 애들끼리 뭔가 해야할 때 Polygon관점으로
		
//		System.out.println("넓이 : " + poly.evaluate());
		arrPoly.add(poly);
		
		poly = new Rectangle(80);
//		System.out.println("넓이 : " + poly.evaluate());
		arrPoly.add(poly);
		
		poly = new Square(20,30);
//		System.out.println("넓이 : " + poly.evaluate());
		arrPoly.add(poly);
		
		poly = new Trapezoid(50, 80, 60);
//		System.out.println("넓이 : " + poly.evaluate());
		arrPoly.add(poly);
		
		for (Polygon p : arrPoly){	
			whoIs(p);
			// 매개변수 다형성 whoIs 메소드는 p에 따라서 출력
		}
		
		String sRef = "Hello";
		String sRef2 = "TEST";
		Integer iRef = Integer.valueOf(100); // Wrapper Class
		Integer iRef2 = 30; // AutoBoxing(Integer가 숨어있음)
		iRef = iRef2;

//		Object o = String.valueOf(iRef);   
		Object o = iRef;   
//		Object o = sRef2;   
		/* iRef는 Integer를 객체로 가짐
		 * 근데 Object와 상속관계니까, 자동으로 형변환을 해줬어
		 */
//		if(o instanceof String) {
		// o 가 String으로부터 온 객체야? false => 실행이 안됨
		sRef = (String) o;
		// iRef를 강제로 형변환한 참조변수를 다시 String으로 형변환함
		
		sRef.substring(3); 
//		System.out.println(sRef.substring(3)); 
		// 타입을 확인하지 않고 강제 변환을 했을 경우 오류 발생
//		}
	}
	
	
		public static void whoIs(Polygon p) {
			// 어떤 클래스로부터 온 객체를 참조하는지 체크함 ( instanceof )
			if (p instanceof Triangle)
				System.out.println("삼각형 넓이는 : " + p.evaluate());
			else if (p instanceof Rectangle)
				System.out.println("정사각형 넓이는 : " + p.evaluate());
			else if (p instanceof Trapezoid)
				System.out.println("사다리꼴 넓이는 : " + p.evaluate());
			else if (p instanceof Square)
				System.out.println("사각형 넓이는 : " + p.evaluate());
			else;
		}
 
// ===========================================================================//
		
//		ArrayList<Object> arrOb = new ArrayList<>();
//		
//		Object ob = new Triangle(50, 20);
//		// String은 오류가 남
//		// 왜? 상속관계가 아니라서
//		
//		arrOb.add(poly);
//		
//		poly = new Rectangle(80);
//		arrOb.add(poly);
//		
//		poly = new Trapezoid(50, 80, 60);
//		arrOb.add(poly);
//		
//		for (Object p : arrOb) {
//			if ( p instanceof Triangle)
//			System.out.println("넓이는 : " + ((Polygon) p).evaluate());
//			 // upcast 된 거

	}

